package com.sda.example.ex32;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Car> cars = List.of(
                new Car("S457845", "Škoda"),
                new Car("SAS7115", "Volkswagen"),
                new Car("ERR0001", "Ferrari")
        );

        System.out.println(cars);
        System.out.println("Serializing to file");

        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("cars.bin")))  {
            os.writeObject(cars);
        } catch(IOException exception) {
            exception.printStackTrace();
        }


        List<Car> cars2 = null;

        System.out.println("Reading from file");
        try (ObjectInputStream is = new ObjectInputStream(new FileInputStream("cars.bin"))) {
            cars2 = (List<Car>) is.readObject();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException exception) {
            exception.printStackTrace();
        }

        System.out.println(cars2);
    }

}
