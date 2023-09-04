class human{
    int age;
}
class student extends human implements Cloneable { //Cloneable olmazsa kopyalamaz

    Object copy () throws CloneNotSupportedException {  //Deep Copy
        return this.clone();
    }

    student copy2 () {   //bu da deep copy
        student temp = new student();
        temp.age = this.age;
        return temp;
    }




    boolean equals (student rhs){  //override the equals method
        return this.age == rhs.age;
    }



    public String toString (){   //toString override
        return "age = " + this.age;
    }



}



public class ObjectClass {
    public static void main(String [] args) throws CloneNotSupportedException {

        human ali = new human();
        //shallow copy (sığ kopyalama) //ram'de tek obje var ikisi de onu gösteriyor (refer)
        human ahmet = ali;
        ali.age = 18;
        System.out.println(ahmet.age);  //ahmetin yaşı da 18 olur

        if (ali==ahmet){
            System.out.println("eşit");   //ram'de tek obje var o yüzden true
        }

        if (ali.equals(ahmet)){
            System.out.println("equals");  //içerikleri aynı true
        }
        System.out.println();


        student ayse = new student();
        ayse.age = 2;
        student fatma = (student)ayse.copy(); //Deep Copy
        System.out.println(ayse.age);  //2
        System.out.println(fatma.age); //2
        ayse.age = 3;
        fatma.age = 5;
        System.out.println(ayse.age);  //3
        System.out.println(fatma.age); //5

        if (ayse==fatma){
            System.out.println("eşit2");  //ram'de iki farklı obje var o yüzden false
        }
        if (ayse.equals(fatma)){
            System.out.println("equals2");   //içerikleri farklı false
        }



        fatma.age = 3;
        if (ayse.equals(fatma)){
            System.out.println("equalss");   //içerikleri aynı true
        }




        System.out.println();
        //toString

        //aksi söylenmezse otomatik olarak objenin toString methodu çalışıyor
        System.out.println(ayse + "  --toString");

        System.out.println(ayse.hashCode()); //her objye özel bir hashcode var id gibi


    }
}
