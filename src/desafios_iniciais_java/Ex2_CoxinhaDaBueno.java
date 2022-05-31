package desafios_iniciais_java;

import java.util.Scanner;

public class Ex2_CoxinhaDaBueno {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int H, P;
		H = scan.nextInt();
		P = scan.nextInt();
		
		double media = Double.parseDouble(String.valueOf(H))/Double.parseDouble(String.valueOf(P));
		System.out.printf("%.2f", media);
	}
}