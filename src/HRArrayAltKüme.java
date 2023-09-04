import java.util.Scanner;

public class HRArrayAltKüme {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scan.nextInt();
        }

        int negative = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum = 0;
                for (int h = i; h <= j; h++) {
                    sum += A[h];
                }
                if (sum < 0) {
                    negative++;
                }
            }
        }

        System.out.println(negative);

    }
}


/*
        5
        1 -2 4 -5 1
*/
