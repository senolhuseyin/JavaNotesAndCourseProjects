public class DeckofCards {
    public static void main(String[] args) {

        String suit[] = {"maça", "kupa", "karo", "sinek"};
        String rank[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String deck[] = new String[52];

        for (int i = 0; i < suit.length; i++)
            for (int j = 0; j < rank.length; j++)
                deck[13 * i + j] = suit[i] + rank[j];



        /* Türe göre sıralama

        for (int h=0; h<suit.length; h++) {
            for (int k = 0; k < rank.length; k++)
                System.out.print(deck[h * 13 + k] + " ");
            System.out.println();
        }

        System.out.println();


    */

     /*  Rakamlara göre sıralama
        for (int k=0; k< rank.length; k++)
            for (int l=0; l< suit.length; l++) {
                deck[4 * k + l] = suit[l] + rank[k];
                System.out.println(deck[4 * k + l]);
            }
      */



        /* Rastgele kart çakme (aynı kart gelebilir)

        for (int m=0; m<10; m++) {
            int r = (int) (Math.random() * 52);
            System.out.println(deck[r]);

        }
    */

        // Rastgele kart çekme (aynı kart gelmeden) shuffle
        // random seçilen kart 0'a konuluyor, 0'daki de onun yerine
        // daha sonra 1 ve sonrakilerden bir tane seçiliyor

        int n = deck.length;             // bütün listeyi karıştırıyoruz
        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n - i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }
        for (int m = 0; m < 10; m++) {          //desteden rastgele 10 tanesini seçiyoruz
            int r = (int) (Math.random() * 52);
            System.out.println(deck[r]);

        }
        System.out.println();

        for (int p = 0; p < 10; p++)          // destenin ilk 10 tanesini seçiyoruz
            System.out.println(deck[p]);


    }
}
