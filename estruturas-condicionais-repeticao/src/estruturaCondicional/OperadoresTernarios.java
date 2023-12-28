package estruturaCondicional;

public class OperadoresTernarios {

	public static void main(String[] args) {
		/* Operadores Ternários são para micro validações*/
		int media = 55;
		String saidaResultado = media >= 70 ? "Aprovado" : (media >= 40 && media < 70) ? "Recuperacao" : "Reprovado";
		System.out.println(saidaResultado);
	}

}
