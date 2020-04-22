package br.com.pet.view;
import br.com.pet.model.Atendimento;
import br.com.pet.model.Cliente;
import br.com.pet.model.Pet;
import br.com.pet.model.Vet;

import java.util.Scanner;



public class AtendimentoServico {
	
	public static void main(String[] args) {
//
	Scanner leitor = new Scanner(System.in);
	
	System.out.println("Digite o nome do Cliente:");
	String nome = leitor.nextLine();
	System.out.println("Digite o endereco do cliente:");
	String endereco = leitor.next();
	System.out.println("Digite o email do cliente:");
	String email = leitor.next();
	System.out.println("Digite o telefone do cliente:");
	int telefone = leitor.nextInt();
	System.out.println("Digite o rg do cliente:");
	int rg = leitor.nextInt();
	System.out.println("Digite o cpf do cliente:");
	int cpf = leitor.nextInt();
	
	
	Cliente tutor = new Cliente(nome, endereco, email, telefone, rg, cpf);
	
	System.out.println("Digite o nome do paciente:");
	String nomePaciente = leitor.next();
	System.out.println("Digite a raca do paciente:");
	String raca = leitor.next();
	System.out.println("Digite a espécie do paciente:");
	String especie = leitor.next();
	System.out.println("Digite a idade do paciente:");
	int idade = leitor.nextInt();
	System.out.println("Digite o peso do paciente:");
	int peso = leitor.nextInt();
	System.out.println("Digite o sexo");
	String sexo = leitor.next();
	
	Pet paciente = new Pet(nomePaciente, raca, especie, idade, peso, sexo, tutor);
	
	
	System.out.println("Digite o nome do Veterinario:");
	String nomeVeterinario = leitor.next();
	System.out.println("Digite o endereco CRMV do veterinário");
	int registro = leitor.nextInt();
	System.out.println("Digite o telefone do veterinário:");
	int telefoneVeterinario = leitor.nextInt();
	System.out.println("Digite o email do veterinário:");
	String emailVeterinario =  leitor.next();
	
	Vet veterinario = new Vet(nomeVeterinario, registro, telefoneVeterinario, emailVeterinario);
	
	
	System.out.println("Digite o procedimento:");
	String procedimento = leitor.next();
	System.out.println("Digite o preço:");
	double preco = leitor.nextDouble();
	System.out.println("Digite a forma de pagamento:");
	String formaPagamento = leitor.next();
	System.out.println("Conceder desconto?");
	boolean desconto = leitor.hasNext();
	
	Atendimento atendimento = new Atendimento (tutor, paciente, veterinario, procedimento, preco, formaPagamento, desconto);
	
	
	leitor.close();
	
//		public static void main(String[] args) {
//		
//		Pet pet = new Pet("Mel", "Poodle", 12, "F");
//		
//		
//		Cliente tutor = new Cliente("Maria", "Rua Amazonas", "maria@pet.com", 999992332, 37092873-8, 410416068-14);
//		pet.tutor = tutor;
//	
//		Vet veterinario = new Vet("Paula", 1234, 32335657, "paula@vet.com.br");
//	
//		Atendimento atendimento = new Atendimento("consulta", 100, "cartão", true);
//		atendimento.setTutor(tutor);
//		atendimento.setPaciente(pet);
//		atendimento.setVeterinario(veterinario);
//				
//		
	Vet.cacularPagamentoVet(atendimento);
			
		
//	atendimento.calcularValorMinimo();
//	atendimento.colocarDesconto(50);
//	atendimento.colocaPrecoComDesconto(60);
//	atendimento.calcularPorcentagen(60);

	System.out.println(atendimento.getValorMinimo());
	System.out.println(atendimento.getPreco());
	System.out.println(veterinario);
	
    	
	}
}
