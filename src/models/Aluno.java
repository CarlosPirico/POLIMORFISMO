package models;

//extendendo construtores e atributos da superclasse pessoa
public class Aluno extends Pessoa{
	// criando o construtor e herdando o de pessoa
	public Aluno(String nome, String mensagem) {
		super(nome, mensagem);
	}
	
	@Override
	public String getEmail() {
		return "Olá Aluno " + nome + "!\n"
				+ mensagem + "\n";
	}
}
