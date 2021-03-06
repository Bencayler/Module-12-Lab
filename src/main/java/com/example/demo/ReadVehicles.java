package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReadVehicles {

    private static final Logger log = LoggerFactory.getLogger(ReadVehicles.class);

    public static void main(String[] args) {
        SpringApplication.run(ReadVehicles.class);
    }


    @Bean
    public CommandLineRunner demo(VehicleRepository repository) {
        return (args) -> {
            // fetch all customers
            log.info("Customers found with findAll():");
            log.info("-------------------------------");
            for (Vehicle vehicle : repository.findAll()) {
                log.info(vehicle.toString());
            }
            log.info("");

            // fetch an individual customer by ID
            Vehicle vehicle = repository.findById(1L);
            log.info("Customer found with findById(1L):");
            log.info("--------------------------------");
            log.info(vehicle.toString());
            log.info("");

            // fetch customers by last name
            log.info("Customer found with findByLastName('Bauer'):");
            log.info("--------------------------------------------");
            repository.findByLastName("Bauer").forEach(bauer -> {
                log.info(bauer.toString());
            });
            log.info("");
        };
    }
}