package algorithms.warmup.easy;

import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Time_Conversion {
	static {
		try {
			System.setIn(Time_Conversion.class
					.getResource("/algorithms/warmup/easy/Time_Conversion_TC8")
					.openStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try (var scanner = new Scanner(System.in)) {
			System.out.println(
					LocalTime.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("hh:mm:ssa"))
						.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
		}
		
	}
}
