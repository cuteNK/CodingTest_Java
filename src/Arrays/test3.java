package Arrays;

import java.util.Arrays;

public class test3 {

	public static void main(String[] args) {
		// 배열의 출력 - toString()
		int[] arr = {0, 1, 2, 3, 4};
		int[][] arr2D = {{11, 12}, {21, 22}};
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr2D));
		
		// 배열 항목 비교
		String[][] str2D = new String[][] {{"aaa","bbb"}, {"AAA","BBB"}};
		String[][] str2D2 = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
		
		System.out.println(Arrays.equals(str2D, str2D2));		// 1차 항목의 값만 비교
		System.out.println(Arrays.deepEquals(str2D, str2D2));	// 중첩된 배열의 항목까지 비교
	}

}
