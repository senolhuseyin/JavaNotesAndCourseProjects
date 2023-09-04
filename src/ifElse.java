public class ifElse {

    public static void main (String[]args){

        int age=18;

        if (age>=60) {
            System.out.println("haha boomer");
        }

        else if (age>17) {
            System.out.println("You are an adult");
        }

        else if (age>=13){
            System.out.println("you are a teenager");
        }
        else if (age==0){
            System.out.println("hello world!");
        }
        else if (age<=3){
            System.out.println("you are a baby");
        }
        else {
            System.out.println("you are not an adult");
        }





        //KISA yazım şekli
        int a=8;
        String yazi= (a == 8 ? "Sekiz" : "Sekiz Değil");
        System.out.println(yazi);


    }
}
