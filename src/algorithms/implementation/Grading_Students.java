package algorithms.implementation;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import algorithms.warmup.A_Very_Big_Sum;

public class Grading_Students {
	static {
		try {
			System.setIn(A_Very_Big_Sum.class
							.getResource("/algorithms/implementation/Grading_Students_STC0")
							.openStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try (var scanner = new Scanner(System.in)) {
			scanner.nextLine(); // Skip first line

			var listNotas = scanner.findAll("\\d+")
					.map(mr -> Integer.valueOf(mr.group()))
					.collect(Collectors.toList());
			
			listNotas.stream()
				.map(nota -> {
					var nextFiveMult = (int) Math.ceil(nota / 5D) * 5;
					var temp =  nextFiveMult - nota;
					if (temp < 3)
						if(nextFiveMult >= 40)
							return nextFiveMult;
						else
							return nota;
					else
						return nota;
				}).forEach(System.out::println);
		}
	}
}
