package com.company;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Computer computer = new Computer();
        Console console = new Console();
        console.startGame();
        do {
            console.printGameValue(game.getGameValue());
            game.setValue(console.getComputerValue(computer.getComputerValue(game.getGameValue())));
            if (game.getGameValue() > 1) {
                console.printGameValue(game.getGameValue());
                game.setValue(console.getPlayerValue());
            } else {
                break;
            }
        } while (game.getGameValue() > 0);
        console.endGame();
    }
}