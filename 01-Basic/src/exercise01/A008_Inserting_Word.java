package exercise01;



public class A008_Inserting_Word {
	public static void main(String[] args) {
		String a = "Python 3.0";
		String b = "Tutorial";
		int index = 0;
		String[] arrayString = a.split(" ");
		String[] newArrayString = new String[arrayString.length +1];
		String result = "";
		for (int i = 0; i <= 2; i++) {

			if (i == 1) {
				newArrayString[i] = b;

			} else {
				newArrayString[i] = arrayString[index];
				index++;
			}

		}
		result = String.join(" ", newArrayString);
		System.out.println(result);
}

}