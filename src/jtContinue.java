public class jtContinue {
    public static void main(String[] args) {

        //UNLABELED continue statement
        String cümle = "meyveyi soymadan içinden ne çıkacak bilemem kardeş";
        int harf = cümle.length();
        int sayı = 0;

        for (int i = 0; i<harf; i++){
            if (cümle.charAt(i) != 'a')
                continue;

            sayı++;
        }
        System.out.println("cümlede toplam " + sayı + " tane a var");
        System.out.println();





        //LABELED continue statement (cümle içinde kelime arama örneği)

        String sentence = "Fırtınada ağaçlar nasıl çatırdar bilir misin kardeş ?";
        String kelime = "rtı";
        boolean foundit = false;

        int fark = sentence.length()-kelime.length(); //
        
       int j = 0; //burda tanımladık ki for döngüsünün dışında yazdırabilelim
                    //yoksa sadece döngünün içinde local olarak bulunacaktı

        test:
        for (int i = 0; i<=fark; i++){
            int n = kelime.length();
            j = i;
            int k = 0;
            while (n-- != 0){
                if (sentence.charAt(j++) != kelime.charAt(k++)){
                    continue test;
                }
            }
            foundit = true;
            break test;
        }

        System.out.println(foundit ? "fount it :) character " + (j - kelime.length()) : "didn't found it :(");






    }
}
