package impl;

import api.Game;
import api.User;
import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame implements Game {

    private static final int COUNT_OF_TRIES = 5;

    private final User user;

    public GuessNumberGame(User user) {
        this.user = user;
    }

    @Override
    public void play() {
        System.out.println("Сделайте ставку...");
        Scanner scanner = new Scanner(System.in);
        long bet = scanner.nextLong();
        System.out.println("Загаданное число, требуется угадаь за " + COUNT_OF_TRIES + " попыток...");
        Random random = new Random();
        int numberToGuess = random.nextInt(100);
        int currentTry = 0;
        while (true) {
            if (currentTry == COUNT_OF_TRIES) {
                System.out.println("Проигрыш! Вы исчерпали количество попытор. Было загадано" + numberToGuess);
                user.reduceMoney(bet);
                break;
            }
            System.out.println("введите свой вариант: ");
            int enterNumber = scanner.nextInt();
            if (enterNumber > numberToGuess) {
                System.out.println("Неправильно! введеное число меньше");
            } else if (enterNumber < numberToGuess) {
                System.out.println("Неправильно! введеное число больше");
            } else {
                System.out.println("Подаваляю!\nЧило угдано\nВы выиграли " + bet + " рублей");
                user.increaseMoney(bet);
                break;
            }
            currentTry++;
        }
    }
}
