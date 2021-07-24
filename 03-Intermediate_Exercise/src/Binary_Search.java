
public class Binary_Search {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 5, 6 };
		int start = 0;
		int end = arr.length - 1;
		System.out.println(findIndex(3, start, end, arr));
		System.out.println(findIndex(0, start, end, arr));
		System.out.println(findIndex(5, start, end, arr));
	}

	private static int findIndex(int val, int start, int end, int[] arr) {
		int mid = (start + end)/2;
		if(start > end) {
			if(arr[mid] > val) {
				return mid - 1;
			}else {
				return mid + 1;
			}
		}
		
		if(arr[mid] == val) {
			return mid;
		}
		else if(arr[mid] > val) {
			return findIndex(val, start, mid - 1, arr);
		}else {
			return findIndex(val, mid + 1, end, arr);
		}
	}

}