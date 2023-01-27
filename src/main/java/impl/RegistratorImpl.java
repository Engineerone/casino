package impl;

import api.Registrator;
import api.User;
import java.util.Scanner;

import java.util.Scanner;

public class RegistratorImpl implements Registrator {

    @Override
    public User registerUser() {
        System.out.println("Привет, предствься: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        return new UserImpl(name);
    }
}
