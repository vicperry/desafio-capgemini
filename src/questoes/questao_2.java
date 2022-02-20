package questoes;

import java.util.Scanner;

public class questao_2 {
	
	//Débora se inscreveu em uma rede social para se manter em contato com seus amigos. 
	//A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha 
	//precisa ser forte. O site considera uma senha forte quando ela satisfaz os seguintes critérios:
	//Possui no mínimo 6 caracteres.
	//Contém no mínimo 1 digito.
	//Contém no mínimo 1 letra em minúsculo.
	//Contém no mínimo 1 letra em maiúsculo.
	//Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+
	//Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é 
	//uma senha forte. Para ajudar Débora, construa um algoritmo que informe qual é o número
	//mínimo de caracteres que devem ser adicionados para uma string qualquer ser considerada segura.


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma senha: ");
		String senha = sc.nextLine();
		int carQueFaltam;
		
		if(senha.length() >= 6) {
			System.out.println("Sua senha tem a quantidade mínima de caracteres para ser considerada segura.");
		}else {
			carQueFaltam = 6 - senha.length();
			System.out.println("Para a senha ser considerada segura, ela precisa conter, você precisa adicionar "+ carQueFaltam +" caracteres.");
		}
		
	}

}
