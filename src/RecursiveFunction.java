public class RecursiveFunction {

public static void main (String [] args) {

    //Döngü ile
/*
    int toplam = 0;

    for (int i = 0; i < 10; i++) {
        toplam += i + 1;
        System.out.println(toplam);

    }

    System.out.println("toplam" + toplam);

*/

    //Recursive Function ile

    System.out.println("toplam" + f(1));

}


static int f(int x) {

    if (x==10) return 10;
    System.out.println(x);

    return x + f(x+1);

}

}
