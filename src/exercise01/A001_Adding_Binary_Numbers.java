package exercise01;

import java.util.Scanner;

public class A001_Adding_Binary_Numbers {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Input the first number ");
		int a = scan.nextInt();
		System.out.println("Input the second number : ");
		int b = scan.nextInt();
		scan.close();
		int result[] = new int[20];
		int index = 0;
		int rest = 0;

		while (a != 0 || b != 0) {
			int temp =(int) (a % 10) + (b % 10) + rest;
			result[index++] = temp % 2;
			rest = temp / 2;
			a = a / 10;
			b = b / 10;
		}
		if (rest == 1) {
			result[index++] = rest;
		}

		index--;
		System.out.println("The result is : ");
		while (index >= 0) {
			System.out.print(result[index]);
			index--;
		}

	}

}
