public class RandomWalker {
    public static void main (String [] args) {

        int r = 5;

        int x = 0;
        int y = 0;
        int distance = 0;
        int steps = 0 ;

        System.out.println("(" + x + ", " + y + ")");

        while (distance<r) {
            if (Math.random() < 0.25) {
                x = x + 1;
            } else if (Math.random() < 0.5) {
                x = x - 1;
            } else if (Math.random() < 0.75) {
                y = y + 1;
            } else {
                y = y - 1;
            }

            System.out.println("(" + x + ", " + y + ")");

            steps = steps + 1;
            distance = Math.abs(x) + Math.abs(y);
        }

        System.out.println("steps = " + steps);



    }
}
