import java.util.Arrays;

public class Largest_Sum_SubArray{
	public static void main(String[] args) {
		
		int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		int start = 0,  end = 0;
		int max = arr[0];
		int sum = arr[0];
				
		for (int j = 1; j < arr.length; j++) {
			if(arr[j] > (sum + arr[j])) {
				sum =arr[j];
				if(max <= sum) {
					start = j;
					end = j;
				}
			}else {
				sum = sum + arr[j];
				if(max <= sum) {
					end = j ;
				}
			}
			max = max> sum? max : sum;
		}	
		int[] newArr = new int[end - start + 1];
		int index = 0;
		for (int i = start; i <= end; i++) {
			newArr[index++]= arr[i];
		}
		
		System.out.println(Arrays.toString(newArr));	
		
	}
}