import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args){

        Scanner isim = new Scanner(System.in);
        String name = "" ;

        do  {
            System.out.println("enter your name: ");
            name=isim.nextLine();
        }
        while (name.isBlank());

        System.out.println("Hello " +name);

        //   while (name.isBlank()) {
        //            System.out.println("enter your name: ");
        //            name=isim.nextLine();
        //        }
        //      böyle de olur



        // Sayı saydırma
        //   int x= 5;
        //
        //        do {
        //            System.out.println(x);
        //            x++;
        //        } while (x<=15);



    }
}
