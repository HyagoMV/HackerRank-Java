package algorithms.warmup;

import java.io.IOException;
import java.util.Scanner;

public class A_Very_Big_Sum {
	
	static {
		try {
			System.setIn(A_Very_Big_Sum.class.getResource("/algorithms/warmup/A_Very_Big_Sum_STC0").openStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		try (var scanner = new Scanner(System.in)) {
			scanner.nextLine(); // Skip first line

			System.out.println(
					scanner.findAll("\\d+").map(mr -> Long.valueOf(mr.group()))
							.reduce(0L, Long::sum));
		}
	}
}
