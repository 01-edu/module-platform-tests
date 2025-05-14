import java.util.Arrays;

public class CleanExtract {
    public static String extract(String text) {
        StringBuilder sb = new StringBuilder();
        Arrays.asList(text.split("\\|")).stream()
        .map(s -> {
            int start = s.indexOf('.');
            if (start == -1)
                return s;
            int end = s.lastIndexOf('.');
            end = end == -1 || end == start ? s.length() : end;
            start += end > start ? 1:0;
            return s.substring(start, end).trim();
        })
        .filter(x -> x != "")
        .forEach(s -> sb.append(s).append(" "));
        return sb.toString().trim();
    }
}