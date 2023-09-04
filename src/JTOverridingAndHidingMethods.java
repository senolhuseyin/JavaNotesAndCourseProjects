
public class JTOverridingAndHidingMethods {
    public static void main(String[] args) {

        //Cat myCat = new Cat();
        //Animal myAnimal = myCat;
        Cat myAnimal = new Cat();  //İki yöntem de aynı

        Animal.testClassMethod();   //The static method in Animal
        Cat.testClassMethod();      //The static method in Cat
        myAnimal.testInstanceMethod();  //The instance method in Cat
        myAnimal.testClassMethod();
    }
}
        //methodu final yaparsak override edilemez

class Animal {
    public static void testClassMethod() {
        System.out.println("The static method in Animal");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Animal");
    }
}

class Cat extends Animal {
    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }

    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }
}


