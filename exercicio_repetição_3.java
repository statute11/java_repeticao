package exercicios_repetição;

import java.util.Scanner;

public class exercicio_repetição_3 {

	public static void main(String[] args) {
		
	Scanner leitor = new Scanner(System.in);
	
	int i = 1;
	int soma = 0;
	int media = 0;
	int x;
	
	
	while(i < 21) {
	System.out.print("Escreva um número inteiro: ");
	x = leitor.nextInt();
	i++;
	
	soma = soma+x;
	media = soma/ i;
	}
	
	System.out.println("A soma entre os números é: "+soma);
	System.out.println("A média entre os números é: "+media);
	
			
	

	}

}
