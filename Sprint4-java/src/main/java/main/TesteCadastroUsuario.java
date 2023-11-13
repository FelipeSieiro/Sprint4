package main;

import java.util.Scanner;

import br.com.fiap.sprint4.controller.CadastrarBike;
import br.com.fiap.sprint4.controller.CadastrarUsuario;
import br.com.fiap.sprint4.model.bo.RepositorioDeBikes;
import br.com.fiap.sprint4.model.bo.RepositorioDeUsuarios;


public class TesteCadastroUsuario {

	public static void main(String[] args) throws Exception {
		RepositorioDeUsuarios repositorioUsuarios = new RepositorioDeUsuarios();
		CadastrarUsuario cadastrarUsuario = new CadastrarUsuario(repositorioUsuarios);
		
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println(" - Nome:");
			String nome = scanner.nextLine();
			
			System.out.println(" - Data De Nascimento: " );
			String dataNascimento = scanner.nextLine();
			
			System.out.println(" - Endereco: ");
			String endereco = scanner.nextLine();
			
			System.out.println(" - Email: ");
			String email = scanner.nextLine();
			
			System.out.println(" - Telefone: ");
			String telefone = scanner.nextLine();
			
		
		
		
		cadastrarUsuario.cadastrarUsuario(nome, dataNascimento, endereco, email, telefone, telefone);
		System.out.println(repositorioUsuarios.listarTodos());
		
		
		RepositorioDeBikes repositorioBikes = new RepositorioDeBikes();
		CadastrarBike cadastrarBike = new CadastrarBike(repositorioBikes, repositorioUsuarios);
		
			
			System.out.print("Digite a cor: \n");
			String cor = scanner.nextLine();
			
			System.out.print("Digite o modelo: \n");
			String modelo = scanner.nextLine();
			
			System.out.print("Digite o numero de serie: \n");
			String numeroDeSerie = scanner.nextLine();
			
			System.out.print("Digite sua Nota Fiscal: \n");
			String notaFiscal = scanner.nextLine();
			
			System.out.print("\n Digite a marca: \n");
			String marca = scanner.nextLine();
			
			System.out.print("Digite o tipo: \n");
			String tipo = scanner.nextLine();
			
			System.out.print("Digite o material: \n");
			String material = scanner.nextLine();
			
			System.out.print("\n Digite o numero de modificacoes da sua bike(deve ser um numero inteiro): \n");
			int numeroDeModificacoes = scanner.nextInt();
			
			System.out.print("\n quantas vezes vc usa ao dia?: \n");
			int frequencia_usodia  = scanner.nextInt();
			
			System.out.print("\n Digite o ano de fabricacao em 4 numeros: \n");
			int ano_de_fabr  = scanner.nextInt();
			
			cadastrarBike.cadastrarBike(modelo, numeroDeSerie, notaFiscal, cor, marca, material, tipo, ano_de_fabr, frequencia_usodia, numeroDeModificacoes);
			
			
			System.out.println(repositorioBikes.listarTodos());
		
		
		}
	}	

}
