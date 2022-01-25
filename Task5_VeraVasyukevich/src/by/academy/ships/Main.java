package by.academy.ships;

import by.academy.ships.Cylinder;
import by.academy.ships.Cube;
import by.academy.ships.Cone;


public class Main {
    public static void main(String[] args) {


        Ship ship1 = new Ship(2, "SHIP1");

        Decks deck1 = new Decks(4);
        Decks deck2 = new Decks(2);
        Containers container1 = new Cube(1000, 20, 10);
        Containers container2 = new Cylinder(1000, 50, 20);
        Containers container3 = new Cone(2000, 50, 10);
        Containers container4 = new Cube(1000, 35, 20);
        Containers container5 = new Cube(2000, 47, 20);
        Containers container6 = new Cube(1000, 20, 10);

        deck2.addContainers(container1);
        deck2.addContainers(container2);
        deck1.addContainers(container3);
        deck1.addContainers(container4);
        deck1.addContainers(container5);
        deck1.addContainers(container6);
        ship1.setDeck(deck1);
        ship1.setDeck(deck2);

        System.out.println(ship1);

    }
}