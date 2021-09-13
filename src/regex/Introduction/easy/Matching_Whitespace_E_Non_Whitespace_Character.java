package regex.Introduction.easy;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * Tarefa
 *
 * Você tem uma string S de teste. 
 * Sua tarefa é combinar o padrão XXxXXxXX
 * Aqui, x denota caracteres de espaço em branco e X denota caracteres de espaço não em branco.
 */
public class Matching_Whitespace_E_Non_Whitespace_Character {

	static {
		try {
			System.setIn(Matching_Whitespace_E_Non_Whitespace_Character.class.getResource("/Matching_Whitespace_E_Non_Whitespace_Character_STC0").openStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		try (var scanner = new Scanner(System.in)) {
			System.out.println(Pattern.compile("(\\S{2}\\s){2}\\S{2}").matcher(scanner.nextLine()).find());
		}
	}

}
