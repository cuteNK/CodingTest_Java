package Arrays;

import java.util.Arrays;

public class test4 {

	public static void main(String[] args) {
		// �迭 ä���
		int[] arr = new int[5];
		Arrays.fill(arr, 9);
		Arrays.setAll(arr, (i) -> (int)(Math.random() * 5) + 1);

	}

}
