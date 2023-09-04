public class Methods {


    static void selam () {
        System.out.println( "Hello World !" );
    }

    // method bir şey döndürmeyecekse void //parametre de almaz
    //döndürecekse return

    static int f (int x) {return 2*x+5;} ;

    static int g (int x, int y) {return f(2*x+y); } ;


    static int arbitraryNumberOfArguments (int... numbers) { //belirsiz sayıda parametre var ise

        int y=0;
        for (int number : numbers )
        {
            y = y + number;
        }
        return (y);
    }


    public static void main(String[] args){

        System.out.println(g(4,8));

        selam();

        System.out.println(f(g(1,2)));


        //main metottan önce de sonra da olsa çalışır,
        System.out.println();


        System.out.println(arbitraryNumberOfArguments(1,2,3,4,5,10));

        System.out.println();















        //OVERLOADED METHODS

        System.out.println(abc(2,3,5));  //direkt yazdırma

        int x = abc(2,4);   //değer verip yazdırma
        System.out.println(x);

        System.out.println(abc(1.5,2.5,3.0,4.0));

    }

    //OVERLOADED METHODS

    static int abc (int a, int b) {
        System.out.println("ikili method");
        return 2*a+b;
    }

    static int abc (int a, int b, int c) {
        System.out.println("üçlü method");
        return 3*a+b+c;
    }

    static double abc (double a, double b, double c, double d){
        System.out.println("dörtlü method");
        return a+2*b+3*c+d;
    }

}
