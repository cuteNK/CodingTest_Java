package Sort;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		String[] str = {"a", "1", "가", "A", "3", "나"};
		
		// 정렬 전 출력
		for(String s : str) {	
			System.out.print(s + " ");
		}
		System.out.println();
		
		Arrays.sort(str);
		
		// 정렬 후 출력
		for(String s : str) {
			System.out.print(s + " ");
		}

	}

}
