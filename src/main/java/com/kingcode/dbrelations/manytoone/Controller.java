package com.kingcode.dbrelations.manytoone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@RestController
public class Controller {
    @Autowired
    CityService service;

    @GetMapping("/home")
    public String get() {
        return "Home Wel";
    }

    @PostMapping("/add_city")
    public City saveCities(@RequestBody City city) {
        return service.save(city);
    }

    @GetMapping("/getcity/{id}")
    public Optional<City> getCitieById(@PathVariable Long id) {
        return service.getCityById(id);
    }
}
