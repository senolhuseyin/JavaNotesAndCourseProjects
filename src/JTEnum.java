enum Day { //extend java.lang.Enum --default olarak extend ediyor
    // javada birden fazla parent olamadığı için başka class extend edemez
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}

public class JTEnum {

    Day day;

    public JTEnum (Day day){
        this.day = day;
    }

    public void tellItLikeItIs () {
        switch (day) {
            case MONDAY :
                System.out.println("mondayy are bad");
                break;
            case FRIDAY:
                System.out.println("fridays are better");
                break;
            case SATURDAY: case SUNDAY:
                System.out.println("weekends are best");
                break;
            default:   // case TUESDAY: case THURSDAY: case WEDNESDAY:
                System.out.println("midweek days are so-so");
                break;
        }
    }

    public static void main(String[] args){

        JTEnum monday = new JTEnum(Day.MONDAY);
        monday.tellItLikeItIs();
        JTEnum tuesday = new JTEnum(Day.TUESDAY);
        tuesday.tellItLikeItIs();
        JTEnum wednesday = new JTEnum(Day.WEDNESDAY);
        wednesday.tellItLikeItIs();
        JTEnum thursday = new JTEnum(Day.THURSDAY);
        thursday.tellItLikeItIs();
        JTEnum friday = new JTEnum(Day.FRIDAY);
        friday.tellItLikeItIs();
        JTEnum saturday = new JTEnum(Day.SATURDAY);
        saturday.tellItLikeItIs();
        JTEnum sunday = new JTEnum(Day.SUNDAY);
        sunday.tellItLikeItIs();

    }

}