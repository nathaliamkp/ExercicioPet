package br.com.pet.bean;

public class Pet {
	private String nome;
	private String raca;
	private String especie;
	private int idade;
	private int peso;
	private String sexo;
	private Cliente tutor;

	public Pet(String nome, String raca, String especie, int idade, int peso, String sexo, Cliente tutor) {
		this.nome = nome;
		this.raca = raca;
		this.especie = especie;
		this.idade = idade;
		this.peso = peso;
		this.sexo = sexo;
		this.tutor = tutor;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Cliente getTutor() {
		return tutor;
	}

	public void setTutor(Cliente tutor) {
		this.tutor = tutor;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Pet [nome=" + nome + ", raca=" + raca + ", especie=" + especie + ", idade=" + idade + ", peso=" + peso
				+ ", sexo=" + sexo + ", tutor=" + tutor + "]";
	}

}
