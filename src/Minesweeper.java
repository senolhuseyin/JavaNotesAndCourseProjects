public class Minesweeper {
    public static void main(String [] args) {

        int m = 9;
        int n= 9;
        int k = 10;

        char [] [] tarla = new char [m] [n];

        boolean [] [] mine = new boolean [m][n];

        int z = 0;
        while (z<k) {
                int a = (int) (Math.random() * m);
                int b = (int) (Math.random() * n);
                if (!mine[a][b]) {
                    tarla[a][b] = '*';
                    mine[a][b] = true;
                    z++;
                }
        }


        for (int c=0; c<m; c++)
        {
            for (int d=0; d<n; d++)
            {
                if (! mine [c][d])
                {
                    tarla [c][d] = (int) ('0') ;
                }
            }
        }



/*
        for (int h=0; h<m; h++)
        {
            for (int j=0; j<n; j++){

                if (mine[h][j])
                {
                    if (! (j+2>n))  {tarla[h][j+1]++;}
                    if (! (j-1<0))  {tarla[h][j-1]++;}
                    if (! (h+2>m))  {tarla[h+1][j]++;}
                    if (! (h-1<0))  {tarla[h-1][j]++;}
                    if (! (h+2>m) && ! (j+2>n))   {tarla[h+1][j+1]++;}
                    if (! (h+2>m) && ! (j-1<0))   {tarla[h+1][j-1]++;}
                    if (! (h-1<0) && ! (j-1<0))   {tarla[h-1][j-1]++;}
                    if (! (h-1<0) && ! (j+2>n))   {tarla[h-1][j+1]++;}

                }
            }
        }

 */


        for (int h=0; h<m; h++)
        {
            for (int j=0; j<n; j++){

                if (! mine[h][j])
                {
                    if (! (j+2>n)) { if (tarla[h][j+1]=='*')  {tarla[h][j]++;} }
                    if (! (j-1<0)) { if (tarla[h][j-1]=='*')  {tarla[h][j]++;} }
                    if (! (h+2>m)) { if (tarla[h+1][j]=='*')  {tarla[h][j]++;} }
                    if (! (h-1<0)) { if (tarla[h-1][j]=='*')  {tarla[h][j]++;} }

                    if (! (h+2>m) && ! (j+2>n)) {if (tarla[h+1][j+1]=='*')  {tarla[h][j]++;} }
                    if (! (h+2>m) && ! (j-1<0)) {if (tarla[h+1][j-1]=='*')  {tarla[h][j]++;} }
                    if (! (h-1<0) && ! (j-1<0)) {if (tarla[h-1][j-1]=='*')  {tarla[h][j]++;} }
                    if (! (h-1<0) && ! (j+2>n)) {if (tarla[h-1][j+1]=='*')  {tarla[h][j]++;} }

                }
            }
        }








        for (int l=0; l<m; l++)
        {
            for (int t=0; t<n; t++)
            {
                System.out.print(tarla [l][t] +"  ");
            }
            System.out.println();
        }

    }
}
