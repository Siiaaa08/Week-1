//importing time package
import java.time.*;
import java.time.format.DateTimeFormatter;
//Creating the class 
public class Arithmetic {
    public static void main(String[] args) {
        // Taking input from the user for the initial date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.print("Enter a date (yyyy-MM-dd): ");
        java.util.Scanner input = new java.util.Scanner(System.in);
        String inputDate = input.nextLine();
        LocalDate date = LocalDate.parse(inputDate, formatter);
        LocalDate newDate = date.plusDays(7)
                                .plusMonths(1)
                                .plusYears(2);
        newDate = newDate.minusWeeks(3);

        // Displaying the resulting date
        System.out.println("Resulting date after addition and subtraction: " + newDate);
    }
}