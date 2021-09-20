package regex.applications.medium;

import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class Detect_the_Email_Addresses {

	static {
		try {
			System.setIn(Detect_the_Email_Addresses.class
					.getResource("/regex/applications/medium/Detect_the_Email_Addresses_STC1")
					.openStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		var ts = new TreeSet<String>();
		
		try (var scanner = new Scanner(System.in)) {
			scanner.findAll("\\w+(?:\\.\\w+)*@\\w+(?:\\.\\w+)*")
				.forEach(mResult -> ts.add(mResult.group()));
		}
				
		System.out.print(
				ts.toString()
				.replaceAll("\\[|\\]", "")
				.replaceAll(", ", ";")
		);
	}

}
