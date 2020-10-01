import java.util.Scanner;

public class UserInterface {
	
	public static void menuUI(String[] args) {
		System.out.println("Bem vindo ao sistema de Restaurante\n");
		System.out.println("O que deseja fazer?");
		System.out.println("1 - Cadastrar usuário");
		System.out.println("2 - Cadastrar cliente");
		System.out.println("3 - Alterar estoque");
		System.out.println("4 - Encerrar programa");
		Scanner scan = new Scanner(System.in);
		int userInput = scan.nextInt();
		
		if (userInput == 1) {
			User.main(args);
		} 
		
		if (userInput == 2) {
			Cliente.main(args);
		}
		
		if (userInput == 3) {
			Estoque.main(args);
		}
		
		if (userInput == 4) {
			System.out.println("Obrigado, encerrando");
		} 
		
	}
	
	

	public static void main(String[] args) {
		menuUI(args);

	}

}
