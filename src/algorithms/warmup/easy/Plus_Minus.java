package algorithms.warmup.easy;

import java.io.IOException;
import java.util.Scanner;

public class Plus_Minus {
	static {
		try {
			System.setIn(Plus_Minus.class
					.getResource("/algorithms/warmup/easy/Plus_Minus_STC1")
					.openStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		var positiveCount = 0;
		var negativeCount = 0;
		var zeroCount = 0;
		var num = 0D;
		
		try (var scanner = new Scanner(System.in)) {
			num = scanner.nextInt();
			for (var i = 0; i < num; i++) {
				var value = scanner.nextInt();
				if (value == 0) {
					++zeroCount;
					continue;
				} 
				if (value < 0) {
					++negativeCount;
					continue;
				}
				else
					++positiveCount;
			}
		}
		
		System.out.printf("%.6f%n", positiveCount/num);
		System.out.printf("%.6f%n", negativeCount/num);
		System.out.printf("%.6f%n", zeroCount/num);
	}
}
