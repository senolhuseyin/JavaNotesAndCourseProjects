public class CouponCollector {
    public static void main(String [] args) {


        // Bir sefer tüm kartları biriktirmek için
        int M = 10;          //toplam farklı kart sayısı
        int cards = 0;       //alınan toplam kart sayısı
        int distinct = 0;    //alınan farklı kart sayısı

        boolean [] found = new boolean [M];

        while (distinct<M)
        {
            int r = (int) (Math.random() * M);
            System.out.print(r + " ");
            cards++;
            if (!found[r])
            {
                distinct++;
                found[r]=true;
            }
        }

        System.out.println();
        System.out.println("alınan toplam kart " + cards);

        System.out.println();
        System.out.println();


        //Tüm kartları biriktirmek için alınan toplam kart sayısı ortalaması


        int M2 = 10;             //toplam farklı kart sayısı
        double trials = 1000;         //Deneme sayısı
        int cards2 = 0;          //alınan toplam kart sayısı


        boolean [] found2;


        for (int j=0; j<trials; j++)
        {

            int distinct2 = 0;
            found2 = new boolean[M2];
            while (distinct2 < M2)
            {
                int r = (int) (Math.random() * M2);
                cards2++;
                if (!found2[r])
                {
                    distinct2++;
                    found2[r] = true;
                }
            }
        }

        System.out.println((int)trials + " denemede");
        System.out.println("alınan ortalama kart " + ((int)(cards2/trials)));


    }
}
