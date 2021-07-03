package exercise01;



public class A007_First_100_Prime_Numbers {
	public static void main(String[] args) {
		int index = 1;
		int number = 1;
		int primeNumbers = 2;
		while (index < 100) {
			number++;
			if (number % 2 != 0) {
				if (primeNum(number)) {
					primeNumbers += number;
					index += 1;
					System.out.println(index + " " + primeNumbers);
				}
			}
		}	
}

private static boolean primeNum(int number) {
		for (int i = 3; i * i <= number; i+= 2) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}