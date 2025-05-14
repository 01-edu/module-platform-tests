import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollect {
	public static Map<Character, List<String>> mapByFirstLetter(Stream<String> s) {
		if (s == null)
			return null;
			
		Map<Character, List<String>> m = s.collect(
			Collectors.groupingBy(str -> Character.toUpperCase(str.charAt(0)))
		);
		
		return m;
	}

	public static Map<Integer, Optional<Integer>> getMaxByModulo4(Stream<Integer> s) {
		return s.collect(Collectors.groupingBy(num -> num % 4, Collectors.maxBy(Integer::compareTo)));
	}

	public static String orderAndConcatWithSharp(Stream<String> s) {
		return s.sorted().collect(Collectors.joining(" # ", "{", "}"));
	}

	public static void main(String[] args) {
        System.out.println(StreamCollect.mapByFirstLetter(Stream.of("Bonjour", "le", "monde !", "bonsoir")));
        System.out.println(StreamCollect.getMaxByModulo4(Stream.of(5, 12, 32, 4, 9, 17, 98, 424, 97, 5843, 48354)));
        System.out.println(StreamCollect.orderAndConcatWithSharp(Stream.of("Hello", "how are you ?", "where do you live ?", "Bordeaux")));
    }
}