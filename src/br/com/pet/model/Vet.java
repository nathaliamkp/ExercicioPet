package br.com.pet.model;

public class Vet {
	public String nome;
	public int registro;
	public double telefone;
	public String email;
	
	public Vet(String nome, int registro, double telefone, String email) {
		this.nome = nome;
		this.registro = registro;
		this.telefone = telefone;
		this.email = email;
		
	}
	
	public static double cacularPagamentoVet(Atendimento atendimento) {
		double pagamentoVet = atendimento.getPreco() * 0.2;
		return pagamentoVet;
	}

	@Override
	public String toString() {
		return "Vet [nome=" + nome + ", registro=" + registro + ", telefone=" + telefone + ", email=" + email + "]";
	}
	
	
	
	


}
