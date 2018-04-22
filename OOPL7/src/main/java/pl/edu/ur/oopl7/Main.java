package pl.edu.ur.oopl7;

public class Main {
    public static void main(String[] args){
        Punkt2D[] array2D = new Punkt2D[100];
        Punkt3D[] array3D = new Punkt3D[100];

        for(int i=0;i<100;i++){
            array2D[i]=new Punkt2D();
            array2D[i].x=Punkt2D.losX();
            array2D[i].y=Punkt2D.losY();
            //System.out.println(array2D[i]);
        }
        for(int i=0;i<100;i++){
            array3D[i]=new Punkt3D();
            array3D[i].x=Punkt3D.losX();
            array3D[i].y=Punkt3D.losY();
            array3D[i].z=Punkt3D.losZ();
            //System.out.println(array3D[i]);
        }
        for(int i=0;i<100;i++){
            if((array2D[i].x == array3D[i].x) && (array2D[i].y == array3D[i].y)){
                System.out.println(" Pkt. wspolne: "+i);
                System.out.println("2D: x: "+array2D[i].x+", y: "+array2D[i].y+", ");
                System.out.println("3D: x: "+array3D[i].x+", y: "+array3D[i].y+", z: "+array3D[i].z);
                System.out.println("---------------------------------");
            }
        }
    }
}
