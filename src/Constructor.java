
class insan{
    int yas;
    int boy;

    public insan () { //class ile aynı isme sahip method, return type yok
        System.out.println("bir insan oluşturuldu");
        yas = 1;  // insan objesi oluşturulunca yaşı otomatik olarak 1 olur
    }

    public insan (int yas, int boy) {  //polymorphism
        this (); // yukarıdaki default constructoru da çağırıyoruz
        this.yas = yas;
        this.boy = boy;
    }

}

public class Constructor {
    public static void main(String [] args){

        insan ali ; //pointer, referrer, sadece varlığı gösteriyor ama boş (new insan yazınca artık bir varlık,obje var)
        insan veli = new insan(); //default constructor
        veli.boy = 175;
        System.out.println("yaş = " + veli.yas + " boy = " + veli.boy); //yaş otomatik olarak 1 oldu ama boy yok
        System.out.println();


        insan ahmet = new insan(25,180);
        System.out.println("yaş = " + ahmet.yas + " boy = " + ahmet.boy);
        System.out.println();


        new insan(); //object oluşturuldu ancak kimse bunu göstermiyor, atama yapılmadı
        //garbage collector tarafından toplanır bunlar (ramde boş dolaşan bi işe yaramayan şeyleri toplar )
        // System.gc(); -->>  // garbage collector, çok kullanılmaz

    }
}
