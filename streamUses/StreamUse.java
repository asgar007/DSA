package streamUses;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamUse {
	
	public static void main(String[] args) {
		
		String s = "ItrustmyLord";
		String[] ch = s.split("");
		Map<String, Long> map = Arrays.stream(ch).collect(Collectors.groupingBy(e->e, Collectors.counting()));
//		System.out.println("No of Letters in String");
//		System.out.println(map);
		
		/*duplicates elements*/
		Arrays.stream(ch).collect(Collectors.groupingBy(e->e, Collectors.counting()))
			.entrySet().stream()
			.filter(e->e.getValue() > 1)
			.map(e->e.getKey())
			.forEach(System.out::println);
		
		/* Find the second Highest Element in Array*/
		int[] a = {4,5,6,2,7,1,9,12};
		int findFirst = Arrays.stream(a).boxed()
		.sorted((e1,e2)-> e2-e1)
		.skip(1)
		.findFirst()
		.get();
		System.out.println(findFirst);
		
		/*Find Longest String in Array*/
		String[] strArray = {"Ali", "Shyam", "Dubai", "Bangalore"};
		Optional<String> collect = Arrays.stream(strArray).collect(Collectors.maxBy(Comparator.comparingInt(e->e.length())));
		System.out.println(collect.get());
		
		/*Find Number starting with 1*/
		Arrays.stream(a).boxed()
			.map(e->e+"")
			.filter(e->e.startsWith("1"))
			.forEach(System.out::println);
		
	}

}
