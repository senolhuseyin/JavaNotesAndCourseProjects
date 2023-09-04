import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class HRIterator {

    static Iterator func(ArrayList mylist) {
        Iterator it = mylist.iterator();
        while (it.hasNext()) {
            Object element = it.next();
            if (element instanceof String)//ilk String elemanı bulunca döngüyü kırıyor

                break;
        }
        return it;

    }

    @SuppressWarnings({"unchecked"})
    public static void main(String[] args) {
        ArrayList mylist = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   //kaç integer eleman olacağı
        int m = sc.nextInt();   //kaç String eleman olacağı
        for (int i = 0; i < n; i++) {
            mylist.add(sc.nextInt());
        }

        mylist.add("###");      //integer ve String elemanlar arasına ### ekliyor
        for (int i = 0; i < m; i++) {
            mylist.add(sc.next());
        }

        Iterator it = func(mylist);
        while (it.hasNext()) {
            Object element = it.next();
            System.out.println((String) element);
        }
    }
}


/*
        element[0]=>42
        element[1]=>10
        element[2]=>"###"
        element[3]=>"Hello"
        element[4]=>"Java"
*/
