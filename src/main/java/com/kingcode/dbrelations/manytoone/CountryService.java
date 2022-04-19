package com.kingcode.dbrelations.manytoone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public @Service
class CountryService {
    @Autowired
    CountryRepo repo;

    Country save(Country country) {
        return repo.save(country);
    }
}
