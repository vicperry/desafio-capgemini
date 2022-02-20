package questoes;

import java.util.Scanner;

public class questao_2 {
	
	//D�bora se inscreveu em uma rede social para se manter em contato com seus amigos. 
	//A p�gina de cadastro exigia o preenchimento dos campos de nome e senha, por�m a senha 
	//precisa ser forte. O site considera uma senha forte quando ela satisfaz os seguintes crit�rios:
	//Possui no m�nimo 6 caracteres.
	//Cont�m no m�nimo 1 digito.
	//Cont�m no m�nimo 1 letra em min�sculo.
	//Cont�m no m�nimo 1 letra em mai�sculo.
	//Cont�m no m�nimo 1 caractere especial. Os caracteres especiais s�o: !@#$%^&*()-+
	//D�bora digitou uma string aleat�ria no campo de senha, por�m ela n�o tem certeza se � 
	//uma senha forte. Para ajudar D�bora, construa um algoritmo que informe qual � o n�mero
	//m�nimo de caracteres que devem ser adicionados para uma string qualquer ser considerada segura.


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma senha: ");
		String senha = sc.nextLine();
		int carQueFaltam;
		
		if(senha.length() >= 6) {
			System.out.println("Sua senha tem a quantidade m�nima de caracteres para ser considerada segura.");
		}else {
			carQueFaltam = 6 - senha.length();
			System.out.println("Para a senha ser considerada segura, ela precisa conter, voc� precisa adicionar "+ carQueFaltam +" caracteres.");
		}
		
	}

}
