package estruturaCondicional;

public class EsturturaCondicional1 {

	public static void main(String[] args) {
		/* Condições lógicas com IF e ELSE*/
		
		/*
		int mediaAluno = 70;
		String nome = "Fabio";
		if (mediaAluno >= 70 && nome.equals("Alex")) {
			System.out.println("Parabens! Voce esta aprovado");
		} else if (mediaAluno < 70) {
			System.out.println("Voce esta reprovado");
		} else {
			System.out.println("Aluno nao encontrado");
		};
		 */
		int nota1 = 90;
		int nota2 = 80;
		int nota3 = 30;
		int nota4 = 30;
		int media = 0;
		media = (nota1 + nota2 + nota3 + nota4)/4;
		if (media >=70) {
			System.out.println("Aluno Aprovado");
		} else if (media >= 40) {
			System.out.println("Aluno em Recuperacao");
		} else {
			System.out.println("Aluno reprovado");
		};

	};

};
