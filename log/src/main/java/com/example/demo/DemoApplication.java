package com.example.demo;

import com.example.demo.service.City;
import com.example.demo.service.State;
import lombok.extern.log4j.Log4j;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
@Log4j
public class DemoApplication {

	public static void main(String[] args) {
		LogManager.getRootLogger().setLevel(Level.DEBUG);
		SpringApplication.run(DemoApplication.class, args);
		State.storeData();
		City.cityData();
		log.info("asas");
	}

}
