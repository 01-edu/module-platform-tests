import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConfigProtector {
    public String hideSensitiveData(String configFile, List<String> sensitiveKeys) {
        for (String key : sensitiveKeys) {
            String regex = key + "=([^\n]*)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(configFile);
            StringBuffer sb = new StringBuffer();
            while (matcher.find()) {
                String value = matcher.group(1);
                String hiddenValue = "*".repeat(value.length());
                matcher.appendReplacement(sb, key + "=" + hiddenValue);
            }
            matcher.appendTail(sb);
            configFile = sb.toString();
        }
        return configFile;
    }
}
