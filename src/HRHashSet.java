import java.util.HashSet;
import java.util.Scanner;

public class HRHashSet {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();

        HashSet<String> hashSet = new HashSet<>();

        int a = 0;
        while (n-- > 0) {
            String s = scan.nextLine();
            hashSet.add(s);
            System.out.println(hashSet.size()); //aynı değer alınca size artmıyor
        }                                       //sadece unique değerler sayılıyor
    }
}

/*        5
        john tom
        john mary
        john tom
        mary anna
        mary anna*/
