package impl;

import api.User;

public class UserImpl implements User {

    private final static long START_MONEY_DEFAULT_VALUE = 1000;

    private String name;

    private long money;

    public UserImpl(String name) {
        this.name = name;
        this.money = START_MONEY_DEFAULT_VALUE;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public long getMoney() {
        return this.money;
    }

    @Override
    public void increaseMoney(long amount) {
        this.money += amount;
    }

    @Override
    public void reduceMoney(long amount) {
        this.money -= amount;
    }
}
