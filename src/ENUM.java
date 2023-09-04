
enum günler {pazartesi, salı, çarşamba, perşembe, cuma, cumartesi, pazar;}
//class içinde de tanımlanabilir

public class ENUM {
    public static void main(String [] args){

        günler a = günler.pazartesi;
        System.out.println(a.ordinal());  //index number
        System.out.println(a.compareTo(günler.çarşamba)); //index değerleri farkı

    }
}
