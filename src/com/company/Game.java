package com.company;

public class Game {
    private final Computer computer;
    private final GameConsole console;
    private int gameValue = 20;
    private boolean computerStep;

    public Game(Computer computer, GameConsole console) {
        this.computer = computer;
        this.console = console;
    }

    public void playGame() {
        console.startGame();
        while (true) {
            console.printGameValue(gameValue);
            if (gameValue > 1) {
                console.stepMessage(true);
                computer.setValue(gameValue);
                gameValue -= computer.getValue();
                console.printComputerValue(computer.getValue());
            } else {
                computerStep = true;
                break;
            }
            console.printGameValue(gameValue);
            if (gameValue > 1) {
                console.stepMessage(false);
                console.setPlayerValue();
                gameValue -= console.getPlayerValue();
            } else {
                break;
            }
        }
        console.endGame(computerStep);
    }
}