import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class AgeFinder {
    public int calculateAge(String date) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate birthDate = LocalDate.parse(date, formatter);
            LocalDate currentDate = LocalDate.now();
            if (birthDate.isAfter(currentDate)) {
                return -1;
            }
            return Period.between(birthDate, currentDate).getYears();
        } catch (DateTimeParseException e) {
            return -1;
        }
    }
}
