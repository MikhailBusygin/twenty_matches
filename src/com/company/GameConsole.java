package com.company;

import java.util.Scanner;

public class GameConsole {
    private int playerValue;

    public void startGame() {
        System.out.println("Игра 20 спичек началась!\nУчастники выбирают от одной до трёх спичек.");
    }

    public void stepMessage(boolean computerStep) {
        if (computerStep) {
            System.out.println("  Ход компьютера.");
        } else {
            System.out.println("  Ход игрока.");
        }
    }

    public void setPlayerValue() {
        while (true) {
            System.out.print("  Количество выбранных игроком спичек: ");
            Scanner sc = new Scanner(System.in);
            try {
                playerValue = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException nfe) {
                nfe.fillInStackTrace();
            }
            if (playerValue > 0 && playerValue < 4) {
                break;
            } else {
                System.out.println("  Ошибка! Введите корректное количество спичек!");
            }
        }
    }

    public int getPlayerValue () {
        return playerValue;
    }

    public void printComputerValue(int computerValue) {
        System.out.println("  Количество выбранных компьютером спичек: " + computerValue);
    }

    public void printGameValue(int gameValue) {
        System.out.println("Спичек осталось: " + gameValue);
    }

    public void endGame(boolean computerStep) {
        if (computerStep) {
            System.out.println("Игрок выиграл!\nКонец игры.");
        } else {
            System.out.println("Компьютер выиграл!\nКонец игры.");
        }
    }
}