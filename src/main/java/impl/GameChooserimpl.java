package impl;

import api.Game;
import api.GameChooser;
import api.User;

import java.util.Scanner;

public class GameChooserimpl implements GameChooser {

    @Override
    public Game chooseGame(User user) {
        System.out.println("Выберите игру:\n * Угадать число\n * Загадать число\n Ваш вариант:");
        Scanner scanner = new Scanner(System.in);
        String gameName = scanner.nextLine();
        if (gameName.equals("Угадать число")) {
            return new GuessNumberGame(user);
        } else if (gameName.equals("Загадать число")) {
            return new ThinkOfNumberGame(user);
        } else {
            System.out.println("Введено неккоректное название игры");
        }
        return null;
    }
}
