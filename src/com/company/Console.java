package com.company;

import java.util.Scanner;

public class Console {

    public void startGame() {
        System.out.println("Игра 20 спичек.\nВыберите от одной до трёх спичек.");
    }

    public int getPlayerValue () {
        int valuePlayerHas = 0;
        do {
            int valuePlayer = 0;
            String valueInsideString = "";
            System.out.print(" - Ход игрока. Введите количество спичек: ");
            Scanner sc = new Scanner(System.in);
            valueInsideString = sc.nextLine().trim();
            if (!valueInsideString.equals("")) {
                try {
                    valuePlayer = Integer.parseInt(valueInsideString);
                    if (valuePlayer < 4 && valuePlayer != 0) {
                        valuePlayerHas = valuePlayer;
                    } else {
                        System.out.println("Больше трёх! Попробуйте снова.");
                    }
                } catch (NumberFormatException nfe) {
                    System.out.println("Это не похоже на целое число! Попробуйте снова.");
                    nfe.getCause();
                }
            } else {
                System.out.println("Пробелы или пустая строка! Попробуйте снова.");
            }
        } while (valuePlayerHas == 0);
        return valuePlayerHas;
    }

    public int getComputerValue(int value) {
        System.out.println(" - Количество выбранных компьютером спичек = " + value);
        return value;
    }

    public void printGameValue(int value) {
        System.out.println("На столе осталось " + value + " спичек.");
    }

    public void endGame() {
        System.out.println("Игрок проиграл!");
    }
}