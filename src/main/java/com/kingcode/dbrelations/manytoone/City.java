package com.kingcode.dbrelations.manytoone;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;

@Getter
@Setter
@Table(name = "city")
public @Entity
class City {
    @JsonIgnore
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "country_id", insertable = false, updatable = false)
    private Country country;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "city_id")
    private Long id;
    @Column(name = "city_name")
    private String cityname;
}
