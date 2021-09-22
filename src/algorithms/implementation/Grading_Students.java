package algorithms.implementation;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import algorithms.warmup.A_Very_Big_Sum;

public class Grading_Students {
	static {
		try {
			System.setIn(
					A_Very_Big_Sum.class.getResource("/algorithms/implementation/Grading_Students_STC0").openStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try (var scanner = new Scanner(System.in)) {
			scanner.nextLine(); // Skip first line

			while (scanner.hasNextInt()) {
				var nota = scanner.nextInt();
				var proximoMultCinco = (int) Math.ceil(nota / 5D) * 5;
				var diff = proximoMultCinco - nota;
				
				if (proximoMultCinco >= 40 && diff < 3)
					System.out.println(proximoMultCinco);
				else
					System.out.println(nota);
			}
		}
	}
}
