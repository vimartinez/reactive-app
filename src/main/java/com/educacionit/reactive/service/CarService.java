package com.educacionit.reactive.service;

import com.educacionit.reactive.model.Car;
import com.educacionit.reactive.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CarService {

    private final CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Flux<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Mono<Car> findCarById(Long id) {
        return carRepository.findById(id);
    }
}
