package com.vaccine.service;

import com.vaccine.model.AvailableSlots;
import com.vaccine.util.ApplicationConstants;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.List;

/**
 * @author Ejaskhan
 **/
public class TelegramService {

    public static void sendMessage(List<AvailableSlots> availableSlots, String district) {

        StringBuilder dos1Message = new StringBuilder();
        StringBuilder dos2Message = new StringBuilder();

        availableSlots.forEach(slots -> {
            if (slots.getAvailableDos1Qty() > 0) {
                dos1Message.append(slots.toStringDos1()+"+");
                dos1Message.append("\n\n");
            }
            if (slots.getAvailableDos2Qty() > 0) {
                dos2Message.append(slots.toString()+"+");
                dos2Message.append("\n\n");
            }
        });


        String url = district.equalsIgnoreCase(ApplicationConstants.KOLLAM) ?
                ApplicationConstants.KOLLAM_URL : ApplicationConstants.KOTTAYAM_URL;
        if (dos1Message.length() > 0) {
            dos1Message.append(ApplicationConstants.COWIN_URL);
            sendMessageInternal(district.equalsIgnoreCase(ApplicationConstants.KOLLAM) ?
                            ApplicationConstants.DOS1_KOLLAM : ApplicationConstants.DOS1_KOTTAYAM,
                    dos1Message.length() > 4094? dos1Message.substring(0,4094): dos1Message.toString(),
                    url);

        } else if (dos2Message.length() > 0) {

            dos2Message.append(ApplicationConstants.COWIN_URL);
            sendMessageInternal(district.equalsIgnoreCase(ApplicationConstants.KOLLAM) ?
                            ApplicationConstants.DOS2_KOLLAM : ApplicationConstants.DOS2_KOTTAYAM,
                    dos2Message.length() > 4094 ? dos2Message.substring(0,4094): dos2Message.toString(),
                    url);
        }

    }

    protected static void sendMessageInternal(String chatId, String text, String url) {

        Response response = null;
        OkHttpClient client = new OkHttpClient();

        HttpUrl.Builder httpBuilder = HttpUrl.parse(url).newBuilder();
        httpBuilder.addQueryParameter("chat_id", chatId);
        httpBuilder.addQueryParameter("text", text);

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
            /*if (response.isSuccessful()) {
                System.out.println(" Done sending to TELEGRAM");
            }*/
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            response.close();
            client.dispatcher().executorService().shutdown();
        }
    }
}
