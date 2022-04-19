package com.kingcode.dbrelations.manytoone;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Table(name = "city")
public @Entity
class City {
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "country_id", insertable = false, updatable = false)
    Country country;
    @Column(name = "country_id")
    private int country_id;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "city_id")
    private Long id;
    @Column(name = "city_name")
    private String cityName;
}
