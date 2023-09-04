public class ArrayDiziler {
    public static void main(String[] args) {

        //ARRAY

        String[] cars = new String[3];

        cars[0] = "BMW";
        cars[1] = "Audi";
        cars[2] = "Mercedes";

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }


        int[] a = {1, 5, 2, 8, 3};

        System.out.println(a[3]);

        int[] sayılar = new int[3];
        sayılar[2] = 5;

        for (int j = 0; j < sayılar.length; j++) {
            System.out.println(sayılar[j]);
        }

        System.out.println();

        int b[] = new int[a.length];
        for (int i = 0; i < a.length; i++)
            b[i] = a[i];

        // a=b;

        System.out.println(b[2]);
        System.out.println(a[2]);











        /* 2. yöntem

       String [] car = {"BMW", "Audi", "Tofaş", "Supra"};

        car[1]= "GTR" ;

        System.out.println(car[1]);

        */


        // 2D ARRAY
        /*
        String [][] car = new String[2][2] ;

        car[0][0]="aaa";
        car[0][1]="bbb";
        car[1][0]="ccc";
        car[1][1]="ddd";

        for (int i=0; i< car.length; i++) {
            System.out.println();
            for (int j = 0; j < car[i].length; j++) {
                System.out.print(car[i][j] +" ");
            }
        }




        // Aynısı farklı yöntemle

        String [][] car = {   {"aaa", "bbb"},{"ccc", "ddd"}   };

        for (int i=0; i< car.length; i++) {
            System.out.println();
            for (int j = 0; j < car[i].length; j++) {
                System.out.print(car[i][j] + " ");
            }
        }

         */


    }
}
