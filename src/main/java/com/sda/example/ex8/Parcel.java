package com.sda.example.ex8;

public class Parcel {

    private int xLength;
    private final int yLength;
    private final int zLength;
    private final float weight;
    private final boolean isExpress;

    private Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    public int getxLength() {
        return xLength;
    }

    public int getyLength() {
        return yLength;
    }

    public int getzLength() {
        return zLength;
    }

    public float getWeight() {
        return weight;
    }

    public boolean isExpress() {
        return isExpress;
    }

    public static class Builder {
        private int xLength;
        private int yLength;
        private int zLength;
        private float weight;
        private boolean isExpress;

        public Builder() {
        }

        public Builder setxLength(int xLength) {
            this.xLength = xLength;
            return this;
        }

        public Builder setyLength(int yLength) {
            this.yLength = yLength;
            return this;
        }

        public Builder setzLength(int zLength) {
            this.zLength = zLength;
            return this;
        }

        public Builder setWeight(float weight) {
            this.weight = weight;
            return this;
        }

        public Builder setExpress(boolean express) {
            isExpress = express;
            return this;
        }

        public Parcel build() {
            return new Parcel(
                    xLength,
                    yLength,
                    zLength,
                    weight,
                    isExpress
            );
        }
    }
}
