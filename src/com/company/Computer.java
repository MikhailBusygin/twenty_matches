package com.company;

public class Computer {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = switch (value % 4) {
            case 0 -> 3;
            case 3 -> 2;
            default -> 1;
        };
    }
}