package algorithms.warmup.easy;

import java.io.IOException;
import java.util.Scanner;

public class Staircase {
	static {
		try {
			System.setIn(Staircase.class
					.getResource("/algorithms/warmup/easy/Staircase_STC0")
					.openStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		var num = 0;
		
		try (var scanner = new Scanner(System.in)) {
			num = scanner.nextInt();				
		}
		
		var hash = new StringBuilder();
		for (var i = 0; i < num; i++) {
			hash.append("#");
			System.out.printf("%" + num + "s%n", hash);
		}
		
	}
}








