package regex.Introduction.easy;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * Tarefa
 *
 * Você tem uma string S de teste.
 * Sua tarefa é combinar o padrão Xxxxx
 * Aqui, x denota um caractere de palavra e X denota um dígito.
 * S deve começar com um dígito e terminar com . símbolo.
 * S deve ter 6 apenas caracteres
 */
public class Matching_Start_E_End {

	static {
		try {
			System.setIn(Matching_Start_E_End.class.getResource("/Matching_Start_E_End_STC0").openStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		try (var scanner = new Scanner(System.in)) {
			System.out.println(Pattern.compile("\\d\\w{4}.$").matcher(scanner.nextLine()).matches());
		}
	}

}
