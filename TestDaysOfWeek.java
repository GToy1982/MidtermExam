// TestDaysOfWeek.java

public class TestDaysOfWeek {
    public static void main(String[] args) {
        System.out.println("Days Of week: ");
        for (int i = 1; i <= 7; i++) { // Fix: Changed loop condition from i < 8 to i <= 7
            System.out.println("Number: " + i + "\tDay Of Week: " + DaysOfWeek.DayOfWeekStr(i)); // Fix: Added semicolon at the end
        }
    }
}

