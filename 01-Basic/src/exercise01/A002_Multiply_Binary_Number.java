package exercise01;

import java.util.Scanner;

public class A002_Multiply_Binary_Number {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input the first number : ");
		int a = scan.nextInt();
		System.out.println("Input the second number : ");
		int b = scan.nextInt();
		scan.close();
		int result = 0;
		int multiply = 1;
		while (b != 0) {
			result = adding(result, (int)(a * (b % 10) * multiply));
			b = b / 10;
			multiply = multiply * 10;
		}
		
		System.out.println("The result is : " + result);
	}

	private static int adding(int num1, int num2) {
		int result[] = new int[20];
		int index = 0;
		int rest = 0;
		while (num1 != 0 || num2 != 0) {
			int temp = (num1 % 10) + (num2 % 10) + rest;
			result[index++] = temp % 2 ;
			rest = temp / 2;

			num1 = num1 / 10;
			num2 = num2 / 10;
		}
		if (rest == 1) {
			result[index++] = rest;
		}
		int sendback = 0;
		while (index >= 0) {
			sendback = sendback * 10 + result[index];
			index--;
		}
		return sendback;
	}

}
