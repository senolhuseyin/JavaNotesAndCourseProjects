public class AbstractClass {
    public static void main(String [] args) {

//        GameCalculator qwe = new GameCalculator() {  //abstract class 'new' ile kullanımı hoş değil
//            @Override                           //dolayısıyla abstract classları tek başına kullanmamalıyız
//            public void hesapla() {  //new yaparsak, abstract metotları yazmak zorundayız
//
//            }
//        };

        GameCalculator game = new WomanGameCalculator(); //ama böyle kullanabiliriz
                                                        //Abstract class, subclassın referansını tutabilir

    }
}


abstract class GameCalculator {  //abstract sınıfta, abstract metot olmak zorunda değil
    public abstract void hesapla ();   //Abstract methods cannot have a body
                                        // extend eden her sınıf bu metodu override etmek zorunda

    public final void GameOver (){
        System.out.println("Game over");
    }
}
class ManGameCalculator extends GameCalculator {
    @Override
    public void hesapla (){
        System.out.println("puanınız : 90");
    }
}

class WomanGameCalculator extends GameCalculator {
    @Override
    public void hesapla (){
        System.out.println("puanınız : 95");
    }
}

class KidsGameCalculator extends GameCalculator {
    @Override
    public void hesapla() {

    }
}