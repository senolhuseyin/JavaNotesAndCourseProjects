public class Interfaces {
    public static void main(String[] args) {

//        ICustomerDal a = new ICustomerDal() { //direkt new yaparsak metotu yazmak zorunda kalırız
//            @Override                         //bu kullanım önerilmez
//            public void add() {
//
//            }
//        };

        //ama interface, onu implement eden class'ın referansını tutabilir
        ICustomerDal asd = new OracleCustomerDal();

    }
}

interface ICustomerDal{  //Dal = Data access layer
    void add();   //interface metotları default olarak public'tir. yazmaya gerek yok.
}
class MySqlCustomerDal implements ICustomerDal{

    @Override
    public void add() {
        System.out.println("My Sql eklendi");
    }
}

class OracleCustomerDal implements ICustomerDal{

    @Override
    public void add() {
        System.out.println("Oracle eklendi");
    }
}