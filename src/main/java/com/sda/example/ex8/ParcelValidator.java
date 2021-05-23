package com.sda.example.ex8;

public class ParcelValidator implements Validator {

    public static final int MAX_DIMENSION_SUM = 300;
    public static final int MIN_SIDE_SIZE = 30;
    public static final float MAX_EXPRESS_WEIGHT = 15.0f;
    public static final float MAX_WEIGHT = 30.0f;

    @Override
    public boolean validate(Parcel input) {
        int x = input.getxLength();
        int y = input.getyLength();
        int z = input.getzLength();

        if (!checkDimension(x, y, z) || !checkEachSize(x, y, z) || !checkWeight(input.getWeight(), input.isExpress())) {
            System.out.println("Your Parcel does not match our requirements");
            return  false;
        }

        System.out.println("Parcel is ok");
        return true;
    }

    public boolean checkDimension(int x, int y, int z) {
        return (x + y + z) <= MAX_DIMENSION_SUM;
    }

    public boolean checkEachSize(int x, int y, int z) {
        return x >= MIN_SIDE_SIZE
                && y >= MIN_SIDE_SIZE
                && z >= MIN_SIDE_SIZE;
    }

    public boolean checkWeight(float weight, boolean isExpress) {
        if (isExpress) {
            return weight <= MAX_EXPRESS_WEIGHT;
        } else {
            return weight <= MAX_WEIGHT;
        }
    }
}
