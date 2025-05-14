import java.util.Map;

public class MapEquals {
    public static boolean areMapsEqual(Map<String, Integer> map1, Map<String, Integer> map2) {
        // Use the equals method from the Map interface to check if the two maps are equal.
        return map1.equals(map2);
    }
}
