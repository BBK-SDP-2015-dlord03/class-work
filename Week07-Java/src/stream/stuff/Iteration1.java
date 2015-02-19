package stream.stuff;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Iteration1 {
	
	public static void main(String[] args) {
		
		List<String> friends = Arrays.asList("Betty", "Bob", "James");
		
		// Original -- Classic loop.
		System.out.println("\nClassic Loop");
		for (int i = 0; i < friends.size(); i++) {
			System.out.println(friends.get(i));
		}
		
		// Java 6 -- Iterators.
		System.out.println("\nIterators");
		for (String friend : friends) {
			System.out.println(friend);
		}
		
		// Java 8 -- Functional.
		System.out.println("\nFunctional");
		friends.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}});

		// Java 8 -- Lambdas.
		System.out.println("\nLambdas 1");
		friends.forEach((String name) -> System.out.println(name));
		
		// Java 8 -- Lambdas simpler without casting.
		System.out.println("\nLambdas 2");
		friends.forEach(name -> System.out.println(name));
		
		// Java 8 -- Method reference.
		System.out.println("\nMethod Reference");
		friends.forEach(System.out::println);
		
		// Java 8 -- Stream maps 1.
		System.out.println("\nSteam 1");
		friends.stream()
			.map(name -> name.toUpperCase())
			.forEach(System.out::println);
		
		// Java 8 -- Stream maps 2.
		System.out.println("\nSteam 2");
		System.out.println(friends.stream()
			.map(name -> name.length())
			.count());
		
		// Java 8 -- Stream maps 3.
		System.out.println("\nSteam 3");
		friends.stream()
			.map(name -> name.length())
			.forEach(count -> System.out.println(count));
		
	}

}
