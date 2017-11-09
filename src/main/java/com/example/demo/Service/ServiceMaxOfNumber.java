package com.example.demo.Service;

import com.example.demo.DAO.DataService;

public class ServiceMaxOfNumber {

    DataService dataService;

    public ServiceMaxOfNumber(DataService dataService) {
        this.dataService = dataService;
    }

    public int findGreatestOfNumber() {
        int greatest = Integer.MIN_VALUE;
        int[] numbers = dataService.retrieveAllData();
        for (int number : numbers) {
            if (greatest < number) {
                greatest = number;
            }
        }
        return greatest;
    }
}
