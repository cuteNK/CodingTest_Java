package Arrays;

import java.util.Arrays;

public class test3 {

	public static void main(String[] args) {
		// �迭�� ��� - toString()
		int[] arr = {0, 1, 2, 3, 4};
		int[][] arr2D = {{11, 12}, {21, 22}};
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr2D));
		
		// �迭 �׸� ��
		String[][] str2D = new String[][] {{"aaa","bbb"}, {"AAA","BBB"}};
		String[][] str2D2 = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
		
		System.out.println(Arrays.equals(str2D, str2D2));		// 1�� �׸��� ���� ��
		System.out.println(Arrays.deepEquals(str2D, str2D2));	// ��ø�� �迭�� �׸���� ��
	}

}
