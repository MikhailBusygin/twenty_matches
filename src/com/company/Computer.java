package com.company;

public class Computer {
    public int getComputerValue(int value) {
        int valueComputer = 0;
        switch (value % 4) {
            case 0:
                valueComputer = 3;
                break;
            case 3:
                valueComputer = 2;
                break;
            default:
                valueComputer = 1;
        }
        return valueComputer;
    }
}