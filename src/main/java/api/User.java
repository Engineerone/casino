package api;

public interface User {

    String getName();

    long getMoney();

    void increaseMoney(long amount);

    void reduceMoney(long amount);

}
