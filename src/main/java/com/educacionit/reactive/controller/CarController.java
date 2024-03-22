package com.educacionit.reactive.controller;

import com.educacionit.reactive.model.Car;
import com.educacionit.reactive.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping("/{id}")
    public Mono<Car> getCarById(@PathVariable Long id) {
        return carService.findCarById(id);
    }

    @GetMapping
    public Flux<Car> getAllCars() {
        return carService.getAllCars();
    }
}
