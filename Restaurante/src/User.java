import java.util.Scanner;

public class User extends UserInterface {
	int telefone, cpf, identidade;
	String nome, endereco, email, escolaridade, cargo, filiacao, sexo, estadoCivil, naturalidade;
	
	//m�todo para cadastro do usu�rio
	//implementar verifica��o de input do usu�rio
	public static void cadastroUsuario(User usuario) {
				
		System.out.println("Cadastro de Usu�rio\n");
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira o nome do usu�rio ");
		usuario.nome = scan.nextLine();
		System.out.println("Cadastro de " + usuario.nome);
		System.out.println("Insira o endere�o ");		
		usuario.endereco = scan.nextLine();
		System.out.println("Insira o email ");
		usuario.email = scan.nextLine();
		System.out.println("Insira a escolaridade ");
		usuario.escolaridade = scan.nextLine();
		System.out.println("Insira o cargo ");
		usuario.cargo = scan.nextLine();
		System.out.println("Insira a filia��o ");
		usuario.filiacao = scan.nextLine();
		System.out.println("Insira o sexo ");
		usuario.sexo = scan.nextLine();
		System.out.println("Insira o estado civil ");
		usuario.estadoCivil = scan.nextLine();
		System.out.println("Insira a naturalidade ");
		usuario.naturalidade = scan.nextLine();
		System.out.println("Insira o telefone ");
		usuario.telefone = scan.nextInt();
		System.out.println("Insira o CPF (somente n�meros) ");
		usuario.cpf = scan.nextInt();
		System.out.println("Insira o n�mero de identidade ");
		usuario.identidade = scan.nextInt();
		
		
		//int numIdentificador;
	}
	
	//m�todo para visualizar perfil do usu�rio
	public void perfilUsuario(User u) {
		System.out.println("Usu�rio \t\t\t" + u.nome);
		System.out.println("Cargo \t\t\t\t" + u.cargo);
		System.out.println("CPF \t\t\t\t" + u.cpf);
		System.out.println("Identidade \t\t\t" + u.identidade);
		System.out.println("Telefone \t\t\t" + u.telefone);
		System.out.println("Email \t\t\t\t" + u.email);
		System.out.println("Escolaridade \t\t\t" + u.escolaridade);
		System.out.println("Filia��o \t\t\t" + u.filiacao);
		System.out.println("Estado Civil \t\t\t" + u.estadoCivil);
		System.out.println("Naturalidade \t\t\t" + u.naturalidade);
		System.out.println("Sexo \t\t\t\t"+ u.sexo);
		System.out.println("Endere�o \t\t\t" + u.endereco);
		
	}
	

	public static void main(String[] args) {
		System.out.println("O usu�rio a ser cadastrado � um gar�on ou um gerente?");
		System.out.println("1 - Gar�on");
		System.out.println("2 - Gerente");
		Scanner scan = new Scanner(System.in);
		int userInput = scan.nextInt();
		if (userInput == 1) {
			Garcon.main(args);
		} 
		
		if (userInput == 2) {
			Gerente.main(args);
		}
						
		
	}


}

