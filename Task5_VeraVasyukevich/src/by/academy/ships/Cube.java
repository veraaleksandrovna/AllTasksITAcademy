package by.academy.ships;

public class Cube extends Containers {
    public Cube(int dens, int height, int diagonal){
        super(dens, height, diagonal);
    }
    public Cube (){

        this(1000,50,20);
    }
    @Override
    public double weightInForm () {
        return getDens() * Math.pow(getHeight(),3);
    }
    @Override
    public String form(){return "Cube";}
}
