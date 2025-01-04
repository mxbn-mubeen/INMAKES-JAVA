package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.LocationStates;
import com.example.demo.services.CoronaVirusDataServices;
import com.example.demo.util.CountryCodeMapper;

@Controller
public class HomeController {

    @Autowired
    private CoronaVirusDataServices crnService;

    @GetMapping("/")
    public String home(Model model) {
        List<LocationStates> allstates = crnService.getAllstates();
        int totalDeathsReported = allstates.stream()
                .mapToInt(LocationStates::getLatestTotalDeaths)
                .sum();
        model.addAttribute("LocationStates", allstates);
        model.addAttribute("totalDeathsReported", totalDeathsReported);
        model.addAttribute("CountryCodeMapper", new CountryCodeMapper()); // Add mapper to model
        return "home";
    }
}
