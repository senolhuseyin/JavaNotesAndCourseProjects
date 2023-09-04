import java.util.Arrays;

public class jtObjects {
    public static void main(String [] args) {

        //Declare and create a point object and two rectangle objects
        Point originOne = new Point(23,94);
        Rectangle rectOne = new Rectangle(originOne,100,200); //merkezi 23,94 olan dikdortgen
        Rectangle rectTwo = new Rectangle(50,100);  //merkezi orjin olan dikdörtgen

        //display rectOne width, height and area
        System.out.println("Width of rectOne: " + rectOne.width);
        System.out.println("Height of rectOne: " + rectOne.height);
        System.out.println("Area of rectOne: " + rectOne.getArea());


        //set rectTwo's position
        rectTwo.origin = originOne;

        //display rectTwo's position
        System.out.println("X Position of rectTwo: " + rectTwo.origin.x);
        System.out.println("Y Position of rectTwo: " + rectTwo.origin.y);

        //move rectTwo and display its new position
        rectTwo.move(40,72);
        System.out.println("X Position of rectTwo: " + rectTwo.origin.x);
        System.out.println("Y Position of rectTwo: " + rectTwo.origin.y);

        System.out.println();
        System.out.println(new Rectangle(100,50).getArea());  //new operatör ...
        System.out.println(new Rectangle().height);
        int areaOfRectangle = new Rectangle(50,20).getArea();
        System.out.println(areaOfRectangle);
        System.out.println();



        int [] areas = {rectOne.getArea(), rectTwo.getArea()};  //bütün üçgenleri nasıl sıralarız ???
        int b = Rectangle.biggerRectangle(areas);
        System.out.println(b);



    }



}




class Point { //origin
    public int x = 0;
    public int y = 0;

    public Point (int a, int b){
        x=a;  //this de koyabiliriz fark etmez
        y=b;
    }
}


class Rectangle { //dikdörtgen
    public int width = 0;
    public int height = 0;
    public Point origin;

    //Four Constructor
    public Rectangle() { //dörtgen oluşturunca origin otomatik olarak 0,0
        origin = new Point(0,0);
    }


    public Rectangle(Point p) { //point'in koordinatları origin olur
        origin = p;
    }

    public Rectangle(int w, int h) {  //merkezi 0,0 olan, width ve height belli olan dörtgen
        origin = new Point(0,0);
        width = w;
        height = h;
    }

    public Rectangle(Point p, int w, int h) {
        origin = p;
        width = w;
        height = h;
    }


    //a method for moving rectangle
    public void move(int x, int y) {
        origin.x = x;
        origin.y = y;
    }

    //a method for computing the area of rectangle
    public int getArea()
    {
        return width * height;
    }


    static int biggerRectangle (int... rects){ //en büyük rectangle bulma
        int x = 0;
        for (int rect : rects){
            if (rect > x) {x=rect;}
        }
        return x;
    }


}