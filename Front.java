package JogoMatematico;

import java.util.Scanner;

public class Front {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int contador = 0;
		int cArcetos = 0;

		while (contador < 3 ) {
			JogoMatematico jogo = new JogoMatematico();
			jogo.sortearCalculo();
			System.out.println(jogo.getCalculo());
			System.out.println("O resultado é:");
			int total = input.nextInt();
			if (jogo.checarResposta(total)) {
				cArcetos++;
			}
			else {
				contador++;
			}
		}
		System.out.printf("FIm de jogo!\n O seu total de acertos foram: %d", cArcetos);
		input.close();
	}
}
