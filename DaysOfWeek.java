// DaysOfWeek.java

public class DaysOfWeek {
    public static String DayOfWeekStr(int NumberOfDay) {
        String dayStr = ""; // Fix: Added semicolon at the end
        switch (NumberOfDay) {
            case 1:
                dayStr = "Sunday";
                break;
            case 2:
                dayStr = "Monday";
                break;
            case 3:
                dayStr = "Tuesday"; // Fix: Added semicolon at the end
                break;
            case 4:
                dayStr = "Wednesday";
                break;
            case 5:
                dayStr = "Thursday";
                break;
            case 6:
                dayStr = "Friday";
                break;
            case 7:
                dayStr = "Saturday";
                break;
        }
        return dayStr; // Fix: Added return statement
    }
}
