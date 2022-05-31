package desafios_intermediarios_java;

import java.util.Scanner;

public class Ex3_PoligonosRegularesSimples {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String N = scan.nextLine();
	    String[] split = N.split(" ");
	    
	    int P = Integer.parseInt(split[0]) * Integer.parseInt(split[1]);
	    
	    System.out.println(P);

	}

}
