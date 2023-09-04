
import java.util.InputMismatchException;
import java.util.Scanner;

public class HRExceptionHandling {

    public static void main(String []args){

/*        Scanner scan = new Scanner(System.in);

        try {
            int x = scan.nextInt();
            int y = scan.nextInt();
            System.out.println(x/y);
        }
        catch (InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }
        catch (ArithmeticException exception){
            System.out.println("java.lang.ArithmeticException: / by zero");
        }*/






        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
}
class MyCalculator {
    long power (int x, int y) throws Exception {

        if (x<0 || y<0){
            throw new Exception ("n or p should not be negative.");
        }
        else if (x==0 && y==0){
            throw new Exception ("n and p should not be zero.");
        }
        else {
            long result = (long)Math.pow(x, y);
            return result;
        }
    }

}
