import java.util.Set;

public class SetEquals {
    public static boolean areSetsEqual(Set<String> set1, Set<String> set2) {
        // Use the equals method from the Set interface to check if the two sets are equal.
        return set1.equals(set2);
    }
}