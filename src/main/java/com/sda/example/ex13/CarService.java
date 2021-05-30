package com.sda.example.ex13;

import com.sda.example.ex12.Car;
import com.sda.example.ex12.EngineType;
import com.sda.example.ex12.Manufacturer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CarService {

    public static final int YEAR_OF_MANUFACTURED = 1999;
    public static final int MANUFACTURES_COUNT = 3;
    private List<Car> cars;

    public CarService() {
        this.cars = new ArrayList<>();
    }

    public CarService add(Car car) {
        this.cars.add(car);
        return this;
    }

    public void remove(Car car) {
        this.cars.remove(car);
    }

    public List<Car> getAllCars() {
        return cars;
    }

    public List<Car> getV12Cars() {
        return this.cars.stream().parallel()
                .filter(car -> car.getEngineType().equals(EngineType.V12))
                .collect(Collectors.toList());
    }

    public List<Car> getCarsByEngineType(EngineType engineType) {
        return this.cars.stream().parallel()
                .filter(car -> car.getEngineType().equals(engineType))
                .collect(Collectors.toList());
    }

    public List<Car> getCarsBefore1999() {
        return this.cars.stream().parallel()
                .filter(car -> car.getYearOfManufacture() < YEAR_OF_MANUFACTURED)
                .collect(Collectors.toList());
    }

    public Car getMostExpensiveCar() {
        return this.cars.stream().parallel()
                .max((car1, car2) -> (int) (car1.getPrice() - car2.getPrice()))
                .orElseThrow();
    }

    public Car getCheapestCar() {
        return this.cars.stream().parallel()
                .min((car1, car2) -> (int) (car1.getPrice() - car2.getPrice()))
                .orElseThrow();
    }

    public Car getCarWith3Man() {
         return this.cars.stream().parallel()
                 .filter(car -> car.getManufacturerList().size() >= MANUFACTURES_COUNT)
                 .findFirst()
                 .orElseThrow();
    }

    public List<Car> getSortedCars(Order order) {
        Comparator<Car> carComparator;
        if (order.equals(Order.ASC)) {
            carComparator = Comparator.comparing(Car::getName);
        } else {
            carComparator = (car1, car2) -> car2.getName().compareTo(car1.getName());
        }

        return this.cars.stream()
                .sorted(carComparator)
                .collect(Collectors.toList());
    }

    public boolean contains(Car car) {
        return this.cars.contains(car);
    }

    public List<Car> getCarsByManufacturer(Manufacturer manufacturer) {
        return this.cars.stream()
                .filter(car -> car.getManufacturerList().contains(manufacturer))
                .collect(Collectors.toList());
    }

    public List<Car> getCarsByManufacturerWithYearOfEstablishment(IntPredicate predicate) {
        return this.cars.stream()
                .filter(car -> car.getManufacturerList()
                        .stream()
                        .anyMatch(manufacturer -> predicate.test(manufacturer.getYearOfEstablishment())))
                .collect(Collectors.toList());
    }


}


















