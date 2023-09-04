import java.util.Random;

public class RandomNumbers {

    public static void main (String [] args ){

        Random rastgele = new Random();

        int x= rastgele.nextInt(6) ;  //6-> 0'dan 5'e kadar demek
        //bilgisayar saymaya 0'dan başlıyor, parantez için 5 yazınca 0 dahil 5 rakam veriyor

        double y= rastgele.nextDouble();
        boolean z= rastgele.nextBoolean();

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        for (int i = 0; i<100; i++){
            int a = rastgele.nextInt(6);
            System.out.println(a);
        }
    }
}
