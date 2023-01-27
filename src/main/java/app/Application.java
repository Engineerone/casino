package app;

import api.Game;
import api.GameChooser;
import api.Registrator;
import api.User;
import impl.GameChooserimpl;
import impl.RegistratorImpl;

public class Application {

    public static void main(String[] args) {
        Registrator registrator = new RegistratorImpl();
        GameChooser gameChooser = new GameChooserimpl();
        User user = registrator.registerUser();
        do {
            Game game = gameChooser.chooseGame(user);
            game.play();
            System.out.println(user.getName() + "у тебя на счете" + user.getMoney());
        } while (isUserAvalableToPlay(user));


    }

    private static boolean isUserAvalableToPlay(User user) {
        return true;
    }

}
