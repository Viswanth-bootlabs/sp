package com.example.demo.service;

import com.example.demo.model.CityDetails;

import java.util.HashMap;
import java.util.Map;

public class City {
    static Map<String , CityDetails> city = new HashMap<>();

    public static void cityData(){
        CityDetails cityDetails = new CityDetails(123445555);
        city.put("chennai",cityDetails);
        CityDetails cityDetails1 = new CityDetails(32134566);
        city.put("bangalure", cityDetails1);
        CityDetails cityDetails2 = new CityDetails(985743);
        city.put("kochin" , cityDetails2);
    }
    public CityDetails getData(String cityName){
        return city.get(cityName);
    }
}
