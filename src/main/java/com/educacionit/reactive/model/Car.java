package com.educacionit.reactive.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Car {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private String model;
    private String registration;
    private Integer yearr;

    public Car(String brand, String model, String registration, Integer yearr) {
        this.brand = brand;
        this.model = model;
        this.registration = registration;
        this.yearr = yearr;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public Integer getYearr() {
        return yearr;
    }

    public void setYearr(Integer yearr) {
        this.yearr = yearr;
    }
}
