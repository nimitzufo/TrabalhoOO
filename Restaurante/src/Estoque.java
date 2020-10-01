import java.util.Scanner;

public class Estoque extends UserInterface {
	String produto;
	int qdeEstoque;
	
	public static void registroProduto() {
		
	}
	
	public static void qdeProduto() {
		
	}
	
	public static void registraPedido() {
		
	}
	
	public static void avisoDeReposicao(){
		
	}

	public static void main(String[] args) {
		System.out.println("O que deseja?");
		System.out.println("1 - Registrar produto");
		System.out.println("2 - Verificar quantidade de produto");
		Scanner scan = new Scanner(System.in);
		int userInput = scan.nextInt();
		if (userInput == 1) {
			Estoque.registroProduto();
		} 
		
		if (userInput == 2) {
			Estoque.qdeProduto();
		}

	}

}
