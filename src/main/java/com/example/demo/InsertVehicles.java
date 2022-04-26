//package com.example.demo;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
//
//@SpringBootApplication
//public class InsertVehicles {
//
//    private static final Logger log = LoggerFactory.getLogger(InsertVehicles.class);
//
//    public static void main(String[] args) {
//        SpringApplication.run(InsertVehicles.class);
//    }
//
//    @Bean
//    public CommandLineRunner demo(VehicleRepository repository) {
//        return (args) -> {
//            // TODO: CHANGE consturctors
//            // save a few customers
//            repository.save(new Vehicle(1 ,"Toyota", 1300, 25000, 4 /*, null */));
//            repository.save(new Vehicle(2,"Aston Martin", 50, 100000, 2 /*, null */));
//            repository.save(new Vehicle(3,"Mercedes", 10000, 25000, 5 /*, null */));
//            repository.save(new Vehicle(4,"Subaru", 2000000, 25000, 5 /*, null */));
//            repository.save(new Vehicle(5,"Ferrari", 100 , 180000 , 2 /*, null */));
//        };
//    }
//}
