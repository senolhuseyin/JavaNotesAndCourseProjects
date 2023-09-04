public class jtBreak {
    public static void main(String [] args){

        //unlabeled break atatement
        int [] list = {15,26,5,125,263,456,58,12};
        int x = 2;

        boolean found = false;
        int i;

        for ( i = 0; i< list.length; i++){
        if (list[i] == x) {
            found = true;
            break;}
        }

        if (found) {
        System.out.println(x + " listenin " + i + ". elemanıdır");
        }
        else {
        System.out.println(x + " listede yoktur");
        }



        //labeled break statement

        int [][] liste = {
                {2, 45, 263},
                {25, 16, 235},
                {14, 52, 9}
            };

        int y = 16;
        boolean foundd = false;

        int j;
        int k = 0;

        search:                                     //LABEL
        for (j=0; j< liste.length; j++){
            for (k=0; k< liste[j].length; k++){
                if (liste [j][k] == y){
                    foundd=true;
                    break search;
                }
            }
        }

        if (foundd){
            System.out.println(y + " listenin " + "[" + j + "]" + "[" + k + "]" + ". elemanıdır");
        }
        else System.out.println(y + "listede yoktur");



    }
}
