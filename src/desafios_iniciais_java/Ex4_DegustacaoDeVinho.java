package desafios_iniciais_java;

public class Ex4_DegustacaoDeVinho {

	public static void main(String[] args) {
		int count = 0;
		String tipoVinho = leitor.nextLine();
		String[] participantes = leitor.nextLine().split("");


		for (String participante : participantes) {
		    if (participante.equals(tipoVinho)) 
		      { 
		        count++; 
		      }
		}

		System.out.println(count);
	}

}
