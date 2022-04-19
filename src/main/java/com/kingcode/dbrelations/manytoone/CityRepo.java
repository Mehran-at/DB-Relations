package com.kingcode.dbrelations.manytoone;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public @Repository
interface CityRepo extends JpaRepository<City, Long> {
}