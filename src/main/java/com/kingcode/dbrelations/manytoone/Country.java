package com.kingcode.dbrelations.manytoone;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Table(name = "country")
public @Entity
class Country {
    @JsonIgnore
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name = "country_id")
    Set<City> cities;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id")
    private Long id;
    @Column(name = "country_name")
    private String countryName;
}