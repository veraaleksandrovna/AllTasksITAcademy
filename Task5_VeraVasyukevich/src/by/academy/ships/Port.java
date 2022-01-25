package by.academy.ships;

public class Port {

    private Ship[] ships;
    private int count;

    public Port(int count) {
        this.ships = new Ship[count];
    }

    public boolean  add (Ship ship){
        for (int i = 0; i<count; i++) {
            ships[i]=ship;
            count++;
            return true;
        }
         return  false;
    }

}
