public class jtNestedClassesTopLevelClass {
    void accessMembers(jtNestedClasses outer){
        //??? System.out.println(jtNestedClasses.outerField);  //Cannot make a static reference to the non-static
        System.out.println(outer.outerField);
        System.out.println(jtNestedClasses.staticOuterField);
    }
}
