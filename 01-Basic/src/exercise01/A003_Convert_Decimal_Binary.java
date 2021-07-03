package exercise01;

import java.util.Scanner;

public class A003_Convert_Decimal_Binary {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Write down the decimal number :");
		int num = scan.nextInt();
		int result[] = new int[20];
		int index = 0;
		scan.close();
		while (num > 0) {
			result[index] = num % 2;
			num = num / 2;
			index++;
		}
		index--;
		while (index >= 0) {
			System.out.print(result[index]);
			index--;
		}
	}
	
}
