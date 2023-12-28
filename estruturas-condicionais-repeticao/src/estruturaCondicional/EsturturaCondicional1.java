package estruturaCondicional;

public class EsturturaCondicional1 {

	public static void main(String[] args) {
		int mediaAluno = 70;
		String nome = "Fabio";
		if (mediaAluno >= 70 && nome.equals("Alex")) {
			System.out.println("Parabens! Voce esta aprovado");
		} else if (mediaAluno < 70) {
			System.out.println("Voce esta reprovado");
		} else {
			System.out.println("Aluno nao encontrado");
		};
		

	}

}
