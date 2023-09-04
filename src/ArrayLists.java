import java.util.ArrayList;

public class ArrayLists {
    public ArrayLists(int i, int i1, int i2, int i3, int i4, int i5) {
    }

    public static void main (String[]args) {


        // arraylist = a resizable array
        //element eklenip çıkarılabilir
        //store reference data types

        ArrayList <String> food = new ArrayList<>() ;
        food.add("pizza") ;
        food.add("hamburger");
        food.add("hotdog");

        food.set(2,"lahmacun");
        //food.remove(1);
        //food.clear();  //hepsini temizliyor

        /* for (int i=0; i<food.size(); i++ ) {
            System.out.println(food.get(i));
        }
        */
        System.out.println(food.get(2));

        //2D Arraylist

        ArrayList<String> drink = new ArrayList<>();
        drink.add("su");
        drink.add("soda");
        drink.add("ayran");

        ArrayList<ArrayList<String>> menu = new ArrayList<>();
        menu.add(food);
        menu.add(drink);

        System.out.println(menu.get(1).get(0));

    }
}
