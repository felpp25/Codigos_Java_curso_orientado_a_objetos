package Exercicios;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
	Scanner ler = new Scanner(System.in);
	
	double valor, desconto, valorfinal, VF;
	String produto, produtofinal;
	
	System.out.println("Informe o nome produto: ");	
	produto = ler.nextLine();	
	System.out.println("Informe o valor do produto; ");
	valor = ler.nextDouble();
	System.out.println("Infome o valor do desconto: ");
	desconto = ler.nextDouble();
	
	desconto = desconto / 100;
	valorfinal = valor * desconto;
	VF = valor - valorfinal;
	
	System.out.println("O valor final do produto "+produto+ " com o desconto e: "+VF);

	}

}
