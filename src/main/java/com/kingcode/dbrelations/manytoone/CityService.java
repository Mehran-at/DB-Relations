package com.kingcode.dbrelations.manytoone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public @Service class CityService {
    @Autowired
    private CityRepo repo;

    City save(City city) {
        return repo.save(city);
    }

    List<City> getCities() {
        return repo.findAll();
    }

    Optional<City> getCityById(Long id) {
        return repo.findById(id);
    }
}
