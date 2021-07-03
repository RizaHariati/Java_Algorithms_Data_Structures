package exercise02;


public class A3_Check_Power_Of_4 {

	public static void main(String[] args) {
	
		int input = 13;
		int array [] = new int[20];
		int index = 0;
		while (input > 0) {
			array[index] = input % 2;
			input = input / 2;
			index++;
		}
		boolean check = checking(index, array);
		System.out.println(check);
	}

	private static boolean checking(int index, int[] array) {
		
		if (index % 2 == 1) {
			for (int i = 0; i < index - 1; i++) {
				if (array[i] != 0) {
					return false;
					
				}
			}
			return true;
		}
		return false;
	}

}