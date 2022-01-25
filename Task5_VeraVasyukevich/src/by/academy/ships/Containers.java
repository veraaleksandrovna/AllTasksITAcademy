package by.academy.ships;

public abstract class Containers implements Weight{
    public static final int  WATER_DENSITY1 = 1000;
    public static final int  WATER_DENSITY2 = 2000;


    private  String  dens;
    private String height;
    private String diagonal;

    public int getDens() {
        return Integer.parseInt(dens);
    }

    public void setDens(int dens) {
        String d = "";
        switch (dens){
            case WATER_DENSITY1:
                d="1000";
                break;
            case WATER_DENSITY2:
                d="2000";
                break;
        }
        this.dens=d;
    }

    public int getHeight() {
        return Integer.parseInt( height);
    }

    public void setHeight(int height) {
        String h ="";
        if(height>10&&height<100){
            h = Integer.toString(height);
        }
        this.height = h;
    }

    public int getDiagonal() {
        return Integer.parseInt(diagonal);
    }

    public void setDiagonal(int diagonal) {
        String d = "";
        switch(diagonal){
            case 10:
                d = "10";
                break;
            case 20:
                d="20";
                break;
        }
        this.diagonal = d;
    }

    public Containers(int dens, int height, int diagonal){
        setDens(dens);
        setHeight(height);
        setDiagonal(diagonal);
    }

}
