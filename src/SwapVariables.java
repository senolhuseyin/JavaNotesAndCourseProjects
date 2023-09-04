public class SwapVariables {

    public static void main(String[] args) {

        String x= "Su" ;
        String y= "çay" ;

        System.out.println( "x:" + x );

        String temp;
        temp=x;
        x=y;
        y=temp;

        System.out.println("x:" +x);

        String değişim;
        değişim=x;
        x=y;
        y=değişim;

        System.out.println(x);





    }

}
