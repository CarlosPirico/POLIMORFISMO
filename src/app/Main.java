package app;

import models.*;

public class Main {

	public static void main(String[] args) {
		// instanciando professor e aluno
		Professor prof = new Professor("Ohata", "Bom dia professor, poderia revisar o meu codigo e dar uma nota 10?");
		Aluno aluno = new Aluno("Carlos", "Estarei analisando o seu codigo, acompanhe sua nota no Canvas!");

		// exibindo o email
		System.out.println(prof.getEmail());
		System.out.println(aluno.getEmail());
	}

}
