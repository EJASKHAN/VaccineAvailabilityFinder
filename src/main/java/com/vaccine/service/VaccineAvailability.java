package com.vaccine.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vaccine.model.AvailableSlots;
import com.vaccine.model.VaccineCenters;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Ejaskhan
 **/
public class VaccineAvailability {


    public static List<AvailableSlots> fetchAvailableVaccineSlots(String districtId) {

        List<AvailableSlots> availableSlotsList = new ArrayList<>();
        final ZonedDateTime now = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        //System.out.println("fetchAvailableVaccineSlots");
        OkHttpClient client = new OkHttpClient();
        ObjectMapper mapper = new ObjectMapper();
        VaccineCenters vaccineCenters = null;
        DateTimeFormatter indianDateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String date = now.format(indianDateFormatter);
        Response response = null;

        HttpUrl.Builder httpBuilder = HttpUrl
                .parse("https://cdn-api.co-vin.in/api/v2/appointment/sessions/public/calendarByDistrict")
                .newBuilder();

        httpBuilder.addQueryParameter("district_id", districtId);
        httpBuilder.addQueryParameter("date", date);

        Request request = new Request.Builder()
                .url(httpBuilder.build())
                .get()
                .addHeader("accept", "application/json")
                .addHeader("Accept-Language", "hi_IN")
                .addHeader("cache-control", "no-cache")
                //.addHeader("cache-control", "no-cache")
                .build();


        try {


            response = client.newCall(request).execute();
            if (response.isSuccessful()) {
                vaccineCenters = mapper.readValue(response.body().string(), VaccineCenters.class);
                vaccineCenters.getCenters().stream().forEach(center ->
                {
                    if (center.getSessions().stream().anyMatch
                            (session -> session.getAvailableCapacity() > 0)) {
                        AvailableSlots availableSlots = new AvailableSlots();
                        final int dos1_Qty = 0;
                        final int dos2_Qty = 0;
                        center.getSessions().stream().forEach(
                                session1 ->
                                {
                                    if (session1.getAvailableCapacity() > 0) {
                                        availableSlots.setAvailableDos1Qty(availableSlots.getAvailableDos1Qty()
                                                + session1.getAvailableCapacityDose1());
                                        availableSlots.setAvailableDos2Qty(availableSlots.getAvailableDos2Qty() +
                                                session1.getAvailableCapacityDose2());
                                        availableSlots.setAgeLimit(session1.getMinAgeLimit());

                                    }
                                });

                        availableSlots.setCentre(center.getAddress());
                        availableSlots.setPincode(center.getPincode());
                        availableSlots.setFeeType(center.getFeeType());
                        availableSlots.setDistrict(center.getDistrictName());

                        availableSlotsList.add(availableSlots);
                    }
                });
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            response.close();
            client.dispatcher().executorService().shutdown();
        }
        //System.out.println("Done fetching from COWIN.");
        return availableSlotsList.size() > 0 ? availableSlotsList.stream().
                sorted(Comparator.comparingInt(slot -> slot.getAgeLimit()))
                .collect(Collectors.toList()) : availableSlotsList;

    }

}
