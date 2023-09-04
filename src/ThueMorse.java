public class ThueMorse {
    public static void main(String [] args) {

        int n = 10;
        String sıfır   = "0";
        String bir  = "1";

        for (int i = 2; i<2*n; i*=2)
        {
            String t = sıfır;
            String m = bir;
            sıfır += m;
            bir += t;
            System.out.println(sıfır);
        }



        int [] tablo = {0,1,1,0,1,0,0,1,1,0,0,1,0,1,1,0,1,0,0,1,0,1,1,0,
                0,1,1,0,1,0,0,1,1,0,0,1,0,1,1,0,0,1,1,0,1,0,0,1,0,1,1,0,
                1,0,0,1,1,0,0,1,0,1,1,0,1,0,0,1,0,1,1,0,0,1,1,0,1,0,0,1,
                0,1,1,0,1,0,0,1,1,0,0,1,0,1,1,0,0,1,1,0,1,0,0,1,1,0,0,1,
                0,1,1,0,1,0,0,1,0,1,1,0,0,1,1,0,1,0,0,1};

     /*   char [] tablo = new char[128];

        for (int j=0; j<n; j++)
            tablo[j] = sıfır.charAt(j);

*/



        for (int k=0; k<n; k++)
        {
            for (int l=0; l<n; l++)
            {
                int x = tablo[k];
                int y = tablo[l];

                if (x==y)
                    System.out.print("+  ");
                else System.out.print("-  ");
            }
            System.out.println();
        }
    }
}
