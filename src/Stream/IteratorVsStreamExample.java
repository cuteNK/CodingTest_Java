package Stream;

import java.util.*;
import java.util.stream.Stream;

public class IteratorVsStreamExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("����", "������", "����", "��ä�� Let's go");

		// Iterator �̿�
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		
		System.out.println();
		
		// Stream �̿�
		Stream<String> stream = list.stream();
		stream.forEach(name -> System.out.println(name) );
	}

}
