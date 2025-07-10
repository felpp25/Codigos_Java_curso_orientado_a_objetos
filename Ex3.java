package Exercicios;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
	
	int idade, idadeanos;
	String nome;
		
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Informe o seu nome: ");
	nome = ler.nextLine();
	
	System.out.println("Ola "+nome+", inforem sua idade: ");
	idade = ler.nextInt();
	
    idadeanos = idade * 365;
    
    System.out.println(nome+", voce tem "+idadeanos+" em dias");
    
	
	
	
	
	
	}

}
