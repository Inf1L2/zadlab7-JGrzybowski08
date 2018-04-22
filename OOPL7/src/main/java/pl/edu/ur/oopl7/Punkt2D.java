package pl.edu.ur.oopl7;

import java.util.Random;

public class Punkt2D {
    int x;
    int y;


    public Punkt2D() {
        x = 0;
        y = 0;
    }

    public Punkt2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static int losX(){
        Random generator = new Random();
        return generator.nextInt(9)-10;
    }

    public static int losY(){
        Random generator = new Random();
        return generator.nextInt(9)-10;
    }

    @Override
    public String toString() {
        return "Punkt2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
