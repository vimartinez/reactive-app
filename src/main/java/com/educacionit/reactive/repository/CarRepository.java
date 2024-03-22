package com.educacionit.reactive.repository;

import com.educacionit.reactive.model.Car;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface CarRepository extends R2dbcRepository<Car, Long> {

}
