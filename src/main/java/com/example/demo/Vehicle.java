package com.example.demo;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
public class Vehicle {

    @Id
    // @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String manufacturerName;
    private int milesOnVehicle;
    private int price;
    private int numberOfSeats;
    @ElementCollection
    private ArrayList<Option> options;


    public Vehicle(long id, String manufacturerName, int milesOnVehicle, int price, int
            numberOfSeats, ArrayList<Option> options) {
        this.id = id;
        this.manufacturerName = manufacturerName;
        this.milesOnVehicle = milesOnVehicle;
        this.price = price;
        this.numberOfSeats = numberOfSeats;
        this.options = options;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }
    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }
    public int getMilesOnVehicle() {
        return milesOnVehicle;
    }
    public void setMilesOnVehicle(int milesOnVehicle) {
        this.milesOnVehicle = milesOnVehicle;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
    public Vehicle() {
        // NO ARG CONTRUCTOR
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ArrayList<Option> getOptions() {
        return options;
    }

    @Override
    public String toString() {
        return String.format(
                "Vehicle[manufacturerName=%d, milesOnVehicle='%s', price='%s']",
                manufacturerName, milesOnVehicle, price);
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
