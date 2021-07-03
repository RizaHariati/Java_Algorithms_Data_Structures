package exercise01;


public class A004_Check_Class {

	public static void main(String[] args) {
		String string = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
		
		int space = 0;
		int letter = 0;
		int number = 0;
		int other = 0;

		for (int i = 0; i < string.length(); i++) {
			char temp = string.charAt(i);
			if (Character.isLetter(temp)) {
				letter++;
			} else if (Character.isWhitespace(temp)) {
				space++;
			} else if (Character.isDigit(temp)) {
				number++;
			} else {
				other++;
			}
		}
		
		System.out.println("Space : " + space + ", Letter : " + letter 
		+ ", Number : "+ number +", Other : "+ other);
	}
	
}
