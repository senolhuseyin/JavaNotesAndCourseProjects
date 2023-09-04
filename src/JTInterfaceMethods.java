public class JTInterfaceMethods { //tutorialde devamını çalış (interfaces and inheritance konusunda)
}


class Horse {
    public String identifyMyself() {  //instance method
        return "I am a horse.";
    }
}
interface Flyer {
    default String identifyMyself() {  //interface default method
        return "I am able to fly.";
    }
}
class Pegasus extends Horse implements Flyer { //Instance methods are preferred over interface default methods.
    public static void main(String... args) {
        Pegasus myApp = new Pegasus();
        System.out.println(myApp.identifyMyself());
    }
}