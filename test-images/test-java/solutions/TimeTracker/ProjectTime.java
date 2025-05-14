import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProjectTime {
    private String startTime;
    private String endTime;
    private long hoursLogged;

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    public ProjectTime(String start, String end) {
        setStartTime(start);
        setEndTime(end);
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
        updateHoursLogged();
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
        updateHoursLogged();
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getHoursLogged() {
        if (hoursLogged == -1) {
            return "-1";
        } else if (hoursLogged < 120) {
            return String.format("%d m", hoursLogged);
        } else if (hoursLogged / 60 < 120) {
            return String.format("%d h", hoursLogged / 60);
        } else if (hoursLogged / 60 < 2880) { // 120 days * 24 hours
            return String.format("%d d", hoursLogged / 60 / 24);
        } else {
            return String.format("%d mo", hoursLogged / 60 / 720); // 1 month = 30 days
        }
    }

    private void updateHoursLogged() {
        try {
            Date start = DATE_FORMAT.parse(startTime);
            Date end = DATE_FORMAT.parse(endTime);

            long diffInMillis = end.getTime() - start.getTime();
            hoursLogged = diffInMillis / (1000 * 60);
            if (hoursLogged < 0) {
                hoursLogged = -1;
            }
        } catch (ParseException | NullPointerException e) {
            hoursLogged = -1;
        }
    }
}
