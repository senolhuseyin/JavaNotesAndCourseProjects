public class jtNestedClasses { //outerclass

    String outerField = "Outer Field";
    static String staticOuterField = "Static Outer Field";

    class InnerClass {  //non-static nested class

        void accessMembers() {
            System.out.println(outerField);
            System.out.println(staticOuterField);
        }
    }

    static class StaticNestedClass {
        void accessMembers(jtNestedClasses outer) {
            //System.out.println(outerField);  // Cannot make a static reference to the non-static
            System.out.println(outer.outerField);
            System.out.println(staticOuterField);
        }
    }

    public static void main(String[] args) {

        System.out.println("Inner class:");
        System.out.println("------------");
        jtNestedClasses outerObject = new jtNestedClasses();
        jtNestedClasses.InnerClass innerObject = outerObject.new InnerClass();
        innerObject.accessMembers();

        System.out.println("\nStatic nested class:");
        System.out.println("--------------------");
        StaticNestedClass staticNestedObject = new StaticNestedClass();
        staticNestedObject.accessMembers(outerObject);                //?? static olduğu için direkt erişim

        System.out.println("\nTop-level class:");
        System.out.println("--------------------");
        jtNestedClassesTopLevelClass topLevelObject = new jtNestedClassesTopLevelClass();
        topLevelObject.accessMembers(outerObject);





    }
}










