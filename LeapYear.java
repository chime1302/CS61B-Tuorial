/**
 * Class that determines whether or not a year is a leap year.
 * @author YOUR NAME HERE
 */
public class LeapYear {

    /**
     * Determines if a given year is a leap year.
     * @param year to be analyzed
     * @return true if the year is a leap year, false otherwise
     */
    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }

    /**
     * Calls isLeapYear to print the correct statement.
     * @param year to be checked
     */
    private static void checkLeapYear(int year) {
        if (isLeapYear(year)) {
            System.out.printf("%d is a leap year.\n", year);
        } else {
            System.out.printf("%d is not a leap year.\n", year);
        }
    }

    /**
     * Must be provided an integer as a command line argument ARGS.
     */
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please enter command line arguments.");
            System.out.println("e.g. java LeapYear 2000");
            return; // 添加返回以防止继续执行
        }
        for (String arg : args) {
            try {
                int year = Integer.parseInt(arg);
                checkLeapYear(year);
            } catch (NumberFormatException e) {
                System.out.printf("%s is not a valid number.\n", arg);
            }
        }
    }
}
