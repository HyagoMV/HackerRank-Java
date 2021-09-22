package algorithms.warmup.easy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Stream;

public class Birthday_Cake_Candles {
	static {
		try {
			System.setIn(Birthday_Cake_Candles.class
					.getResource("/algorithms/warmup/easy/Birthday_Cake_Candles_STC0")
					.openStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static int max = 0;
	static int count = 0;
	static boolean lock = true;
	public static void main(String[] args) {
		try (var scanner = new Scanner(System.in)) {
			scanner.nextLine();
			scanner.findAll("\\d+")
				.map(mr->Integer.valueOf(mr.group()))
				.sorted((v0,v1)->-Integer.compare(v0,v1))
				.forEach(v0->{
					if (lock) {
						max = v0;
						count++;
						lock = !lock;
					} else if(v0 == max){
						count++;
					}
				});
			System.out.println(count);
		}
	}
}
