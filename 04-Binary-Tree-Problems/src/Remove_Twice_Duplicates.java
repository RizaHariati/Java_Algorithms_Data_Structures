import java.util.Arrays;

public class Remove_Twice_Duplicates {
	
	public static void main(String[] args) {
		int arr[] = {1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 5, 6, 7, 7, 7, 7};
		int newArr[] = new int [arr.length ];
		int index = 2;
		newArr[0]=arr[0];
		newArr[1]=arr[1];
		for (int i = 2; i < arr.length ; i++) {
		if(newArr[index] != arr[i] && arr[i] != arr[i-2]) {
				
				newArr[index] = arr[i];
				index++;
				
			}
			
		}
		int result[] = new int[index ];
		for (int i = 0; i < result.length; i++) {
			result[i]=newArr[i];
		}
		System.out.println(Arrays.toString(result));
	}
}
