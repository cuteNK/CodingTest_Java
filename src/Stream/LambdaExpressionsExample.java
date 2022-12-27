package Stream;

import java.util.*;
import java.util.stream.Stream;

public class LambdaExpressionsExample {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("������Ÿ", 98),
				new Student("����~~��������", 97)
		);

		Stream<Student> stream = list.stream();
		stream.forEach(s -> {
			String name = s.getName();
			int score = s.getScore();
			System.out.println(name + "-" + score);
		});
	}

}
