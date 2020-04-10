package br.com.pet.model;

public class Atendimento {
	private Cliente tutor;
	private Pet paciente;
	private Vet veterinario;
	private String procedimento;
	private double preco;
	private String formaPagamento;
	private boolean desconto;
	private double valorMinimo;
	private double DESCONTOMAXIMO = 50;
	
	public Atendimento(Cliente tutor, Pet paciente, Vet veterinario, String procedimento, double preco, String formaPagamento, boolean desconto) {
		this.tutor = tutor;
		this.paciente = paciente;
		this.veterinario = veterinario;
		this.procedimento = procedimento;
		this.preco = preco;
		this.formaPagamento = formaPagamento;
		this.desconto = desconto;
	}
	
	public double calcularValorMinimo() {
		valorMinimo = preco-(preco*(DESCONTOMAXIMO/100));
		return valorMinimo;
	}
		
	
	public Pet getPaciente() {
		return paciente;
	}

	public void setPaciente(Pet paciente) {
		this.paciente = paciente;
	}

	public Vet getVeterinario() {
		return veterinario;
	}

	public void setVeterinario(Vet veterinario) {
		this.veterinario = veterinario;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public boolean isDesconto() {
		return desconto;
	}

	public void setDesconto(boolean desconto) {
		this.desconto = desconto;
	}

	public double getValorMinimo() {
		return valorMinimo;
	}

	public void setValorMinimo(double valorMinimo) {
		this.valorMinimo = valorMinimo;
	}

	public String getProcedimento() {
		return procedimento;
	}

	public double getDESCONTOMAXIMO() {
		return DESCONTOMAXIMO;
	}

	public double colocarDesconto(double desconto) {
		    if (this.desconto == true && desconto <= DESCONTOMAXIMO) {
		    	desconto =  desconto/100;
		    	return preco = preco -(preco*desconto);
		    } else {
		    	return preco;
		    }    			
	}
	
	
	public double colocaPrecoComDesconto (double precoComDesconto) {
		if (precoComDesconto >= valorMinimo && precoComDesconto < preco) {
		}
				return preco = precoComDesconto;
			
	}

	public Cliente getTutor() {
		return tutor;
	}

	public void setTutor(Cliente tutor) {
		this.tutor = tutor;
	}

	public double calcularPagamentoVet() {
		double pagamentoVet = getPreco() * 0.2;
		return pagamentoVet;
	}
	
	
//	public void calcularPorcentagen () {
//		double porcentagem = 100-(((preco)*100)/this.preco);
		
// }
	
	
	
	
//	public double colocarPrecoDesconto() {
//		if (precoComDesconto < valorMinimo) {
//			return precoComDesconto; 		
//		}
	
	
}
	
	


	
	
	
	


