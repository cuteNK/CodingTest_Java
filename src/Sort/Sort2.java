package Sort;

import java.util.Arrays;
import java.util.Collections;

public class Sort2 {

	public static void main(String[] args) {
		String[] str = {"a", "1", "��", "A", "3", "��"};
		
		// ���� �� ���
		for(String s : str) {	
			System.out.print(s + " ");
		}
		System.out.println();
		
		Arrays.sort(str, Collections.reverseOrder());
		
		// ���� �� ���
		for(String s : str) {
			System.out.print(s + " ");
		}

	}

}
