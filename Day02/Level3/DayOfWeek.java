public class DayOfWeek {
    public static void main(String[] args) {
		
        // getting the input from command line and storing them in integer variables using Parse input arguments
        int month = Integer.parseInt(args[0]); // Month
        int day = Integer.parseInt(args[1]); // Day
        int year = Integer.parseInt(args[2]); // Year

        // Applying the formulas for the Gregorian calendar
        int yearAdjustments = year - (14 - month) / 12; // adjustment of years 
        int leapYearAdjustments = yearAdjustments + yearAdjustments / 4 - yearAdjustments / 100 + yearAdjustments / 400; // adjustment of leap years
        int monthAdjustments = month + 12 * ((14 - month) / 12) - 2; // adjustment of months
        int dayOfTheWeek = (day + leapYearAdjustments + (31 * monthAdjustments) / 12) % 7; // day of the week calculation

        // Printing the result
        System.out.println(dayOfTheWeek);
    }
}