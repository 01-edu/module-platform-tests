import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class MonthlyPeriod {
    public String calculatePeriod(String startDate, String endDate) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate start = LocalDate.parse(startDate, formatter);
            LocalDate end = LocalDate.parse(endDate, formatter);
            Period period = Period.between(start, end);

            int years = period.getYears();
            int months = period.getMonths();

            if (years < 0 || months < 0) {
                period = Period.between(end, start);
                years = period.getYears();
                months = period.getMonths();
            }

            StringBuilder result = new StringBuilder();
            if (years > 0) {
                result.append(years).append(" year").append(years > 1 ? "s" : "");
            }
            if (months > 0) {
                if (result.length() > 0) {
                    result.append(" and ");
                }
                result.append(months).append(" month").append(months > 1 ? "s" : "");
            }
            return result.toString();
        } catch (DateTimeParseException e) {
            return "Error";
        }
    }
}
