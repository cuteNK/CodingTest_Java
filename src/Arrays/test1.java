package Arrays;

import java.util.Arrays;

public class test1 {

	public static void main(String[] args) {
		// 배열 복사
		// Arrays.copyOf(원본 배열, 복사할 길이)
		char[] arr1 = {'J', 'A', 'V', 'A'};
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		
		System.out.println(arr1);
		System.out.println(arr2);
		
		
	}

}
