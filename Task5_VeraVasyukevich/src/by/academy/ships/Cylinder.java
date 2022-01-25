package by.academy.ships;

import by.academy.ships.Containers;

public class Cylinder extends Containers {
   public Cylinder (int dens, int height, int diagonal){
        super(dens, height, diagonal);
    }

    public Cylinder() {
        this(2000,50,10);
    }

    @Override
    public double weightInForm() {
        return getDens() * 3.14 * getHeight() * Math.pow(getDiagonal() / 2, 2);
    }

    @Override
    public String form() {
        return "Cylinder";
    }


}
