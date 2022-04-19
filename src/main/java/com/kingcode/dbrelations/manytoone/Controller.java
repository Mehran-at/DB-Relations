package com.kingcode.dbrelations.manytoone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class Controller {
    @Autowired
    CityService service;

    @GetMapping("/home")
    public String get() {
        return "Home Wel";
    }

    @PostMapping("/addcity")
    public City saveCities(@RequestBody City city) {
        return service.save(city);
    }

    @GetMapping("/getcity")
    public Optional<City> getCitieById(@PathVariable Long id) {
        return service.getCityById(id);
    }
}
