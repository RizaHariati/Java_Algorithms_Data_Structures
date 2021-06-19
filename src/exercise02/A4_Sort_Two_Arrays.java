package exercise02;

import java.util.Arrays;

public class A4_Sort_Two_Arrays {

	public static void main(String[] args) {
		int arr1[] = {1, 2, 3, 4, 9};
		int arr2[] = { 2, 5, 7, 8 };

		int newArr[] = new int[arr1.length + arr2.length];
		
		int i = 0;
		int j = 0;
		int index = 0;
		
		
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] <= arr2[j]) {
				newArr[index++] = arr1[i++];
				
			} else {
				newArr[index++] = arr2[j++];
			}
		}
		if (i == arr1.length) {
			while (j < arr2.length) {
				newArr[index++] = arr2[j++];
			}
		} else {
			while (i < arr1.length) {
				newArr[index++] = arr1[i++];
			}
		}
		System.out.println(Arrays.toString(newArr));
	}

}