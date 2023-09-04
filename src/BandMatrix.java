public class BandMatrix {
    public static void main(String [] args) {

        int n = 8;
        int width = 0;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (Math.abs(j - i) > width) {
                    System.out.print("0  ");
                }
                else {
                    System.out.print("*  ");
                }

            }
            System.out.println();
        }
    }
}
