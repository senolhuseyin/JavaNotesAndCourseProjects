import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class NestedLoop {
    public static void main(String [] args ){

         /*
        Scanner scanner = new Scanner(System.in);


        int satır;
        int sütun;
        String sembol ="";

        System.out.println("Satır sayısını girin: ");
        satır= scanner.nextInt();
        System.out.println("sütun sayısını girin: ");
        sütun= scanner.nextInt();
        System.out.println("sembol girin: ");
        sembol= scanner.next();

        for (int a=1; a<=satır; a++) {
            System.out.println();
            for (int b=1; b<=sütun; b++){
                System.out.print(sembol);
            }
        }
        */

        for (int i=1; i<=10; i+=2){

            for (int j=0; j<=(4-i/2); j++ ) {
                System.out.print(" ");
            }
            for (int k=0; k<i; k++ ) {
                System.out.print("*");
            }
            System.out.println("");
        }


    }
}
