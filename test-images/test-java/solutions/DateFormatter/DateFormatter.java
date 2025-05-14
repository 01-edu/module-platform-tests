import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

public class DateFormatter {
    private long date;
    private String formattedDate;
    private String format;

    private static final Map<String, String> ACCEPTED_FORMATS = new HashMap<>();

    static {
        ACCEPTED_FORMATS.put("DD/MM/YYYY", "dd/MM/yyyy");
        ACCEPTED_FORMATS.put("DD MONTH YYYY", "dd MMMM yyyy");
        ACCEPTED_FORMATS.put("DD.MM.YYYY", "dd.MM.yyyy");
    }

    public DateFormatter() {
        this.date = System.currentTimeMillis() / 1000L;
        this.format = "DD/MM/YYYY";
        this.formattedDate = formatDate();
    }

    public DateFormatter(long date) {
        this.date = date;
        this.format = "DD/MM/YYYY";
        this.formattedDate = formatDate();
    }

    public DateFormatter(long date, String format) {
        this.date = date;
        setFormat(format);
    }

    public long getDate() {
        return date;
    }

    public String getFormattedDate() {
        return formattedDate;
    }

    public String getFormat() {
        return format;
    }

    public void setDate(long date) {
        this.date = date;
        this.formattedDate = formatDate();
    }

    public void setFormat(String format) {
        if (ACCEPTED_FORMATS.containsKey(format.toUpperCase())) {
            this.format = format.toUpperCase();
            this.formattedDate = formatDate();
        } else {
            System.out.println("Invalid format provided. Format not changed.");
        }
    }

    private String formatDate() {
        Date dateObj = new Date(this.date * 1000);
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.setTime(dateObj);

        int day = calendar.get(Calendar.DAY_OF_MONTH);
        String month = getMonth(calendar.get(Calendar.MONTH));
        int year = calendar.get(Calendar.YEAR);

        switch (this.format) {
            case "DD/MM/YYYY":
                return String.format("%02d/%02d/%d", day, calendar.get(Calendar.MONTH) + 1, year);
            case "DD MONTH YYYY":
                return String.format("%02d %s %d", day, month, year);
            case "DD.MM.YYYY":
                return String.format("%02d.%02d.%d", day, calendar.get(Calendar.MONTH) + 1, year);
            default:
                return "Invalid format";
        }
    }

    private String getMonth(int month) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return months[month];
    }
}
