public class ToString {
    public static void main(String[] args) {
        Car car = new Car("bmw", 2011);

        System.out.println(car);
    }
}

class Car {
    String marka;
    int model;

    public Car (String marka, int model) {
        this.marka = marka;
        this.model = model;
    }

    public String toString (){
        return marka + model;
    }
}
