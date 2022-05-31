package desafios_iniciais_java;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex3_AlbumDaCopa {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numTotal = scan.nextInt();
		if (numTotal < 1 || numTotal > 100) return;
		
		 int numFigCompradas = scan.nextInt();
		    if (numFigCompradas < 1 || numFigCompradas > 300) return;
		    
		    Set<Integer> setFig = new HashSet<>();
		
		    for (int i = 0; i < numFigCompradas; i++) {
		      int fig = scan.nextInt();
		      if (fig < 1 || fig > numTotal) return;
		      setFig.add(fig);
		    }
		    System.out.println(numTotal - setFig.size());
	}

}
