package models;

// extendendo construtores e atributos da superclasse pessoa
public class Professor extends Pessoa{
	// criando o construtor e herdando o de pessoa
	public Professor(String nome, String mensagem) {
		super(nome, mensagem);
	}
	
	// sobrescrevendo o metodo de get email
	@Override
	public String getEmail() {
		return "Olá Prof. " + nome + "!\n"
				+ mensagem + "\n";
	}
}