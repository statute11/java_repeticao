package exercicios_repetição;

import java.util.Scanner;

public class exercicio_repetição_5 {

	public static void main(String[] args) {
		
	Scanner leitor = new Scanner(System.in);
	
	double ssalario = 1000, salario = 0, altura, media, soma = 0, maior = 0, menor = 3;
	String sexo;
	int cont = 1, cont1000 = 0;
	
	do {
		
	System.out.print("Digite seu sexo (M/F): ");
	sexo = leitor.next();
	System.out.print("Digite seu salário em R$: ");
	salario = leitor.nextDouble();
	System.out.print("Digite sua altura em metros: ");
	altura = leitor.nextDouble();
	
	cont++;
	soma = soma + salario;
	media = soma / 20;
	
	if (altura > maior) {
		menor = altura;}
	
	if (salario < ssalario && sexo.contentEquals("F")) {
		cont1000++;}
	
	}while(cont <= 20);
	System.out.printf("Média de salário do grupo: %.2f: \n" ,media);
	System.out.println("Maior altura do grupo: "+ maior +" metros e menor altura do grupo: " + menor + " metros");
	System.out.println("Mulheres com salário até R$1000: "+cont1000);
	
	
	
	

	}

}
