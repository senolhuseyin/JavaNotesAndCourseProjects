import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;

public class HRComparatorSort {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);  //nextDouble hata vermesin diye
        int n = scanner.nextInt();
        System.out.println(n);
        Studentt[] students = new Studentt[n];

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            String b = scanner.next();
            double c = scanner.nextDouble();
            Studentt s = new Studentt(a, b, c);
            students[i] = s;
        }
        scanner.close();

        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println(students[i].ID + students[i].name +
                    students[i].CGPA);
        }

        System.out.println();

        Compare c = new Compare();
        Arrays.sort(students, c);
        for (Studentt s : students) {
            System.out.println(s.name);
        }

    }
}

class Compare implements Comparator<Studentt> {
    @Override
    public int compare(Studentt a, Studentt b) {
        if (a.CGPA == b.CGPA) {              //en son idye göre
            return a.name.compareTo(b.name);
        } else if (a.name.equals(b.name)) { //sonra isme göre
            return a.ID - b.ID;
        } else if (a.CGPA > b.CGPA) {  //önce cgpa ya göre
            return -1;
        } else {
            return 1;
        }
    }
}


class Studentt {
    int ID;
    String name;
    double CGPA;

    public Studentt(int ID, String name, double CGPA) {
        this.ID = ID;
        this.name = name;
        this.CGPA = CGPA;
    }
}


/*
        5
        33 Rumpa 3.68
        85 Ashis 3.85
        56 Samiha 3.75
        19 Samara 3.75
        22 Fahim 3.76*/

