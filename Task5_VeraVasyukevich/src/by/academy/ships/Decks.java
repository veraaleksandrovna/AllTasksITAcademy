package by.academy.ships;
 import java.util.Arrays;

public class Decks {

    private int amount;
    private Containers[] containers;

    public Decks(int amount) {

        if (amount == 2 || amount == 4) {
            containers = new Containers[amount];
        }
    }

    public boolean addContainers(Containers container) {

        if (containers.length == amount || containers[amount] != null)
            return false;
        containers[amount++] = container;
        return true;
    }

}
