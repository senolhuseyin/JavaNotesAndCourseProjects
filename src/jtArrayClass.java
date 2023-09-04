import java.util.Arrays;

public class jtArrayClass {
    public static void main(String [] args){

        //SıRALAMA     //çok elemanlı arraylerde Arrays.parallelSort(x); kullanılmalı
        int [] numbers = {2,5,1,9,0,4,-2};
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++)
        {System.out.print(numbers[i] + " ");}
        System.out.println();

        char [] chars = {'a', 't', 'f', 'A', 'H', 'D'};
        Arrays.sort(chars);                              //Öncelik büyük harflerin
        for (int i = 0; i < chars.length; i++)
        {System.out.print(chars[i] + " ");}
        System.out.println();

        int [] unicodes = {'a', 't', 'f', 'A', 'H', 'D'}; //yine öncelik aynı
        for (int unicode : unicodes) {
            System.out.print(unicode + " ");
        }
        System.out.println();
        Arrays.sort(unicodes);
        for (int unicode : unicodes) {
            System.out.print(unicode + " ");
        }
        System.out.println();

        int [] number = {2,5,1,9,0,4,-2};
        Arrays.sort(number, 3, 7); //belirli bir aralıktaki sayıları
        for (int i : number)    //sıralama
        {System.out.print(i + " ");}
        System.out.println();

        String [] str = {"abc", "def", "asd", "ABC"};    //alfabetik sıralama
        Arrays.sort(str);
        for (String x : str)
        {System.out.print(x + " ");}
        System.out.println();
        System.out.println();


        //Loop'a gerek kalmadan yazdırabiliriz
        //TO STRİNG   //köşeli parantez içinde string dizi olarak yazar
        int [] string = {2,5,1,9,0,4,-2};
        System.out.println(Arrays.toString(string));
        System.out.println();



        //BİNARY SEARCH
        int [] x = {2,5,3,1,0,4};
        Arrays.sort(x);  //
        System.out.println(Arrays.binarySearch(x,-5));
        System.out.println();



        //COMPARE (equals)
        int [] numbers1 = {2,5,1,9,0,4,-2};
        int [] numbers2 = {2,5,1,9,0,4,-2};
        int [] numbers3 = {2,5,1,9,0,4,-2, 8};
        System.out.println(numbers1 == numbers2); //false çünkü elemanlar aynı ama array adresleri farklı
        System.out.println(Arrays.equals(numbers1, numbers2));
        System.out.println(Arrays.equals(numbers1, numbers3));
        System.out.println();



        //FILL
        int [] nambır = new int[8];
        Arrays.fill(nambır,3);      //fill with 3 all
        for (int y : nambır){System.out.print(y + " ");}
        System.out.println();
        Arrays.fill(nambır, 2,7,5);  //fill with 5, elemant 2 to 6
        for (int z : nambır){System.out.print(z + " ");}



    }
}
