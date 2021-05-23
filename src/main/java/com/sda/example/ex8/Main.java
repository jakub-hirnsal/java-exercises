package com.sda.example.ex8;

public class Main {
    public static void main(String[] args) {
        ParcelValidator parcelValidator = new ParcelValidator();

        Parcel parcelThatShouldBeValid = new Parcel.Builder()
                .setxLength(40)
                .setyLength(50)
                .setzLength(60)
                .setWeight(12.0f)
                .setExpress(true)
                .build();

        Parcel invalidParcel = new Parcel.Builder()
                .setxLength(40)
                .setyLength(50)
                .setzLength(60)
                .setWeight(30.1f)
                .setExpress(true)
                .build();

        parcelValidator.validate(parcelThatShouldBeValid);
        parcelValidator.validate(invalidParcel);
    }
}

