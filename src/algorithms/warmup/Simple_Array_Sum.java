package algorithms.warmup;

import java.io.IOException;
import java.util.Scanner;


/*
 * Dado um array de inteiros, encontre a soma de seus elementos.
 */
public class Simple_Array_Sum {

	static {
		try {
			System.setIn(Simple_Array_Sum.class.getResource("/algorithms/warmup/Simple_Array_Sum_STC0").openStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {
		try (var scanner = new Scanner(System.in)) {
			scanner.nextLine(); // Skip first line

			System.out.println(
					scanner.findAll("\\d+").map(mr -> Integer.valueOf(mr.group()))
							.reduce(0, Integer::sum));
		}
	}
}
