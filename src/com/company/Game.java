package com.company;

public class Game {
    private int valueGame = 20;

    public int getGameValue() {
        return valueGame;
    }

    public void setValue(int value) {
        valueGame = valueGame - value;
    }
}