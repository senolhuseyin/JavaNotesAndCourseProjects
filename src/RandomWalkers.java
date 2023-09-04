public class RandomWalkers {
    public static void main (String [] args) {

        int r = 10;
        int trials = 100000;

        int x = 0;
        int y = 0;
        int distance = 0;
        int step = 0;
        double steps = 0.0;

        for (int i = 0; i<trials; i++) {

            while (distance < r) {
                if (Math.random() < 0.25) {
                    x = x + 1;
                } else if (Math.random() < 0.5) {
                    x = x - 1;
                } else if (Math.random() < 0.75) {
                    y = y + 1;
                } else {
                    y = y - 1;
                }

                step = step + 1;
                distance = Math.abs(x) + Math.abs(y);
            }

            steps = steps + step;
            x = 0;
            y = 0;
            step = 0;
            distance = 0;
        }

        System.out.println("average number of steps = " + (steps/trials));
    }
}
