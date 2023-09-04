import java.util.Scanner;

public class İlkHesapMakinesiDenemesi {
    public static void main(String[] args){


        Scanner hesap = new Scanner(System.in) ;


       do {

           System.out.println("lütfen yapmak istediğiniz işlemi seçin");
           System.out.println("toplama için 1 \n çıkarma için 2 \n çarpma için 3 \n bölme için 4 \n");
           int işlem = hesap.nextInt();
           System.out.println("ilk sayıyı giriniz");
           int x = hesap.nextInt();
           System.out.println("ikinci sayıyı giriniz");
           int y = hesap.nextInt();

           int z;
           double t;

           System.out.println("\nif hesap makinesi");

           if (işlem == 1) {
               z = x + y;
               System.out.println("cevap: " + z + "\n");
           } else if (işlem == 2) {
               z = x - y;
               System.out.println("cevap: " + z + "\n");
           } else if (işlem == 3) {
               z = x * y;
               System.out.println("cevap: " + z + "\n");
           } else if (işlem == 4) {
                t = (double) ( (double) x / (double) y) ;
               System.out.println("cevap: " + t + "\n");
           } else {
               System.out.println("işlem numarasını kontrol ediniz\n");
           }
       }
       while (true) ;


/*

        System.out.println("case hesap makinesi");

        switch (işlem) {

            case 1 : z=x+y ;
                System.out.println("cevap: " + z);
                break;
            case 2 : z=x-y ;
                System.out.println("cevap: " + z);
                break;
            case 3 : z=x*y ;
                System.out.println("cevap: " + z);
                break;
            case 4 : t=x/y ;
                System.out.println("cevap: " + t);
                break;
            default:
                System.out.println("işlem numarasını kontrol ediniz");

        }
*/


    }
}
