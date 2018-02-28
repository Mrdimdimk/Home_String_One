package runner;

public class MainApp {

	public static void main(String[] args) {

		String[] text = { "Слово один", "Слово два", "Слово три", "Слово четыре", "Слово пять", "Слово шесть",
				"Короткое слово Э", "123" }; // Create Array String
		int k = 4; // Position Symbol which will changed
		char newChar = '9'; // Symbol
		char[] Word;
		for (int i = 0; i < text.length; i++) {
			if (text[i].length() >= k) {

				Word = text[i].toCharArray();
				Word[k - 1] = newChar; // k-1 t.k Array start index 0
				text[i] = String.copyValueOf(Word);
			}
		}

		for (String stroka : text) {
			System.out.println(stroka);
		}

	}

}
