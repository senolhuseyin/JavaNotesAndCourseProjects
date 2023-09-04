public class Fibonacci {

    static int fib (int x) {
        if (x==0) return 1;
        if (x==1) return 1;

        return fib(x-2)+fib(x-1);
    }


    public static void main(String[] args) {




        // Recursive Function ile (büyük rakamları hesaplaması yılları sürebilir)


        System.out.println(fib(9));

        for (int i=0; i<10; i++){
            System.out.println(fib(i));
        }


        System.out.println();
        System.out.println();







        int n = 50;
        System.out.println(F(n));

    }



    //hafızaya alarak yüksek rakamlar da hesaplanabilir
    static long [] memo = new long[100];

    public static long F(int n){

        if (n==0) return 0;
        if (n==1) return 1;
        if (memo[n]==0) memo[n] = F(n-1) + F(n-2);
        return memo[n];
    }


}



//Döngü ile
        /*
        int a = 1;
        int b = 1;
        int c ;

        for (int i=0; i<10; i++ ) {
            c=a+b;
            a=b;
            b=c;

            System.out.println(c);
        }
*/
// Dizi ile
/*
        int fib [] = new int [10];
        fib[0]=1;
        fib[1]=1;

        for (int i=0; i<8; i++){

            fib[i+2]=fib[i+1]+fib[i];
        }

        for (int i=0; i<10; i++) {
            System.out.println(fib[i]);
        }
*/
