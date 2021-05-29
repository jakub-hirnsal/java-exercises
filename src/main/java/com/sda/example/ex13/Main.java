package com.sda.example.ex13;

import com.sda.example.ex12.Car;
import com.sda.example.ex12.EngineType;
import com.sda.example.ex12.Manufacturer;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Manufacturer skodaManufacturer = new Manufacturer("škoda", 1980, "CZ");

        CarService carService = new CarService();
        carService.add(Car.builder()
                .name("Superb")
                .engineType(EngineType.S4)
                .price(1200000)
                .yearOfManufacture(2019)
                .manufacturerList(List.of(skodaManufacturer))
                .build()
        );
        System.out.println(carService.getCarsByManufacturer(skodaManufacturer));

        System.out.println(carService.getCarsByManufacturerWithYearOfEstablishment(year -> year < 1999));
        System.out.println(carService.getCarsByManufacturerWithYearOfEstablishment(i -> i > 1999));
        System.out.println(carService.getCarsByManufacturerWithYearOfEstablishment(i -> i == 2010));
    }
}
