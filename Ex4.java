package Exercicios;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
	
	Scanner ler = new Scanner(System.in);
	
	double F, C;
	
	System.out.println(" Informe a temperatura em Celsius.");
	C = ler.nextDouble();
	
	F = C*(9.0/5.0)+32.0;
	
	System.out.println("A temperatura em Fahrenheit e:  "+F);
	
		
	}

}
