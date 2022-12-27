package Stream;

import java.util.*;
import java.util.stream.Stream;

public class IteratorVsStreamExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("문별", "문상훈", "문빈", "문채영 Let's go");

		// Iterator 이용
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		
		System.out.println();
		
		// Stream 이용
		Stream<String> stream = list.stream();
		stream.forEach(name -> System.out.println(name) );
	}

}
