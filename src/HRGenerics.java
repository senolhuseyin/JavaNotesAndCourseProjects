import java.lang.reflect.Method;

public class HRGenerics {
    public static void main(String[] args) {

        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        //farklı veri tipinde arraylar için farklı method yazılmaması için :)
        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }
        if(count > 1)System.out.println("Method overloading is not allowed!");

    }
}


class Printer <T>  //generic. kendimiz bi tip belirliyoruz
{
    //Write your code here
    void printArray(T[] array) { //hangi tip array gelirse onu yazıyor
        for (T i : array) {
            System.out.println(i);
        }
    }
}