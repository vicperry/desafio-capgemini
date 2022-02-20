package questoes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

//Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma 
	//palavra podem ser realocadas para formar a outra palavra. Dada uma string 
	//qualquer, desenvolva um algoritmo que encontre o número de pares de substrings que são anagramas.


public class questao_3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma palavra: ");
		String palavra = sc.next();
		
		HashMap<String, Integer> map= new HashMap<>();
		  
	       for(int i = 0; i < palavra.length(); i++){
	           for(int c = i; c < palavra.length(); c++){
	               char[] arrayPalavra = palavra.substring(i, c+1).toCharArray();
	               Arrays.sort(arrayPalavra);
	               String val = new String(arrayPalavra);
	               if (map.containsKey(val)) { 
	                   map.put(val, map.get(val)+1);
	               }else { 
	                   map.put(val, 1);
	               }
	           	}
	       }
	       int contagemDePares = 0;
	       for(String key: map.keySet()){
	           int n = map.get(key);
	           contagemDePares += (n * (n-1))/2;
	       }
	       System.out.println("Quantidade de pares de substrings da palavra que são anagramas: "+ contagemDePares);
	}
}
