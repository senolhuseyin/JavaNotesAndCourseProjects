public class Birthday {
    public static void main(String[] args) {

        int gun = 365;
        int deneme = 100;
        int insan = 0;
        int [] a = new int[deneme];

        for (int i=0; i<deneme; i++)
        {
            boolean[] birthday = new boolean[gun];

            while (true)
            {
                insan++;
                int x =(int) (Math.random() * gun);

                // System.out.print(x);
                if (birthday[x]) break;
                birthday[x] = true;
            }

            a [i] = insan ;
            insan=0;
        }

       /* System.out.println();

        for (int r=0; r<deneme; r++)
        {
            System.out.println(a[r]);
        }

        */


        System.out.println();


        int max = a[0];
        for (int k=1; k<deneme; k++)
        {
            if (a[k] > max ) max=a[k];
        }
     //   System.out.println(max);
     //   System.out.println();


        int [] gunler = new int[max+1];

        for (int j=0; j<deneme; j++)
        {
            int q = 2;
            while ( ! (a[j]==q))
            {
                q++;
            }
            gunler[q-1]++;
            q=2;

        }

/*
        for (int w=0; w<max; w++)
        {
            System.out.println( w+1 + " günde denk gelen - günler" + w  + "  " + günler[w]);
        }

        System.out.println();

 */

        double oran = 0.0;
        int day = 1;
        int birtday = 0;


        while (oran<0.5) {
            System.out.println(day + "\t" + birtday + "\t" + oran);

            birtday += gunler[day];
            day++;
            oran = ((double)birtday/(double)deneme);
            if (oran>=0.5)
            {
                System.out.println(day + "\t" + birtday + "\t" + oran);
            }

        }




    }
}
