package exercise02;

public class A2_Recursive_Basic {

	public static void main(String[] args) {
		
		printNumbers(5);
		System.out.println(catEyes(10));
		System.out.println(power(2, 4));
		System.out.println(factorial(4));
		System.out.println(fibonacci(8));
		System.out.println(mobilePhone(5));
		System.out.println(sum(635));
		System.out.println(count5(10023155));
		int num[] = { 1, 4, 6, 8, 10, 15, 34, 44 };
		int start = 0;
		int end = num.length - 1;
		int key = 7;
		System.out.println(binarySearch(num, key, start, end));
	}

	private static int binarySearch(int[] num, int key, int start, int end) {
		
		if (start <= end) {
			int middle = (start + end) / 2;
			if (num[middle] > key) {
				return binarySearch(num, key, start , middle - 1);
			}else if (num[middle] < key){
				return binarySearch(num, key, middle + 1, end);
			} else {
				return middle;
			}
		} else {
			return -1;
		}
		
	}






	private static int count5(int num) {

		if (num < 10) {
			return num == 5 ? 1 : 0;
		} else {
			return num % 10 == 5 ? 1 + count5(num / 10) : count5(num / 10);
		}
	}


	private static int sum(int num) {
		if (num <= 9) {
			return num;
		} else {
			return num % 10 + sum(num / 10);
		}
	}



	private static int mobilePhone(int num) {
		if (num == 0) {
			return 0;
		} else if (num % 2 == 0) {
			return 2 + mobilePhone(num - 1);
		} else {
			return 1 + mobilePhone(num - 1);
		}
	}



	private static int fibonacci(int num) {
		if (num == 0) {
			return 0;
		} else if (num == 1) {
			return 1;
		} else {
			return fibonacci(num - 1) + fibonacci(num - 2);
		}
	}



	private static int factorial(int num) {
		if (num == 1) {
			return 1;
		} else {
			return num * factorial(num - 1);
		}
	}



	private static int power(int base, int num) {
		if (num == 0) {
			return 1;
		} else {
			return base * power(base, num - 1);
		}
	}


	private static int catEyes(int num) {
		if (num == 0) {
			return 0;
		} else {	
			return 2 + catEyes(num - 1);
		}
	}



	private static void printNumbers(int num) {
		if (num == 0) {
			return;
		} else {
			System.out.println(num);
			printNumbers(num - 1);
		}
	}

}
