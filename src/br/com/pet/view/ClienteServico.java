package br.com.pet.view;

import java.util.Scanner;

import br.com.pet.bean.Cliente;

public class ClienteServico {

	Scanner leitor = new Scanner(System.in);
	public Cliente criaCliente() {
		
		
		System.out.println("Digite o nome do Cliente:");
		String nome = leitor.nextLine();
		System.out.println("Digite o endereco do cliente:");
		String endereco = leitor.nextLine();
		System.out.println("Digite o email do cliente:");
		String email = leitor.next();
		System.out.println("Digite o telefone do cliente:");
		int telefone = leitor.nextInt();
		System.out.println("Digite o rg do cliente:");
		int rg = leitor.nextInt();
		System.out.println("Digite o cpf do cliente:");
		int cpf = leitor.nextInt();
		
		Cliente tutor = new Cliente(nome, endereco, email, telefone, rg, cpf);
		return tutor;
	}
	
	
	
	public void imprimeCliente(Cliente tutor) {

		System.out.println(" ========== ========== \n" + 
				"   Cliente    Atributo  \n" + 
				" ========== ========== \n" + 
				"  Nome      "+ tutor.getNome() +"            \n" + 
				"  Endereço  "+ tutor.getEndereco()+"            \n" + 
				"  Telefone  "+ tutor.getTelefone()+"          \n" + 
				"  Email     "+ tutor.getEmail()+"           \n" + 
				"  RG        "+ tutor.getRg()+"          \n" + 
				"  CPF       "+ tutor.getCpf()+"           \n" + 
				" ========== ========== \n" +               "");

	
}

	
}
