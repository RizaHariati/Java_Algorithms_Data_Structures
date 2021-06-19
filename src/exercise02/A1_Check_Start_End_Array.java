package exercise02;

public class A1_Check_Start_End_Array {

	public static void main(String[] args) {
	
		int num[] = {45, 20, 10, 14, 60, 45, 20, 10, 1 };
		int len = 0;
		if (num.length % 2 == 0) {
			len = num.length/2;
		} else {
			len = num.length / 2 + 1;
		}
		int i = 0;
		int j = len;
		boolean check = false;
	
		while (num[i] != num[j] && j<num.length) {
			j++;

		}
		if (num[i] == num[j]) {
			while (j < num.length) {
				
				check = true;
				if (num[i] != num[j]) {
					check = false;
					break;
				}
				i++;
				j++;
			}
		}
		System.out.println(check);
	}

}
