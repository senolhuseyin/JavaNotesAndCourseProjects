public class Switches {
    public static void main (String[] args ){

        String day = "wednesday" ;

        switch (day) {

            case "monday" : System.out.println("it is monday");
            break;
            case "tuesday" : System.out.println("it is tuesday");
            break;
            case "wednesday" : System.out.println("it is wednesday");
            break;
            case "thursday" : System.out.println("it is thursday");
            break;
            case "friday" : System.out.println("it is friday");
            break;
            case "saturday" : System.out.println("it is saturday");
            break;
            case "sunday" : System.out.println("it is sunday");
            break;
            default:
                System.out.println("it is not a day");

        }
        System.out.println();

        //böyle de yazılabilir
        switch (day) {
            case "monday" -> System.out.println("it is monday");
            case "tuesday" -> System.out.println("it is tuesday");
            case "wednesday" -> System.out.println("it is wednesday");
            case "thursday" -> System.out.println("it is thursday");
            case "friday" -> System.out.println("it is friday");
            case "saturday" -> System.out.println("it is saturday");
            case "sunday" -> System.out.println("it is sunday");
            default -> System.out.println("it is not a day");
        }






    }
}


/**  java tutorial örnek
    int month = 8;
    String monthString;
        switch (month) {
                case 1:  monthString = "January";
                break;
                case 2:  monthString = "February";
                break;
                case 3:  monthString = "March";
                break;
                case 4:  monthString = "April";
                break;
                case 5:  monthString = "May";
                break;
                case 6:  monthString = "June";
                break;
                case 7:  monthString = "July";
                break;
                case 8:  monthString = "August";
                break;
                case 9:  monthString = "September";
                break;
                case 10: monthString = "October";
                break;
                case 11: monthString = "November";
                break;
                case 12: monthString = "December";
                break;
default: monthString = "Invalid month";
        break;
        }
        System.out.println(monthString);
*/