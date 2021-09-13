package regex.Introduction.easy;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Matching_Digits_E_Non_Digit_Characters {

	static {
		try {
			System.setIn(Matching_Digits_E_Non_Digit_Characters.class.getResource("/Matching_Digits_E_Non_Digit_Characters_STC0").openStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		try (var scanner = new Scanner(System.in)) {
			System.out.println(Pattern.compile("(\\d\\d\\D){2}\\d{4}").matcher(scanner.nextLine()).find());
		}
	}

}
