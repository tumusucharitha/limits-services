package com.example.microservices.limitsservice.limitsModel;

public class Limits {
    private int min;
    private int max;

    protected Limits(){

    }
    public Limits(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public String toString() {
        return "LimitsConfiguration{" +
                "min=" + min +
                ", max=" + max +
                '}';
    }
}
