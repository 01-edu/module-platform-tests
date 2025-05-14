public class StringContains {
	public static boolean isStringContainedIn(String substring, String s) {
		if (s == null || substring == null || !s.contains(substring))
			return false;

		return true;
	}
}
