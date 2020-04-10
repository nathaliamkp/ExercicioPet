package br.com.pet.model;

public enum Procedimento {
	CONSULTA(1), CIRURGIA(1), BANHO_E_TOSA(1), BANHO(5);
	
    public int codigo;
    public String nome;

    Procedimento(int codigo) {
		this.codigo = codigo;
    }
}
