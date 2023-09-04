import java.util.ArrayList;

public class ForEachLoop {
    public static void main(String[] args){

        // for-each = Bir array ya da collectiondaki öğleri sıralamak için
        //            less steps, more readable, less fixable


        // COLLECTİON
        //String[] animals = {"cat", "dog", "bird"};     //bunda da aynısı oluyor

        //ARRAY
        ArrayList<String> animals = new ArrayList<String >();
        animals.add("cat");
        animals.add("dog");
        animals.add("bird");


        for (String i : animals){   //':' işareti 'in' demek. yani animals listesindeki tüm Stringler.
            System.out.println(i);
        }



        //Ekstra

        String[] animal = {"cat", "dog", "bird"};


        for (int i =0; i<animal.length; i++) {
            System.out.println(animal [i]);
        }

        int [] sayı ={1,2,3,4,5} ;

        for (int x : sayı ) {
            System.out.println(x);
        }

    }
}
