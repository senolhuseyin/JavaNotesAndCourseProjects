import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {

        String name = "Hüseyin  ";

        //boolean result = name.equals("Hüseyin ");
        //boolean result = name.equalsIgnoreCase("  HüSeYiN  ");
        //boolean result = name.isEmpty();            //ya da .isBlank
        //int result = name.length();                 //kaç harf olduğu
        //int result = name.indexOf("H") ;            //harfin sırası //ilk bulduğunu yazar
        int result = name.lastIndexOf("ü");       //harfin en son kullanıldığı sıra
        //char result = name.charAt(2);               //o sıradaki harf
        //String result = name.toLowerCase();         //toUpperCase de büyük harf yapar
        //String result = name.trim();                //boşlukları kaldırıyor (baştaki ve sondaki)
        //String result = name.replace("e", "i");     //harf değiştirme

        System.out.println(result);
        System.out.println();

        System.out.println(name.concat("Şenol"));  //birleştirme
        System.out.println(name.startsWith("h"));     //.endsWith
        //java case-sensitive'dir. o yüzden false
        System.out.println();

        //System.out.println(name.substring(2));  //2. index  ve  sonrasını yaz
        //System.out.println(name.substring(2,4));         //index 2-4 arasını yaz (2 ve 3)


        /*char[] karakterler = new char[5];  //0 ile 5 arasındaki karakterleri alma
        name.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);*/

        System.out.println();
        String cümle = "asda qwqw   wetsdf srdfdsf";   //kelimeleri ayırma metodu
        for (String kelime : cümle.split(" ")){
            System.out.println(kelime);
        }

        System.out.println();
        //alfabetik sıralama karşılaştırma
        String a = "hsyn";
        String b = "abc";
        if (a.compareTo(b) > 0)
            System.out.println("a büyük");
        else {
            System.out.println("b büyük");
        }

        System.out.println();
        //String reverse
        String rvr = "Hüseyin";
        String rvrs = new StringBuilder(rvr).reverse().toString();
        System.out.println(rvrs);

        System.out.println();
        //Split, bütün noktalama işaretlerine göre
        String split = "He is a very very good boy, isn't he?";
        String [] ssplit = split.split("[\\s!,?._'@]+");
        System.out.println(ssplit.length);
        for (String token : ssplit){
            System.out.println(token);
        }

    }
}
