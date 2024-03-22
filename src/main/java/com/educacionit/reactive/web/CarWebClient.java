package com.educacionit.reactive.web;

import com.educacionit.reactive.model.Car;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class CarWebClient {

    WebClient client = WebClient.create("http://localhost:8080");

    Mono<Car> carMono = client.get()
            .uri("/cars/{id}", "1")
            .retrieve()
            .bodyToMono(Car.class);

    carMono.subscribe(System.out::println);

    Flux<Car> carFlux = client.get()
            .uri("/cars")
            .retrieve()
            .bodyToFlux(Car.class);

    carFlux.subscribe(System.out::println);
}
