package algorithms.warmup;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Compare_the_Triplets {
	static {
		try {
			System.setIn(Compare_the_Triplets.class.getResource("/algorithms/warmup/Compare_the_Triplets_STC1")
					.openStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try (var scanner = new Scanner(System.in)) {
			List<Integer> aliceList = Stream.of(scanner.nextLine().split("\\s+")).map(Integer::valueOf)
					.collect(Collectors.toList());

			List<Integer> bobList = Stream.of(scanner.nextLine().split("\\s+")).map(Integer::valueOf)
					.collect(Collectors.toList());

			int alieceScore = 0;
			int bobScore = 0;
			for (int i = 0; i < aliceList.size(); i++) 
				if (aliceList.get(i) > bobList.get(i))
					alieceScore++;
				else if (aliceList.get(i) < bobList.get(i))
					bobScore++;
			
			System.out.println(alieceScore + " " + bobScore);
		}
	}
}
