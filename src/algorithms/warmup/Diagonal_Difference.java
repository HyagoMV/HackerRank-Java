package algorithms.warmup;

import java.io.IOException;
import java.util.Scanner;
import java.util.stream.Stream;

public class Diagonal_Difference {
	
	static {
		try {
			System.setIn(
					Diagonal_Difference.class
						.getResource("/algorithms/warmup/Diagonal_Difference_STC0")
						.openStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		try (var scanner = new Scanner(System.in)) {
			int num = scanner.nextInt();
			int[][] arr = new int[num][num];
			int d0 = 0, d1 = 0;
			for (int r = 0, aux = num-1; r < num; r++, aux--) {
				for (int c = 0; c < num; c++) {
					arr[r][c] = scanner.nextInt();
					if (r == c) d0 += arr[r][c];
				}
				d1 += arr[r][aux];
			}
			System.out.println(Math.abs(d0 - d1));
		}
	}
}


