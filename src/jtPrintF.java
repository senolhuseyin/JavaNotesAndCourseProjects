public class jtPrintF {
    public static void main (String [] args) {

        // Two arguments = format String and object/variable/value
        System.out.printf(    "aaaa %d"              ,123);
        System.out.println();
        System.out.printf("%d bbb " ,123);
        System.out.println();
        System.out.printf("%d cccc %d" , 143 , 123);

        System.out.println();
        System.out.println();

        boolean bb = true;
        char cc = '@';
        String ss = "Hsyn";
        int dd = 20;
        double ff = 1000;

        //Conversion Character
        System.out.printf("%b \n",bb);
        System.out.printf("%c \n",cc);
        System.out.printf("%s \n",ss);
        System.out.printf("%d \n",dd);
        System.out.printf("%f \n\n\n",ff);


        //Width - Minimum number of characters
        //karakter sayısının kaç olacağını yazıyoruz boşluklarla ona tamamlıyor
        System.out.printf("hello-%10s\n",ss);             //hello-      Hsyn
        System.out.printf("hello-%-10s-D\n\n\n",ss);      //hello-Hsyn      -D

        //Precision - noktadan sonra kaç basamak yazılacağı
        System.out.printf("%f \n",ff);      //1000,000000
        System.out.printf("%.2f \n\n\n",ff);  //1000,00


        //Flags -
        System.out.printf("x%10fx\n",ff); //width ile aynı - öncesine boşluk ile tamamlama
        System.out.printf("x%-10fx\n",ff);  // sonrasına boşluk ile tamamlama
        System.out.println();

        System.out.printf("%020f\n",ff); // 0 ile tamamlama
        System.out.println();

        System.out.printf("%,f\n",ff); //araya nokta koyma 1.000,00
        System.out.println();

        System.out.printf("%+f\n",ff); // pozitif yazma - negatif yok
        ff=-1000;   // sayı negatif olursa + koysak da pozitif yazmaz
        System.out.printf("%+f\n",ff);



        //ikili kullanım örnek
        //System.out.printf("%-14s %03d\n", a, x);

    }
}
