import java.util.*;
class DateAndTime{
	public static void main(String[] args) {
		int year  = 2018;
		int month = 8;
		int day = 8;

		/*FOR JAVA8 just import LocalDate and use this

		LocalDate dt = LoclDate.of(year, month, day);
        return(dt.getDayOfWeek().toString());
		*/        


        Calendar c = Calendar.getInstance();
        c.set(year, (month)-1, day);
        System.out.println(c.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG,Locale.US).toUpperCase());
	}
}
