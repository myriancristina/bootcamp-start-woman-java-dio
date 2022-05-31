package desafios_iniciais_java;

import java.util.Scanner;

public class leitor {
	    public static void main(String[] args) {
	        @SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
	        int T = scan.nextInt();
	        int[] respostasCompetidores = new int[5];
	        for (int i=0; i < 5; i++){
	            respostasCompetidores[i] = scan.nextInt();
	        }
	        int count = 5;
	        for (int resposta : respostasCompetidores){
	            if (resposta != T)count--;
	        }
	        System.out.println(count);
	    }

		public static String nextLine() {
			// TODO Auto-generated method stub
			return null;
		}
	}