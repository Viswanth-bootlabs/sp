package com.example.demo.service;
import com.example.demo.model.Details;

import java.util.*;
public class State {
    static Map<String , Details> state = new HashMap<>();
    public static void storeData(){
        Details details = new Details("chennai",98765432);
        state.put("tamilnadu" , details);
        Details details1 = new Details("Bangalore" , 12345666);
        state.put("karnataka" , details1);
        Details details2 = new Details("Kochin" , 9086553);
        state.put("kerala" , details2);


    }
    public Details getData(String stateName){
        return state.get(stateName);
    }
}
