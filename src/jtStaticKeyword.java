

class Static {   //Deneme
    static int a = 0;
}


public class jtStaticKeyword {

    public static void main (String [] args){

        Static.a = 3;                //nesne referansı olmadan da ulaşabiliyoruz
        System.out.println(Static.a);

        Static st = new Static();    //bu yöntem önerilmez!! (object reference)
        System.out.println(Static.a);
        st.a = 2;                   //st için değiştirdik ama her obje için değişti
        System.out.println(st.a);

        Static st2 = new Static();   //st2 için de değişti
        System.out.println(st2.a);
        System.out.println();
        System.out.println();





        //Class Members (class variables and class methods)
        Bicycle bike1 = new Bicycle(1,2);
        System.out.println(bike1.getID());                  // id 1
        System.out.println(Bicycle.getNumberOfBicycles());    // 1
        System.out.println();

        Bicycle bike2 = new Bicycle(2,4);   //method static olduğu için direkt çağırabiliriz
        System.out.println(bike1.getID());                   // id 1
        System.out.println(bike2.getID());                   // id 2
        System.out.println();
        System.out.println(Bicycle.getNumberOfBicycles());     // 2
        System.out.println(bike2.getNumberOfBicycles());     // 2   //bu önerilmez !! (object reference)








    }

    //Constants (sabitler)  //final keyword var ise değiştirilemezer
    static final double PI = 3.14;
    static final int SABIT_DEGISKEN = 123;  //büyük harflerle ve arada alt tire olarak yazılır

}


class Bicycle {

    private int gear;
    private int speed;
    private int id;

    //Static olduğu için her bisiklete ayrı değer olmuyor
    //her bisiklet oluşturulduğunda 1 artıyor
    private static int numberOfBicycles = 0;

    public Bicycle(int startSpeed, int startGear){
        gear = startGear;
        speed = startSpeed;

        // increment number of Bicycles
        // and assign ID number
        id = ++numberOfBicycles;
    }


    // new method to return the ID instance variable

    //Instance methods can access instance variables and instance methods directly.
    //Instance methods can access class variables and class methods directly.
    public int getID() {  //yani bu method ile numberOfBicycle ulaşabiliriz
        return id;
    }



    public static int getNumberOfBicycles(){    //ama bu method ile id'ye ulaşamayız
        return numberOfBicycles;
    }
    //Class methods can access class variables and class methods directly.
    //Class methods cannot access instance variables or instance methods directly—they must use an object reference.
    // Also, class methods cannot use the 'this' keyword as there is no instance for this to refer to.




    //DİĞER METOTLAR
    public void setGear(int newValue){ //void, değer döndürmez sadece bir iş yapar
        gear = newValue;
    }

    public int getGear (){
        return gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }


}





