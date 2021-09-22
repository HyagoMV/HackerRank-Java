package regex.applications.medium;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Buildinga_Smart_IDE_Programming_Language_Detection {
	static {
		try {
			System.setIn(Buildinga_Smart_IDE_Programming_Language_Detection.class
					.getResource("/regex/applications/medium/Buildinga_Smart_IDE_Programming_Language_Detection_TC13")
					.openStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try (var s = new Scanner(System.in)) {
			while (s.hasNextLine()) {
				var matcher = Pattern
						.compile("(?:((?:import|package)\\s+[a-zA-z_.*]+;|\\b(?:public)\\b)|(#(?:include|define)))")
						.matcher(s.nextLine());

				if (matcher.find()) {
					if (matcher.group(1) != null)
						System.out.println("Java");
					else
						System.out.println("C");

					return;
				}
				System.out.println("Python");
				return;
			}
		}
	}
}
