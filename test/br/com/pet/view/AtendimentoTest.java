package br.com.pet.view;
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.Rule;
//import org.junit.jupiter.api.Test;
//
//import br.com.pet.model.Atendimento;
//import br.com.pet.model.Cliente;
//import br.com.pet.model.Pet;
//import br.com.pet.model.Vet;
//
class AtendimentoTest {
//		
//	@Test
//	void testesAleatorios() {
//		
////		Cliente tutor = new Cliente("Maria", "Rua Amazonas", "maria@pet.com", 999992332, 37092873-8, 410416068-14);
////		
////		Pet paciente = new Pet("Mel", "Poodle", "Cachorro", 12, "F", tutor);
////	
////		Vet veterinario = new Vet("Paula", 1234, 32335657, "paula@vet.com.br");
////	
////		Atendimento atendimento = new Atendimento(tutor, paciente, veterinario, "consulta", 100, "cartão", true);
////		
////				
////		
////		Vet.cacularPagamentoVet(atendimento);
////			
////		
////		atendimento.calcularValorMinimo();
////		//atendimento.colocarDesconto(50);
////		atendimento.colocaPrecoComDesconto(60);
////		//atendimento.calcularPorcentagen(60);
////		
////		System.out.println(atendimento.getValorMinimo());
////		System.out.println(atendimento.getPreco());
////		
////		System.out.println(veterinario);
//
//	}
//
//	@Test
//	void quandoAtendimentoComPrecoPositivoValorVetSemErro() {
//		
//		Cliente tutor = new Cliente("Maria", "Rua Amazonas", "maria@pet.com", 999992332, 37092873-8, 410416068-14);
//		
//		Pet paciente = new Pet("Mel", "Poodle", "Cachorro", 12, "F", tutor);
//	
//		Vet veterinario = new Vet("Paula", 1234, 32335657, "paula@vet.com.br");
//		
//		Atendimento atendimento = new Atendimento(tutor, paciente, veterinario, "consulta", 1000, "cartão", true);
//		double valorVet = atendimento.calcularPagamentoVet();		
//		
//		assertEquals(200, valorVet);
//
//		Cliente tutor2 = new Cliente("Maria", "Rua Amazonas", "maria@pet.com", 999992332, 37092873-8, 410416068-14);
//		
//		Pet paciente2 = new Pet("Mel", "Poodle", "Cachorro", 12, "F", tutor);
//	
//		Vet veterinario2 = new Vet("Paula", 1234, 32335657, "paula@vet.com.br");
//		
//		Atendimento atendimento2 = new Atendimento(tutor2, paciente2, veterinario2, "consulta", 2000, "cartão", true);
//		double valorVet2 = atendimento2.calcularPagamentoVet();		
//		
//		assertEquals(400, valorVet2);
//}
//	@Test
//	void camposObrigatoriosNuncaPodemSerNulos() {
//
//		Cliente tutor = new Cliente("Maria", "Rua Amazonas", "maria@pet.com", 999992332, 37092873-8, 410416068-14);
//		
//		Pet paciente = new Pet("Mel", "Poodle", "Cachorro", 12, "F", tutor);
//	
//		Vet veterinario = new Vet("Paula", 1234, 32335657, "paula@vet.com.br");
//		
//		
//		Atendimento atendimento = new Atendimento(tutor, paciente, veterinario, "consulta", 1000, "cartão", true);
//
//		assertNotNull(atendimento.getVeterinario());
//		assertNotNull(atendimento.getPaciente());
//		assertNotNull(atendimento.getTutor());
//		assertNotNull(atendimento.getPreco());
//		assertNotNull(atendimento.getProcedimento());
//		assertNotNull(atendimento.getFormaPagamento());
//		assertNotNull(atendimento.isDesconto());
//		
//	}
//
}
