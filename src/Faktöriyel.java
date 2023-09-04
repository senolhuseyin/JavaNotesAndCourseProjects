import java.util.Scanner;
public class Faktöriyel {
    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);

        int faktöriyel = 1;

        System.out.println("faktöriyel hesaplama");
        int sayı = scan.nextInt() ;

        for (int i = 2; i<=sayı ; i++){

            faktöriyel= faktöriyel*i;
        }
        System.out.println(sayı + "!= " + faktöriyel);


        int a = sayı;

        for (int j = sayı ; j>0 ; j--){

            sayı= sayı*j;
        }
        System.out.println(a + "!= " + faktöriyel);

    }
}
