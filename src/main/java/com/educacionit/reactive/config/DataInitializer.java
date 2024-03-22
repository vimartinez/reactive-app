package com.educacionit.reactive.config;

import com.educacionit.reactive.model.Car;
import com.educacionit.reactive.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;

@Configuration
public class DataInitializer {

    @Autowired
    private CarRepository carRepository;
    @Bean
    public CommandLineRunner initializeData() {
        return args -> {
            Flux<Car> cars = Flux.defer(() ->
                    Flux.just(
                            new Car("Ford", "Mustang", "AA-123456-AR", 2222),
                            new Car("Ford", "Focus", "AD-987654-AR", 2018),
                            new Car("VW", "Bora", "AA-666999-AR", 2010)
                    )
            );
            carRepository.saveAll(cars).subscribe();
        };
    }
}
