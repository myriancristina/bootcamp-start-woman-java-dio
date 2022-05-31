package desafios_intermediarios_java;

import java.util.Scanner;

public class Ex2_Esfera {

	public static void main(String[] args) {
    @SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
  		
  		double pi = 3.14159;
  		double R = sc.nextDouble();
  		
  		double volume = (4.0 / 3) * pi * (Math.pow(R, 3.0));
  		
  		System.out.printf("VOLUME = %.3f%n", volume);

	}

}
