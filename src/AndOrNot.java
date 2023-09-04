import java.sql.SQLOutput;
import java.util.Scanner;

public class AndOrNot {
    public static void main(String[] args) {

        // && And,    || Or,    ! Not

        //AND &&

        int temp=20;

        if (temp<20) {
            System.out.println("it is cold outside");
        }
        else if (temp<=30 && temp>=20){
            System.out.println("it is warm outside");
        }
        else System.out.println("it is hot outside");



        // OR ||

        Scanner quit = new Scanner(System.in);

        System.out.println("Do you want to quit the game ? Press q or Q to quit");
        String response = quit.next();

        if (response.equals("q") || response.equals("Q") ) {
            System.out.println("You quit the game");
        }
        else {
            System.out.println("Oyna devam");
        }

        // NOT !
        Scanner scanner= new Scanner(System.in) ;

        System.out.println("Press P to continue the game");
        String cevap = scanner.next();

        if ( !cevap.equals("p") && !cevap.equals("P") ){
            System.out.println("see you");
        }
        else {
            System.out.println("Let's go !");
        };

    }
}
