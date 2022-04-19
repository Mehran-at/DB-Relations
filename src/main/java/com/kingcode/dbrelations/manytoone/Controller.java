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

//    @GetMapping("/addcity")
//    public City saveCitie() {
//        City city = new City();
//
//        city.setCityname("Vienna");
//        city.setId(10);
//        Country country = new Country();
//        country.setId(10L);
//        country.setCountryName("Austria");
//        Set<City> cities = new HashSet<>();
//        cities.add(city);
//        country.setCities(cities);
//        city.setCountry(country);
//
//        return service.save(city);
//    }

    @PostMapping("/add_city")
    public City saveCities(@RequestBody City city) {
        return service.save(city);
    }

    @GetMapping("/getcity/{id}")
    public Optional<City> getCitieById(@PathVariable Long id) {
        return service.getCityById(id);
    }
}
