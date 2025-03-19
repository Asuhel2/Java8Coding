import java.util.Scanner;

public class LargeStringReverse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : \n");
		String sentence = sc.nextLine();
		sc.close();
		System.out.println(reverseLongString(sentence));
	}

	private static String reverseLongString(String sentence) {

		String[] words = sentence.split("\\s+");
		String longWord = words[0];

		for (String word : words) {
			if (word.length() > longWord.length()) {
				longWord = word;
			}
		}
		String reversetheLongWord = new StringBuilder(longWord).reverse().toString();
		return sentence.replace(longWord, reversetheLongWord);
	}

}
