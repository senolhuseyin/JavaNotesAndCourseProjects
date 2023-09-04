public class Maths {

    public static void main(String [] args) {
/*
        double x= 3.14;
        double y= -10;

        //min, max, abs:mutlak değer sqrt:karekök(square root), round:yuvarlama
        //ceil:yukarı yuvarlama, floor:aşağı yuvarlama

        double z= Math.ceil(x);
        System.out.println(z);


        double a=3;
        double b=4;

        double h= Math.sqrt (a*a + b*b );

        System.out.println(h);
*/

        int x = 10, y=20;

        System.out.println("sonuç " + x+y);
        System.out.println("sonuç "  + x*y + " " + (x-y) );
        System.out.println(x+y);
        System.out.println((x+y));
        System.out.println((float) (float) x / (float) y ) ;
        System.out.println(10>>2);   //ikilik tabanda iki kere sağa
        System.out.println( x==y );


        System.out.println();
        System.out.println();

        //Boolean ile ? : kullanımı
        double f = Math.random();
        double g = Math.random();
        System.out.println("f = " +f);
        System.out.println("g = " + g);

        boolean d = f<g;
        System.out.println(d);

        double sonuç = d ? g :f;
        System.out.println(sonuç);


    }
}
