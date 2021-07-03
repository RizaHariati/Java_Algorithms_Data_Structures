package exercise03;

public class palindrome {

	public static void main(String[] args) {
		
		int input = 125421;
		String num = input + "";
		boolean check = checking(num);
		if (check) {
			System.out.println("input is a palindrome");
		} else {
			System.out.println("input is not a palindrome");
		}
		
	}

	private static boolean checking(String num) {
		int len = num.length();
		
		for (int i = 0; i < len/2+1; i++) {
			if (num.charAt(i) != num.charAt(len - 1 - i)) {
			return false;}
		}
		return true;
	}

}
