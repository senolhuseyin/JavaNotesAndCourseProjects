import java.util.Scanner;
public class WhileveIfBölenBulma {
    public static void main (String [] args){


        Scanner scan = new Scanner(System.in);
        System.out.println("Pozitif bölenlerini bulmak istediğiniz sayısı giriniz");
        int sayı = scan.nextInt();

        int altdeğer=1;
        int bölentoplamı=0;
        int bölensayısı=0;

        System.out.println(sayı + " sayısının pozitif tam bölen sayısı ve tam bölenleri toplamları");

        while (altdeğer<=sayı) {
            if (sayı%altdeğer == 0) {
                System.out.println(sayı + " sayısı " + altdeğer + " sayısına tam bölünür.");

                bölentoplamı += altdeğer;
                bölensayısı += 1;
            }

            if (altdeğer == sayı)
                System.out.println(sayı + " sayısının pozitif tam bölenleri sayısı " + bölensayısı +
                        "\npozitif tam bölenleri toplamı " + bölentoplamı);

            altdeğer ++;
        }

    }
}
