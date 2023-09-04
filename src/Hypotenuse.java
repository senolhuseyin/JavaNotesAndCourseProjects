import java.util.Scanner ;

public class Hypotenuse {
    public static void main (String [] args ){

        double x; double y; double z;

        Scanner hypo= new Scanner(System.in);

        System.out.println("a kenarı kaç cm ?");
        x= hypo.nextDouble();
        System.out.println("b kenarı kaç cm ?");
        y= hypo.nextDouble();

        z= Math.sqrt ( (x*x) + (y*y) );

        System.out.println("hipotenüs " +z);

        hypo.close();



    }
}
