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

    @GetMapping("/addcity")
    public City saveCities() {
        City city = new City();
        Country country = new Country();

        city.setCityName("Vienna");
        city.setCountry(country);

        country.setCountryName("Austria");
        country.setId(1L);
        Set<City> cities = new HashSet<>();
        country.setCities(cities);

        cities.add(city);
        System.out.println("=========================");
        return service.save(city);
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
