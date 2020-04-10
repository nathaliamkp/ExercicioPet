package br.com.pet.view;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.pet.model.Atendimento;
import br.com.pet.model.Vet;

class VetTest {

	@Test
	void quandoAtendimentoComPrecoPositivoValorVetSemErro() {
		
		Atendimento atendimento = new Atendimento("consulta", 1000, "cartão", true);
		
		double valorVet = Vet.cacularPagamentoVet(atendimento);
		
		
		assertEquals(200, valorVet);
	}


}
