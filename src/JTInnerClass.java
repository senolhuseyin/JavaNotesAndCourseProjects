public class JTInnerClass {   //class static olamaz ama inner class static olabilir.
    private final static int SIZE = 15;
    private int[] arrayOFInts = new int[SIZE];

    public JTInnerClass() {
        for (int i = 0; i < SIZE; i++){
            arrayOFInts[i] = i;
        }
    }

    public void printEven() {
        //çift değerleri yazdırma
        JTIterator iterator = this.new evenIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        System.out.println();
    }



    interface JTIterator extends java.util.Iterator<Integer> {}

        // Inner class implements the DataStructureIterator interface,
        // which extends the Iterator<Integer> interface
        private class evenIterator implements JTIterator{

            // Start stepping through the array from the beginning
            private int nextIndex = 0;

            @Override
            public boolean hasNext() {

                // dizideki son eleman olup olmadığını kontrol
                return (nextIndex <= SIZE - 1);
            }

            public Integer next()  {

                //çift index
                Integer retValue = Integer.valueOf(arrayOFInts[nextIndex]);

                nextIndex += 2;
                return retValue;
            }
        }


        public static void main(String [] arge){
        //diziyi tam sayı değerleri ile doldurup çiftleri yazdırıyoruz
            JTInnerClass say = new JTInnerClass();
            say.printEven();
        }
}
