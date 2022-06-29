package com.example.demo.controller;


import com.example.demo.model.Details;
import com.example.demo.service.State;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/state")
public class Stateontroller {

    @GetMapping("{state}")
    public Details getData(@PathVariable(value = "state") String stateName) {
        State state = new State();
        Details details = state.getData(stateName);
        return details;
    }

}



