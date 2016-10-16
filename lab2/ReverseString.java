
public class ReverseString {
	public static void main(String[] args){
		String word = "abcdefg";
		System.out.println("Word: " + word);
		System.out.println("Reversed word: " + reverse(word));
	}
	
	public static String reverse(String word){
		if(word.length() == 1){
			return word;
		}
		
		String a = reverse(word.substring(1));
		char b = word.charAt(0);
		return a + b;
	}

}
