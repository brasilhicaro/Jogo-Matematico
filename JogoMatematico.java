package JogoMatematico;

public class JogoMatematico{
	private String calculo;
	private int resultado;
	
	public String getCalculo() {
		return calculo;
	}
	public int getResultado() {
		return resultado;
	}
	public void sortearCalculo() {
		
		int num1 = (int)(Math.random()*100) + 1; 
		int num2 = (int)(Math.random()*100) + 1;
		String[] operacoes = {"+", ":", "x", "-"};
		int sorteador = (int)(Math.random()*4);
		String operador = ""; 
		operador = operacoes[sorteador];
		String sortearC = (String)(num1 + operador + num2); 
		calculo = sortearC;
	
		switch (operador) {
		case "-":
			resultado = num1 - num2;
			break;
		case "+":
			resultado = num1 + num2;
			break;
		case "x":
			resultado = num1 * num2;
			break;
		default:
			resultado = num1 - num2;
		}
	}
	public boolean checarResposta(int total) {
		if (total == getResultado()) {
			return true;
		}
		else {
			return false;
		}
	}
}