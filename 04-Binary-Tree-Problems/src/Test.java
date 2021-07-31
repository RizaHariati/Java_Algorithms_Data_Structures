

public class Test {

	public static void main(String[] args) {

		System.out.println(fib(5));

	}

	private static int fib(int num) {
		if (num == 0 || num == 1) {
			return 1;
		}
		return fib(num - 1) + fib(num - 2);
	}
}
