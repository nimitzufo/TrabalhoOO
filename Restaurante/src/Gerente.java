import java.util.Scanner;

public class Gerente extends User {
	
	
	

	public static void main(String[] args) {
		System.out.println("Bem vindo ao sistema de cadastro de usuários");
		System.out.println("Deseja cadastrar um novo usuário?(S/N)");
		Scanner reader = new Scanner(System.in);
		char userInput = reader.next().toCharArray()[0];
		
		if (userInput == 's' || userInput == 'S') {
			User funcionario = new User();
			funcionario.cadastroUsuario(funcionario);
			funcionario.perfilUsuario(funcionario);
		} else {
			System.out.println("Obrigado, encerrando");
		}

	}

}
