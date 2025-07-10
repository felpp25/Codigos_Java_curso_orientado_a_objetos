package Exercicios;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);	
	int An, A1, R, N;	
	System.out.print("Digite o primeiro termo:");
	A1 = ler.nextInt();
	System.out.print("Digite o valor da razao:");
	R = ler.nextInt();
	System.out.print("Entre com o termo a ser verificado:");
	N = ler.nextInt();
	
	An = A1 + (N - 1) * R;
	System .out.print("O valor do termo verificado e: "+An);

	}

}
