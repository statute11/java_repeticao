package exercicios_repeti��o;

import java.util.Scanner;

public class exercicio_repeti��o_3 {

	public static void main(String[] args) {
		
	Scanner leitor = new Scanner(System.in);
	
	int i = 1;
	int soma = 0;
	int media = 0;
	int x;
	
	
	while(i < 21) {
	System.out.print("Escreva um n�mero inteiro: ");
	x = leitor.nextInt();
	i++;
	
	soma = soma+x;
	media = soma/ i;
	}
	
	System.out.println("A soma entre os n�meros �: "+soma);
	System.out.println("A m�dia entre os n�meros �: "+media);
	
			
	

	}

}
