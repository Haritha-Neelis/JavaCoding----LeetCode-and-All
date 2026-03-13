import java.util.*;
import java.util.stream.*;
public class StringOccurrencesList
{
	public static void main(String[] args) {
		List<String> fruits = List.of("apple", "banana", "mango",
		                              "apple", "apple", "banana");

		Map<String, Long> result = fruits.stream().
		                              collect(Collectors.groupingBy(s -> s,
		                                      Collectors.counting()));
		System.out.println(result);
	}
}
