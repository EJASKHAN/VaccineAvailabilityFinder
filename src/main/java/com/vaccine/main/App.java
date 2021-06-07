package com.vaccine.main;

import com.vaccine.service.TelegramService;
import com.vaccine.service.VaccineAvailability;
import com.vaccine.util.ApplicationConstants;

/**
 * @author: Ejaskhan
 * This file contains the source code for fetching the vaccine slots and
 * push the sorted slots to telegram groups
 */
public class App {
    public static void main(String[] args) {

        System.out.println(" Application started.........");
        while (true) {
            int count = 2;
            while (count > 0) {
                if (count == 1) {
                    TelegramService.sendMessage(VaccineAvailability.fetchAvailableVaccineSlots
                            (ApplicationConstants.KOLLAM), ApplicationConstants.KOLLAM);
                } else if (count == 2) {
                    TelegramService.sendMessage(VaccineAvailability.fetchAvailableVaccineSlots
                            (ApplicationConstants.KOTTAYAM), ApplicationConstants.KOTTAYAM);
                }
                count--;
            }
            try {
                Thread.sleep(180000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
