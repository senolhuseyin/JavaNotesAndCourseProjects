import java.util.HashMap;
import java.util.Scanner;

public class HRHashMap {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> phoneBook = new HashMap<>();
        int n = scan.nextInt();
        scan.nextLine();
        while (n-- > 0) {
            String a = scan.nextLine();
            int b = scan.nextInt();
            scan.nextLine();
            phoneBook.put(a, b);
        }

        System.out.println(phoneBook);

        while (scan.hasNext()) {
            String c = scan.nextLine();
            if (phoneBook.containsKey(c)) {
                System.out.println(c + "=" + phoneBook.get(c));
            } else {
                System.out.println("Not found");
            }
        }
    }
}

/*        3
        uncle sam
        99912222
        tom
        11122222
        harry
        12299933
        uncle sam
        uncle tom
        harry*/
