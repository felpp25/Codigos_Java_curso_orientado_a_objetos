package Exercicios;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int A, B, C;
	System.out.print("Digite o valor de A: ");
    A = ler.nextInt();
    System.out.print("Digite o valor de B: ");
    B = ler.nextInt();
    C = A;
    A = B;		
    B = C;
    System.out.printf("Os valores de A e B respectivamente sao: "+A+" e " +B);
	}

}
