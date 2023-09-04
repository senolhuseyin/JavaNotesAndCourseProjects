import java.util.Scanner;

public class UserİnputScanner {

    public static void main(String [] args) {

        Scanner tarama = new Scanner (System.in) ;

        System.out.println("What is your name ?");
        String name = tarama.nextLine();
        System.out.println("How old are you ?");
        int age = tarama.nextInt();

        tarama.nextLine();
        //bu satır olmazsa 3. sorunun cevabını almadan direkt yanıt veriyor
        //nextInt'den sonra Enter'a basınca nextLine olarak Enter komutunu alıyor ve devam ediyor
        //o yüzden araya ayrı bi nextline atıyoruz

        System.out.println("What is your favorite food ?");
        String food = tarama.nextLine();


        System.out.println("Hello " + name);
        System.out.println("You are " +age + " years old");
        System.out.println("Your favorite food is " + food );

    }


}
