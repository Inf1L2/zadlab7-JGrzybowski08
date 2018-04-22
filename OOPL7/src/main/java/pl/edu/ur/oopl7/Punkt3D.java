package pl.edu.ur.oopl7;

import java.util.Random;

public class Punkt3D extends Punkt2D{
    int z;


    public Punkt3D() {
        z=0;
        x=0;
        y=0;
    }

    public Punkt3D(int x, int y, int z) {
        super(x,y);
        this.z = z;
    }
    public static int Losowanie(){
        Random generator = new Random();
        return generator.nextInt(9)-10;
    }
    public static int losY(){
        Random generator = new Random();
        return generator.nextInt(9)-10;
    }
    public static int losZ(){
        Random generator = new Random();
        return generator.nextInt(9)-10;
    }

    @Override
    public String toString() {
        return "Punkt3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
