import java.util.List;

public class Regex {
    private StringBuilder pattern;

    public Regex() {
        this.pattern = new StringBuilder();
    }

    public Regex(List<String> components) {
        this.pattern = new StringBuilder();
        for (String component : components) {
            this.pattern.append(component);
        }
    }

    public void addComponent(String component) {
        this.pattern.append(component);
    }

    public String getPattern() {
        return pattern.toString();
    }
}
