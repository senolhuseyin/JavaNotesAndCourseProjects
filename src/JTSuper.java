public class JTSuper {
    public void printMethod() {
        System.out.println("Printed in Superclass.");
    }

    int a;
    public JTSuper(){};

    public JTSuper (int a){
        this.a = a;
    }
}



class SubClass extends JTSuper{
    // overrides printMethod in Superclass
    public void printMethod() {
        super.printMethod();    //Superclass'taki methodu çağırıyoruz
        System.out.println("Printed in Subclass");
    }

    int b;

    public SubClass(){};

    public SubClass (int a, int b){
        super(a);    //parametleri alan superclass constructoru çağırıyoruz
        this.b = b;
    };





    public static void main(String[] args) {
        SubClass s = new SubClass(15,20);
        s.printMethod();
        System.out.println(s.a);
        System.out.println(s.b);
    }
}
