package br.com.pet.view;

import java.util.Scanner;

import br.com.pet.model.Vet;

public class VetServico {
	
	Scanner leitor = new Scanner(System.in);
	public Vet criaVeterinario() {
		
		System.out.println("Digite o nome do Veterinario:");
		String nome = leitor.next();
		System.out.println("Digite o endereco CRMV do veterinário");
		int registro = leitor.nextInt();
		System.out.println("Digite o telefone do veterinário:");
		int telefoneVeterinario = leitor.nextInt();
		System.out.println("Digite o email do veterinário:");
		String emailVeterinario = leitor.next();
		Vet veterinario = new Vet(nome, registro, telefoneVeterinario, emailVeterinario);
		return veterinario;

	}
	
	public void imprimeVeterinario(Vet veterinario) {
		
		System.out.println(" ========== ========== \n" + 
				"   Valor     Atributo  \n" + 
				" ========== ========== \n" + 
				"  Nome      "+ veterinario.getNome() +"            \n" + 
				"  CRMV      "+ veterinario.getRegistro()+"            \n" + 
				"  Telefone   "+ veterinario.getTelefone()+"          \n" + 
				"  Email     "+ veterinario.getEmail()+"           \n" + 
				" ========== ========== \n" +                        "");
	}
		
}
