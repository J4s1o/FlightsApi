package com.example.flightsapi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class FlightsController {
    private final FlightsService flightsService;
    public FlightsController(FlightsService flightsService) {
        this.flightsService = flightsService;
    }

    @GetMapping("/flight/{flightNumber}")
    public String getDataFromFlightNumber(Model model, @PathVariable String flightNumber){
        model.addAttribute("flight",flightsService.getDataFromFlightNumber(flightNumber));
        return "flightRadar";
    }
}
