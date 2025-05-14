import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUnique {
    public char findFirstUnique(String s) {
        if (s == null || s.isEmpty()) {
            return '_';
        }

        Map<Character, Integer> charCount = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return '_';
    }
}
