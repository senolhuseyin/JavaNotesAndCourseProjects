import java.util.Scanner;

public class HRStaticInitializerBlock {

    //Static initialization blocks are executed when the class is loaded,
    // and you can initialize static variables in those blocks.

    private static int B;
    private static int H;
    private static boolean flag;
    static {
        Scanner scan = new Scanner(System.in);
        B = scan.nextInt();
        H = scan.nextInt();
        scan.close();

        if(B <= 0 || H <= 0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }
        else {
            flag = true;
        }
    }




    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }
}


/*
1
3

-----

-1
2
 */
