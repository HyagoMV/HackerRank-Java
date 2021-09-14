package algorithms.warmup;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solve_Me_First {
	static {
		try {
			System.setIn(Solve_Me_First.class.getResource("/algorithms/warmup/Solve_Me_First_STC1").openStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try (var scanner = new Scanner(System.in)) {
			System.out.println(
					scanner.findAll("\\d+")
					.map(mr -> Integer.valueOf(mr.group()))
					.reduce(0,Integer::sum));
		}
	}
}
