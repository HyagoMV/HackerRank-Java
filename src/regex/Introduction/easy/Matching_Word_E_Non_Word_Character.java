package regex.Introduction.easy;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * Tarefa
 *
 * Você tem uma string S de teste. 
 * Sua tarefa é combinar o padrão xxxXxxxxxxxxxxXxxx
 * Aqui x denota qualquer caractere de palavra e X qualquer caractere que não seja de palavra.
 */
public class Matching_Word_E_Non_Word_Character {

	static {
		try {
			System.setIn(Matching_Word_E_Non_Word_Character.class.getResource("/Matching_Word_E_Non_Word_Character_STC0").openStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		try (var scanner = new Scanner(System.in)) {
			System.out.println(Pattern.matches("\\w{3}\\W\\w{10}\\W\\w{3}", scanner.nextLine()));
		}
	}

}
