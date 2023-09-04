import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HRLists {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Integer> L = new ArrayList<Integer>();
        int n = scan.nextInt();
        while (n-- > 0) {
            L.add(scan.nextInt());
        }

        int q = scan.nextInt();
        while (q-- > 0) {
            if (scan.next().equals("Insert")) {
                int x = scan.nextInt();
                int y = scan.nextInt();
                L.add(x, y);            //liste x indexine y sayısını atama
            } else {
                int x = scan.nextInt();
                L.remove(x);            //x indexteki elemanı kaldırma
            }
        }
        for (int j = 0; j < L.size(); j++) {
            System.out.print(L.get(j) + " ");
        }
    }
}


/*5
        12 0 1 78 12
        2
        Insert
        5 23
        Delete
        0*/
