package algorithms.warmup.easy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Mini_Max_Sum {
	static {
		try {
			System.setIn(Mini_Max_Sum.class
					.getResource("/algorithms/warmup/easy/Mini_Max_Sum_TC1")
					.openStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try (var scanner = new Scanner(System.in)) {
			var arr = new ArrayList<Integer>();
			scanner.findAll("\\d+")
				.forEach(mr->arr.add(Integer.valueOf(mr.group())));
			
			Collections.sort(arr);
			
			var min = 0L;
			var max = 0L;
			for (int i = 0; i < arr.size(); i++) {
				if (i < arr.size() - 1) 
					min += arr.get(i);
				
				if (i > 0) 
					max += arr.get(i);
			}
			
			System.out.println(min + " " + max);
		}
	}
}
