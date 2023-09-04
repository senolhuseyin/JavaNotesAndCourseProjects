public class jtConstructorThis {
    public static void main(String [] args){

        RectangleThis rect1 = new RectangleThis();
        System.out.println(rect1.x + " " + rect1.y + " " + rect1.width + " " + rect1.height);

        RectangleThis rect2 = new RectangleThis(3,5);
        System.out.println(rect2.x + " " + rect2.y + " " + rect2.width + " " + rect2.height);

        RectangleThis rect3 = new RectangleThis(2,2,7,8);
        System.out.println(rect3.x + " " + rect3.y + " " + rect3.width + " " + rect3.height);



    }

}

class RectangleThis{
    public int x, y;
    public int width, height;

   public RectangleThis(int x, int y, int width, int height){ //her değişkeni belirlenen
       this.x = x;
       this.y = y;
       this.width = width;
       this.height = height;
   }

   public RectangleThis() {  //merkezi 0,0 olan 1'e 1 dörtgen //default
       this(0,0,1,1);
   }


   public RectangleThis(int width, int height) { //merkezi 0,0 olan, yüksekliği genişliği belirlenen
       this(0, 0, width, height);
   }

}
