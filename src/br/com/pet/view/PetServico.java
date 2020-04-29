package br.com.pet.view;

import java.util.Scanner;

import br.com.pet.bean.Cliente;
import br.com.pet.bean.Pet;

public class PetServico {
	
	Scanner leitor = new Scanner(System.in);
	public Pet criaPaciente(Cliente tutor) {
		
	
		System.out.println("Digite o nome do paciente:");
		String nome = leitor.nextLine();
		System.out.println("Digite a raça do paciente:");
		String raca = leitor.nextLine();
		System.out.println("Digite a espécie do paciente:");
		String especie = leitor.next();
		System.out.println("Digite a idade do paciente:");
		int idade = leitor.nextInt();
		System.out.println("Digite o peso do paciente:");
		int peso = leitor.nextInt();
		System.out.println("Digite o sexo");
		String sexo = leitor.next();
		
		Pet paciente = new Pet(nome, raca, especie, idade, peso, sexo, tutor);
		return paciente;
	}

	public void imprimePaciente(Pet paciente) {
		
		Cliente tutor = paciente.getTutor();
		System.out.println(" ========== ========== \n" + 
				"   Valor     Atributo  \n" + 
				" ========== ========== \n" + 
				"  Nome      "+ paciente.getNome() +"            \n" + 
				"  Raca      "+ paciente.getRaca()+"            \n" + 
				"  Espécie   "+ paciente.getEspecie()+"          \n" + 
				"  Idade     "+ paciente.getIdade()+"           \n" + 
				"  Peso      "+ paciente.getPeso()+"          \n" + 
				"  Sexo      "+ paciente.getSexo()+"          \n" + 
				"  Tutor     "+ tutor.getNome()+"           \n" + 
				" ========== ========== \n" +                 "");
	}
}
