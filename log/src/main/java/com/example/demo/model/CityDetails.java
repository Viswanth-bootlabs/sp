package com.example.demo.model;
import java.util.*;
import lombok.extern.log4j.Log4j;


@Log4j
public class CityDetails {
    public int poplation;
    public CityDetails(int poplation){
        this.poplation = poplation;
        log.info("hi hello");
    }

    public int getPoplation() {
        return poplation;
    }
}
