package algorithms.implementation;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import algorithms.warmup.A_Very_Big_Sum;

public class Apple_and_Orange {
	static {
		try {
			System.setIn(A_Very_Big_Sum.class
							.getResource("/algorithms/implementation/Apple_and_Orange_STC0")
							.openStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try (var scanner = new Scanner(System.in)) {
			
		}
	}
}
