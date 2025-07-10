package Exercicios;

import java.util.Scanner;
import java.lang.Math;

public class Exe10 {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	double X, Y, Equacao;
	System.out.print("Digite o valor de x:");
    X = ler.nextInt();
    System.out.print("Digite o valor de y:");
    Y = ler.nextInt();
    Equacao = 2 * Math.sqrt(3 * X + 30 / 3) + Math.pow(Y - 32, 4);
    System.out.print("O valor final e: "+Equacao);
	
	}

}
