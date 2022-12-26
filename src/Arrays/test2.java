package Arrays;

import java.util.Arrays;

public class test2 {

	public static void main(String[] args) {
		// Arrays.copyOf(원본 배열, 복사할 길이)
		int[] arr = {0, 1, 2, 3, 4};
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		int[] arr3 = Arrays.copyOf(arr, 3);
		int[] arr4 = Arrays.copyOf(arr, 7);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
	}

}
