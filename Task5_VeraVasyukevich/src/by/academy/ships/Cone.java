package by.academy.ships;

import by.academy.ships.Containers;

public class Cone extends Containers {
    public Cone(int dens, int height, int diagonal){
        super(dens, height, diagonal);
    }

    public Cone() {
        this(2000,50,10);
    }

    @Override
    public double weightInForm() {
        return (getDens() * 3.14 * Math.pow(getDiagonal() / 2, 2) * getHeight()) / 3;
    }

    @Override
    public String form() {
        return "Cone";
    }

}
