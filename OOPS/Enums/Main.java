package OOPS.Enums;

import java.time.MonthDay;

public class Main {
    enum Week {
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
//    These are enums constant
//        public,static and final type
//        since its final so we can't create child enums
    }
    public static void main(String[] args) {
        Week week;
        week=Week.Monday;
//        for(Week day:Week.values()){
//            System.out.println(day);
//        }
        System.out.println(week);
        System.out.println(week.ordinal());
    }
}
