package Exercicios;

import java.util.Scanner;
import java.lang.Math;

public class Ex9 {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	double A, P, R;
	System.out.print("Digite o valor do raio:");
	R = ler.nextDouble();
	A = Math.PI * Math.pow(R, 2);
	P = 2 * Math.PI * R;
	System.out.print("o calculo do perimetro e da area respectivamente sao: "+P+ " e "+A);

	}

}
