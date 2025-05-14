import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.DayOfWeek;

public class DayOfWeekFinder {
    public String findNextDayOfWeek(String startDate, String dayOfWeek) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate start = LocalDate.parse(startDate, formatter);
            DayOfWeek targetDay = DayOfWeek.valueOf(dayOfWeek.toUpperCase());

            int daysToAdd = (targetDay.getValue() - start.getDayOfWeek().getValue() + 7) % 7;
            daysToAdd = daysToAdd == 0 ? 7 : daysToAdd; // Ensure we get the next occurrence

            LocalDate resultDate = start.plusDays(daysToAdd);
            return resultDate.format(formatter);
        } catch (DateTimeParseException | IllegalArgumentException e) {
            return "Error";
        }
    }
}
