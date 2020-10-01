import java.util.Scanner;

public class Cliente  {
	
	int cpf;
	String nome, email;
	
	//implementar verificação do input do usuário
	public static void cadastroCliente(Cliente c) {
		System.out.println("Cadastro de Cliente\n");
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira o nome do cliente ");
		c.nome = scan.nextLine();
		System.out.println("Cadastro de " + c.nome);
		System.out.println("Insira o email ");	
		c.email = scan.nextLine();
		System.out.println("Insira o CPF do cliente ");
		c.cpf = scan.nextInt();
		
	}
	
	public static void perfilCliente(Cliente c) {
		System.out.println("Cliente \t\t\t" + c.nome);
		
		System.out.println("CPF \t\t\t\t" + c.cpf);

		System.out.println("Email \t\t\t\t" + c.email);

	}

	public static void main(String[] args) {
		System.out.println("Bem vindo ao sistema de cadastro de clientes");
		System.out.println("Deseja cadastrar um novo cliente?(S/N)");
		Scanner reader = new Scanner(System.in);
		char userInput = reader.next().toCharArray()[0];
		
		if (userInput == 's' || userInput == 'S') {
			Cliente cliente = new Cliente();
			cliente.cadastroCliente(cliente);
			cliente.perfilCliente(cliente);
		} else {
			System.out.println("Obrigado, encerrando");

		}
	}	
}
