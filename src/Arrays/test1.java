package Arrays;

import java.util.Arrays;

public class test1 {

	public static void main(String[] args) {
		// �迭 ����
		// Arrays.copyOf(���� �迭, ������ ����)
		char[] arr1 = {'J', 'A', 'V', 'A'};
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		
		System.out.println(arr1);
		System.out.println(arr2);
		
		
	}

}
