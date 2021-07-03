package exercise01;

import java.util.Arrays;

public class ScratchPad {
	public static void main(String[] args) {
		// int[] array_nums = { 1, 7, 8, 5, 7, 13, 0, 2, 4, 9 };
		int[] array_nums = { 2, 4, 5, 7, 9, 8, 0, 13, 8, 9 };
		int i = 0;
		while (i < array_nums.length) {
			if (array_nums[i] % 2 == 0) {
				for (int j = i + 1; j < array_nums.length; j++) {
					if (array_nums[j] % 2 != 0) {
						int temp = array_nums[j];
						array_nums[j] = array_nums[i];
						array_nums[i] = temp;
						i++;
						System.out.println(Arrays.toString(array_nums));
					}
				}
			}
		}
		System.out.println(Arrays.toString(array_nums));
	}
}