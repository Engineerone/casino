package impl;

import api.Game;
import api.User;

import java.util.Random;
import java.util.Scanner;

public class ThinkOfNumberGame implements Game {
    private static final int COUNT_OF_TRIES = 5;
    private int currenntMaxNumber = 100;
    private int currenntMinNumber = 0;
    private final User user;

    public ThinkOfNumberGame(User user) {
        this.user = user;
    }


    @Override
    public void play() {
        long bet = makeBet();
        String isUserReady = checkUserReady();
        Random random = new Random();
        int currentTry = 0;
        int numbetToGuesse = random.nextInt(100);
        if (guesseUser)
    }

    private boolean guesseUserNumbers(int numberTiGuesse, int currentTry) {
        if (checkCountTries(currentTry)) {
            System.out.println("Выигрыш! Программа исчерпалаколво поппыток...");
            return false;
        }
        System.out.println("Ваше число - " + numberTiGuesse + "Введите Да Больше меньше отчет");
        Scanner scanner = new Scanner(System.in);
        String userAnswer = scanner.nextLine();
        if (userAnswer.equalsIgnoreCase("да")) {
            System.out.println("проигрыш! Прорамма угадала число");
            return true;
        } else if (userAnswer.equalsIgnoreCase("больше")) {
            int newNumberTogues = (currenntMaxNumber -
        }
    }

    private String checkUserReady() {
        System.out.println("Загадайте число от 0 до 100 и вбейте Загадал:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private long makeBet() {
        System.out.println("Сделайте ставку...");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLong();
    }
}
