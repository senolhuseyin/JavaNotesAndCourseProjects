import java.util.BitSet;
import java.util.Scanner;

public class HRBitSet {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BitSet bitSet1 = new BitSet(n);
        BitSet bitSet2 = new BitSet(n);
        BitSet[] bitSets = {bitSet1, bitSet2};

        int m = scanner.nextInt();

        while (m-- > 0) {
            String operation = scanner.next();
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt();

            switch (operation) {
                case "AND":
                    bitSets[a].and(bitSets[b - 1]);

                    System.out.println(bitSet1.get(0) + " " + bitSet1.get(1) + " " +
                            bitSet1.get(2) + " " + bitSet1.get(3) + " " + bitSet1.get(4));
                    System.out.println(bitSet2.get(0) + " " + bitSet2.get(1) + " " +
                            bitSet2.get(2) + " " + bitSet2.get(3) + " " + bitSet2.get(4));

                    System.out.println(bitSet1.cardinality() + " " + bitSet2.cardinality());
                    break;
                case "OR":
                    bitSets[a].or(bitSets[b - 1]);

                    System.out.println(bitSet1.get(0) + " " + bitSet1.get(1) + " " +
                            bitSet1.get(2) + " " + bitSet1.get(3) + " " + bitSet1.get(4));
                    System.out.println(bitSet2.get(0) + " " + bitSet2.get(1) + " " +
                            bitSet2.get(2) + " " + bitSet2.get(3) + " " + bitSet2.get(4));

                    System.out.println(bitSet1.cardinality() + " " + bitSet2.cardinality());
                    break;
                case "XOR":
                    bitSets[a].xor(bitSets[b - 1]);

                    System.out.println(bitSet1.get(0) + " " + bitSet1.get(1) + " " +
                            bitSet1.get(2) + " " + bitSet1.get(3) + " " + bitSet1.get(4));
                    System.out.println(bitSet2.get(0) + " " + bitSet2.get(1) + " " +
                            bitSet2.get(2) + " " + bitSet2.get(3) + " " + bitSet2.get(4));

                    System.out.println(bitSet1.cardinality() + " " + bitSet2.cardinality());
                    break;
                case "FLIP":
                    bitSets[a].flip(b);

                    System.out.println(bitSet1.get(0) + " " + bitSet1.get(1) + " " +
                            bitSet1.get(2) + " " + bitSet1.get(3) + " " + bitSet1.get(4));
                    System.out.println(bitSet2.get(0) + " " + bitSet2.get(1) + " " +
                            bitSet2.get(2) + " " + bitSet2.get(3) + " " + bitSet2.get(4));

                    System.out.println(bitSet1.cardinality() + " " + bitSet2.cardinality());
                    break;
                case "SET":
                    bitSets[a].set(b);

                    System.out.println(bitSet1.get(0) + " " + bitSet1.get(1) + " " +
                            bitSet1.get(2) + " " + bitSet1.get(3) + " " + bitSet1.get(4));
                    System.out.println(bitSet2.get(0) + " " + bitSet2.get(1) + " " +
                            bitSet2.get(2) + " " + bitSet2.get(3) + " " + bitSet2.get(4));

                    System.out.println(bitSet1.cardinality() + " " + bitSet2.cardinality());
                    break;
            }
        }

    }
}

/*
        5 4
        AND 1 2
        SET 1 4
        FLIP 2 2
        OR 2 1
*/
