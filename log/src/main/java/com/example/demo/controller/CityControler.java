package com.example.demo.controller;

import com.example.demo.model.CityDetails;
import com.example.demo.model.Details;
import com.example.demo.service.City;
import com.example.demo.service.State;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.log4j.Log4j;


@RestController
@RequestMapping("/city")
@Log4j
public class CityControler {
    @GetMapping("{city}")
    public CityDetails getData(@PathVariable(value = "city") String cityName) {
        City city = new City();
        CityDetails cityDetails = city.getData(cityName);
        log.info("its controler");
        return cityDetails;
    }
}

