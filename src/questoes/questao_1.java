package questoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class questao_1 {
	//Escreva um algoritmo que mostre na tela uma escada de tamanho n 
	//utilizando o caractere * e espaços. A base e altura da escada devem 
	//ser iguais ao valor de n. A última linha não deve conter nenhum espaço.


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Criador de escadas");
		boolean continueLooping = true;
		int n = 0;
		
		do{	
			try {
				System.out.println("Digite a quantidade de degraus: ");
				n = scanner.nextInt();
				
				for(int i = 1; i <= n; i++) {
					for(int c = 1; c <= i; c++) {
						System.out.print("*");
					}
						System.out.print("\n");
				};
				
				continueLooping = false;
				
			}catch(InputMismatchException e){
                System.out.println("Use apenas números inteiros positivos não-nulos.");
                break;
            }
		}while(continueLooping == true);
		

		
		
	
				
	}

}
