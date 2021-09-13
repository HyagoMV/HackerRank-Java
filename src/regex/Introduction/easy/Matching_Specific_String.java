package regex.Introduction.easy;

import java.io.IOException;
import java.util.Scanner;

/*
 * Tarefa
 *
 * Você tem uma string S de teste. 
 * Sua tarefa é combinar o hackerrank de string. 
 * Isso é sensível a maiúsculas e minúsculas.
 */
public class Matching_Specific_String {

	static {
		try {
			System.setIn(Matching_Specific_String.class.getResource("/Matching_Specific_String_STC0").openStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		try (var scanner = new Scanner(System.in)) {
			System.out.println("Number of matches : " + scanner.findAll("hackerrank").count());
		}
	}

}
