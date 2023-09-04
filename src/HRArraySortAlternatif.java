
public class HRArraySortAlternatif {

    static boolean asd(String a, String b) {

        if (a.length() != b.length()){
            return false;
        }

        else {

            char[] chara = a.toLowerCase().toCharArray();
            char[] charb = b.toLowerCase().toCharArray();

/*          KOLAY YOLU
            java.util.Arrays.sort(chara);
            java.util.Arrays.sort(charb);

            if (new String (chara).equals(new String(charb))) {
                return true;
            }
            else {return false;}*/


            boolean bol = true;

            control:
            for (int j = 0; j < a.length(); j++) {

                for (int k = j; k < b.length(); k++) {

                    if ((chara[j] != charb[k])) {
                        bol = false;
                    } else {
                        char temp = charb[j];
                        charb[j] = charb[k];
                        charb[k] = temp;
                        bol = true;
                        continue control;
                    }

                }
            }

            return bol;

        }
    }


    public static void main(String[] args) {

        //Scanner olacak
        boolean rt = asd("asd12fghjk", "as2dFG1HjK");
        System.out.println(rt);


    }
}
