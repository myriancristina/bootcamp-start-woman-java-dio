package desafios_intermediarios_java;

import java.util.Scanner;

public class Ex1_Media2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
	    double nota1 = input.nextDouble();
	    double nota2 = input.nextDouble();
	    double nota3 = input.nextDouble();
	    
	    double media = ((nota1 * 2) + (nota2 *  3) + (nota3 * 5)) / (2+3+5);
	   
	    System.out.printf("MEDIA = %.1f", media);
	    System.out.println("");
	}

}
