
class CustomerManager {
    private BaseLogger logger;
    public CustomerManager(BaseLogger logger){
        this.logger = logger;
    }
    void add (){
        System.out.println("müşteri eklendi");
        this.logger.log("müşteri log");
    }
}

public class Polimorfizm {
    public static void main (String [] args) {


        CustomerManager ahmet = new CustomerManager(new EmailLogger());
        ahmet.add();

    }
}

class BaseLogger {
    public void log (String message){
        System.out.println("base log : " + message);
    }
}

class DatabaseLogger extends BaseLogger {
    public void log (String message){
        System.out.println("database log : " + message);
    }
}

class FileLogger extends BaseLogger {
    public void log (String message){
        System.out.println("file log : " + message);
    }
}

class EmailLogger extends BaseLogger {
    public void log (String message){
        System.out.println("email log : " + message);
    }
}
