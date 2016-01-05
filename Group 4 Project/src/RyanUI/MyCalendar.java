package RyanUI;
/*===================================================================
Program Name:	MyCalendar.java
Description:	A class to perform date functions
Done by:		Phoon Lee Kien
Admin No:		001234A
Module Group:	IT1204-99
=====================================================================*/
import java.util.*;
import java.text.DecimalFormat;

public class MyCalendar {

	// Get the number of days for second date minus first date
	public static long getDifference(String firstDate, String secDate) {
		GregorianCalendar d1 = getDateGregorian(firstDate);
		GregorianCalendar d2 = getDateGregorian(secDate);
		long difference = 0;
		if ((d1 != null) && (d2 != null))
			difference = d2.getTimeInMillis() - d1.getTimeInMillis();

		return difference / (24 * 60 * 60 * 1000);
	}

	// Convert GregorianCalendar type to String type for display
	public static String getDateString(GregorianCalendar d1) {
		DecimalFormat fmt = new DecimalFormat("00");
		int day = d1.get(Calendar.DATE);
		int month = d1.get(Calendar.MONTH) + 1;
		int year = d1.get(Calendar.YEAR);
		return fmt.format(day) + "-" + fmt.format(month) + "-"
				+ fmt.format(year);
	}

	// Convert String type to GregorianCalendar type for arithmetic
	// If date is invalid, method will return null
	public static GregorianCalendar getDateGregorian(String date) {
		int day, month, year;
		GregorianCalendar temp = null;
		try {
			Scanner sc = new Scanner(date);
			sc.useDelimiter("-");
			day = sc.nextInt();
			month = sc.nextInt();
			year = sc.nextInt();
			temp = new GregorianCalendar(year, month - 1, day);
			temp.setLenient(false);
			temp.get(Calendar.YEAR); // activate the validation of date
		} catch (Exception e) {
			System.out.println("Invalid Date!");
			temp = null;
		}
		return temp;
	}
	public static void main(String[] args) {
		String d1 = "05-02-2010";
		String d2 = "07-03-2010";
		Long diff = MyCalendar.getDifference(d1, d2);
		System.out.println("First Date: " + d1);
		System.out.println("Second Date: " + d2);
		System.out.println("Difference in day/s: " + diff);
	}
}