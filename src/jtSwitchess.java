import java.util.ArrayList;
public class jtSwitchess {
    public static void main(String [] args) {


        //BREAK ne işe yarar
        ArrayList<String> günler = new ArrayList<String>();
        int gün = 4;
        switch (gün) {
            case 1 : günler.add("pzt");
            case 2 : günler.add("salı");
            case 3 : günler.add("çrş");
            case 4 : günler.add("prş"); //break; yazarsak sadece bu günü yazar
            case 5 : günler.add("cuma");
            case 6 : günler.add("ctesi");
            case 7 : günler.add("pazar");
            break;
            default: break;
        }
        if (günler.isEmpty()) System.out.println("kontrol ediniz");
        else {
            for (String günn : günler)
                System.out.println(günn);
        }
        System.out.println();
        System.out.println();





        //Multiple case labels
        int ay = 2;
        int yıl = 2000;
        int günsayısı = 0;

        switch (ay){
            case 1: case 3: case 5: case 7:
            case 8: case 10: case 12:
                günsayısı = 31;
                break;

            case 4: case 6: case 9: case 11:
                günsayısı = 30;
                break;

            case 2:
                if (((yıl % 4 == 0) && !(yıl % 100 == 0)) || yıl % 400 == 0){
                günsayısı = 29;
            }
                else günsayısı = 28;
                break;

            default:
                System.out.println("kontrol ediniz");
                break;
        }
        System.out.println("bu aydaki gün sayısı = " + günsayısı);

        System.out.println();
        System.out.println();




        //Java tutorial örneklerden , method ile
        String day = "tHurSDay";
        int dönengünsayısı = jtSwitchess.getdaynumber(day);

        if (dönengünsayısı == 0)
            System.out.println("invalid day");
        else
            System.out.println(dönengünsayısı);

    }


    public static int getdaynumber (String day) {
    int daynumber = 0;
    if (day == null) {
        return daynumber;}

    switch (day.toLowerCase()){
        case "monday" : daynumber = 1; break;
        case "tuesday" : daynumber = 2; break;
        case "wednesday" : daynumber = 3; break;
        case "thursday" : daynumber = 4; break;
        case "friday" : daynumber = 5; break;
        case "saturday" : daynumber = 6; break;
        case "sunday" : daynumber = 7; break;
        default: daynumber = 0; break;
    }
    return daynumber;
    }





}



