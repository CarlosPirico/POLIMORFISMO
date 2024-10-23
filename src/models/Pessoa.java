package models;

public class Pessoa {
	// criando atributos
	protected String nome;
	protected String mensagem;
	// criando construtor
	public Pessoa(String nome, String mensagem) {
		this.nome = nome;
		this.mensagem = mensagem;
	}
	// criando metodo de email
	public String getEmail() {
		return "Olá " + nome + "!\n"
				+ mensagem;
	}
}
