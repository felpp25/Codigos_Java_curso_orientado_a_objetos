package Exercicios;

import java.util.Scanner;
import java.lang.Math;

public class Exe11 {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	double A, B, X1, X2, Y1, Y2, DistanciaEuclidiana;
	System.out.print("Digite a coordenada X do ponto A: ");
	X1 = ler.nextDouble();
	System.out.print("Digite a coordenada y do ponto A: ");
	Y1 = ler.nextDouble();
	System.out.print("Digite a coordenada X do ponto B: ");
	X2 = ler.nextDouble();
	System.out.print("Digite a coordenada y do ponto B: ");
	Y2 = ler.nextDouble();
	DistanciaEuclidiana = Math.sqrt(Math.pow(Y2 - Y1, 2) + Math.pow(X2 - X1, 2));
	System.out.print("O valor de da distancia euclidiana "+DistanciaEuclidiana);

	}

}
