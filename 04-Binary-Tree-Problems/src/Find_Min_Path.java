import java.util.Arrays;

public class Find_Min_Path {

	public static void main(String[] args) {
		int arr[][] = { { 7, 4, 2 }, { 0, 5,6 }, { 3, 2, 1 } };
		printing(arr);
		int col = arr[0].length;
		int row = arr.length;
		int newArr[][] = new int [row][col];
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j <col; j++) {
				if(i == 0 && j == 0) {
					newArr[i][j] = arr[i][j];
					continue;
				}
				if (i == 0) {
					newArr[i][j]=arr[i][j]+ newArr[i] [j - 1];
				}else if (j == 0) {
					newArr[i][j]=arr[i][j]+ newArr[i - 1] [j];
				}else {
					int a = arr[i][j]+ newArr[i] [j - 1];
					int b = arr[i][j]+ newArr[i - 1] [j];
					newArr[i][j]= Math.min(a, b);
				}
			}
		}
		printing(newArr);
		
	}
	private static void printing(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		System.out.println();
	}
}
