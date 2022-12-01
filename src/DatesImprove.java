import java.util.List;

public class DatesImprove {
    /*
      Origin from http://pages.cs.wisc.edu/~vernon/cs367/tutorials/jdb.tutorial.html
      Modified by Jeff C.
    */

    /**
     * @param month An integer in the inclusive range (1, 12)
     * @return The number of days in the relevant month
     */
    public static int daysInMonth (int month) {
        if (month == 2) {
            return 28;
        } else if (List.of(4, 6, 9, 11).contains(month)) {
            return 30;
        }
        return 31;
    }
    public static void main (String[] args) {
        int someMonth, someDay;
        int laterMonth, laterDay;
        int aMonth;
        someMonth = Integer.parseInt(args[0]);
        someDay = Integer.parseInt(args[1]);
        laterMonth = Integer.parseInt(args[2]);
        laterDay = Integer.parseInt(args[3]);

        /* Used to record what day in the year the first day  */
        /* of someMonth and laterMonth are. */
        int someDayInYear = 0;
        int laterDayInYear = 0;
        for (aMonth = 1; aMonth < someMonth; aMonth = aMonth + 1) {
            someDayInYear = someDayInYear + daysInMonth(aMonth);
        }
        for (aMonth = 1; aMonth < laterMonth; aMonth = aMonth + 1) {
            laterDayInYear = laterDayInYear + daysInMonth(aMonth);
        }
        /* The answer */
        int daysBetween = 0;
        System.out.println("The difference in days between " +
                someMonth + "/" + someDay + " and " +
                laterMonth + "/" + laterDay + " is: ");
        daysBetween = laterDayInYear - someDayInYear;
        daysBetween = daysBetween + laterDay - someDay;
        System.out.println(daysBetween);
    }
}
