import java.util.Scanner;

public class DisplayCalendar {

    // Method to get name of month
    public static String getMonthName(int month) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return months[month - 1];
    }

    // Method to get number of days in a month
    public static int getNumberOfDays(int month, int year) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29; // February in a leap year
        }
        return days[month - 1];
    }

    // Method to check if year is leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get first day of month
    public static int getFirstDayOfMonth(int month, int year) {
        int d = 1; // Start with the 1st day of the month
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        return (d + x + (31 * m) / 12) % 7; 
    }

    // Method to display calendar
    public static void displayCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int daysInMonth = getNumberOfDays(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

        // Print the calendar header
        System.out.println("\n    " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print initial spaces for the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);

            // Move to the next line after Saturday
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println(); // Final new line for formatting
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for month and year
        System.out.print("Enter month : ");
        int month = scanner.nextInt();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        // Display the calendar
        displayCalendar(month, year);

        scanner.close();
    }
}
