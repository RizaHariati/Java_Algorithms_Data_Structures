package exercise01;

public class A006_Capitalize_First_Letter {
	public static void main(String[] args) {
		String string = "the quick brown fox jumps over the lazy dog";
		char[] newString = new char[string.length()];
		for (int i = 0; i < string.length(); i++) {
			if(i == 0) {
				newString[0] +=Character.toUpperCase(string.charAt(0));
			}else if (Character.isWhitespace(string.charAt(i)) == true) {
				newString[i] += (string.charAt(i));
				i++;
				newString[i] =Character.toUpperCase(string.charAt(i));
			} else {
				newString[i] +=(string.charAt(i));
			}
			
		}
		for (int i = 0; i < string.length(); i++) {
			System.out.print(newString[i]);
		}
		
	}
	
}
