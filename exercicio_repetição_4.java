package exercicios_repeti��o;

import java.util.Scanner;

public class exercicio_repeti��o_4 {

	public static void main(String[] args) {
		
	Scanner leitor = new Scanner (System.in);
	
	int i = 1;
	int numdigitado; 
	int maior = 0;
	
	while(i < 16) {
		
		System.out.print("Digite um n�mero inteiro: ");
		numdigitado = leitor.nextInt();
		i++;
		
	if(numdigitado > maior) {
			maior = numdigitado;
		}
	else if(numdigitado < maior) {
			maior = maior;
			
	
	}
	
	System.out.println("O maior n�mero �: "+ maior);
	
	
	
	

	
	
		
		
	
	}
	}
}
	
	
	
