package br.com.pet.bean;

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

	public Atendimento(Cliente tutor, Pet paciente, Vet veterinario, String procedimento, double preco,
			String formaPagamento) {
		this.tutor = tutor;
		this.paciente = paciente;
		this.veterinario = veterinario;
		this.procedimento = procedimento;
		this.preco = preco;
		this.formaPagamento = formaPagamento;

	}

	public double calcularValorMinimo() {
		valorMinimo = preco - (preco * (DESCONTOMAXIMO / 100));
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

	public static double cacularPagamentoVet(Atendimento atendimento) {
		double pagamentoVet = atendimento.getPreco() * 0.2;
		return pagamentoVet;
	}

	public double colocarDesconto(double desconto) {
		if (this.desconto == true && desconto <= DESCONTOMAXIMO) {
			double porcentagem = desconto / 100;
			return preco = preco - (preco * porcentagem);
		} else {
			return preco;
		}
	}

	public boolean colocaPrecoComDesconto(double precoComDesconto) {
		calcularValorMinimo();
		if (precoComDesconto >= valorMinimo && precoComDesconto < preco) {
			preco = precoComDesconto;
			return true;
		}

		return false;

	}

	@Override
	public String toString() {
		return "Atendimento [tutor=" + tutor + ", paciente=" + paciente + ", veterinario=" + veterinario
				+ ", procedimento=" + procedimento + ", preco=" + preco + ", formaPagamento=" + formaPagamento
				+ ", desconto=" + desconto + ", valorMinimo=" + valorMinimo + ", DESCONTOMAXIMO=" + DESCONTOMAXIMO
				+ "]";
	}

}
