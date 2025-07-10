package Exercicios;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
	Scanner ler = new Scanner(System.in);	
	
	double quocienteReal;
	int n1, n2, quociente, resto; 
  		
	System.out.println("Informe o primeiro numero: ");
	n1 = ler.nextInt(); 
	
	System.out.println("Informe o segundo numero: ");
	n2 = ler.nextInt(); 
	
	quociente = n1 / n2;
	System.out.println("Quociente = " + quociente);
	resto = n1 % n2;
	System.out.println("Resto = " + resto);
	quocienteReal = (double) n1 / n2;
	System.out.println("Quociente Real = " + quocienteReal);

	
	}

}
