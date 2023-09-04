import java.util.Arrays;
import java.util.List;

public class LambdaExpressions {
    interface lambda {
        int lamda (int x);
    }
    interface lambda2 {
        int lamda2 (int x, int y);
    }

    public static void main(String [] args){

        lambda l = x -> 2 * x;
        System.out.println(l.lamda(3));

        lambda2 l2 = (int x,int y) -> x * y;   // {return x * y;}; böyle de yazılabilir ama gerek yok
        System.out.println(l2.lamda2(3,5));


        List<Integer> liste = Arrays.asList(1,2,3);
        liste.forEach(System.out::println);   //(x -> System.out.println(x)) aynısı

        System.out.println();

        liste.forEach(x -> {
            x +=1;
            System.out.println(x);
        });

        System.out.println();

        int sum = liste.stream().map(x->x*x).reduce((x,y) -> x + y).get();  //??
        System.out.println(sum);


    }
}
