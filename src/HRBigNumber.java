import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class HRBigNumber {

    public static void main(String[] args) {

        //BigInteger asal sayı bulma
        BigInteger asal = new BigInteger("141423543645756987");
        System.out.println(asal.isProbablePrime(1) ? "prime" : "not prime");


        //BigInteger methods
        BigInteger a = new BigInteger("1234");
        BigInteger b = new BigInteger("20");
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));


        //BigDecimal compareTo
        BigDecimal aa = new BigDecimal("1234");
        BigDecimal bb = new BigDecimal("5234");
        BigDecimal cc = new BigDecimal("5234");
        int x = aa.compareTo(bb);
        System.out.println(x);   //ilk sayı küçükse -1
        int y = bb.compareTo(aa);
        System.out.println(y);   //büyükse 1
        int z = bb.compareTo(cc);
        System.out.println(z);   //eşitse 0








        //Comparator BigDecimal
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();


        //nestep loop ile sıralayınca .12>0.12 oluyor
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                BigDecimal a = new BigDecimal(o1);
                BigDecimal b = new BigDecimal(o2);
                return b.compareTo(a);
            }
        };

        Arrays.sort(s,0,n, comparator);


        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }


  /*      9
        -100
        50
        0
        56.6
        90
        0.12
        .12
        02.34
        000.000

   */







    }
}
