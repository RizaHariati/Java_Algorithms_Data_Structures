package exercise01;


public class A005_Combination_4_Numbers {
	public static void main(String[] args) {
		int index = 0;
		for (int i = 1; i <= 4; i++) {
			System.out.println();
			for (int j = 1; j <= 4; j++) {
				if (j != i) {
					for (int k = 1; k <= 4; k++) {
						if (k != j && k != i) {
							System.out.println(i + "" + j + "" + k);
							index++;
						}
					}
				}
			}
		}
		System.out.println(index);
	}
	
}
