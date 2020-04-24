package br.com.pet.view;

import br.com.pet.model.Atendimento;
import br.com.pet.model.Cliente;
import br.com.pet.model.Pet;
import br.com.pet.model.Vet;

import java.util.Scanner;

public class AtendimentoServico {

	public static void main(String[] args) {

		int opcaoMenuPrinciap = 999;

		while (opcaoMenuPrinciap != 0) {
			System.out.println("Bem vindo a Clínica Veterinária Pet");
			System.out.println("Veja abaixo as suas opçoes");
			System.out.println("1 - Para iniciar atendimento");
			System.out.println("0 - Para sair");

			Scanner leitor = new Scanner(System.in);
			opcaoMenuPrinciap = leitor.nextInt();

			if (opcaoMenuPrinciap == 1) {

				ClienteServico clienteServico = new ClienteServico();

				Cliente tutor = new Cliente("Zorandir", "R. Pensilvânia", "zorandir@gmail.com", 552, 296096179, 8191831);
//				Cliente tutor = clienteServico.criaCliente();
				clienteServico.imprimeCliente(tutor);

				PetServico petServico = new PetServico();
				
				Pet paciente = new Pet("Mel", "SRD", "Cachorro", 10, 15, "feminino", tutor);
//				Pet paciente =  petServico.criaPaciente(tutor);
				petServico.imprimePaciente(paciente);
				
				VetServico vetServico = new VetServico();
				
//				Vet veterinario = new Vet("Ana", 1234, 333255658, "ana@pet.com");
				Vet veterinario = vetServico.criaVeterinario();
				vetServico.imprimeVeterinario(veterinario);
				
				
				System.out.println("Digite o procedimento:");
				String procedimento = leitor.next();
				System.out.println("Digite o preço:");
				double preco = leitor.nextDouble();
				String lixo = leitor.nextLine();
	
				System.out.println("Digite a forma de pagamento:");
				String formaPagamento = leitor.nextLine();
				

				Atendimento atendimento = new Atendimento(tutor, paciente, veterinario, procedimento, preco, formaPagamento);
				
				
				 int oferecerDesconto = leitor.nextInt();
				
				while (oferecerDesconto != 0) {
					System.out.println("Deseja conceder desconto?");
					System.out.println("Veja abaixo as suas opçoes");
					System.out.println("1 - sim");
					System.out.println("2 - não");
					
					if (oferecerDesconto == 1) {
						atendimento.setDesconto(true);
					}
					
					if (oferecerDesconto == 2) {
						atendimento.setDesconto(false);
					}
					
				}
				
				
				leitor.close();

				System.out.println("Veja abaixo as suas opçoes");
				System.out.println("1 - Para calcular o pagamento do veterinario");
				System.out.println("2 - Para calcular valor minimo do ate");
				System.out.println("2 - Para calcular valor minimo do ate");
				System.out.println("0 - Para Sair");
				
				Atendimento.cacularPagamentoVet(atendimento);

//			atendimento.calcularValorMinimo();
//			atendimento.colocarDesconto(50);
//			atendimento.colocaPrecoComDesconto(60);
//			atendimento.calcularPorcentagen(60);

				System.out.println(atendimento.getValorMinimo());
				System.out.println(atendimento.getPreco());
				System.out.println(veterinario);

			}
		}
	}

}
