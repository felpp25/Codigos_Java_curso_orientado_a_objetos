package Exercicios;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	double tempogasto, velocidadeM, distancia, tempo, autonomia, litrosusados;
	
	
	System.out.println("Informe o tempo gasto da viagem: ");
	tempogasto = ler.nextDouble();
	
	System.out.println("Informe a velocidade media da viagem: ");
	velocidadeM = ler.nextDouble();
	
	distancia = tempogasto * velocidadeM;
	
	autonomia = 12;
	litrosusados = distancia / autonomia;
	
	System.out.println("A Velocidade media: "+velocidadeM);
	System.out.println("O tempo gasto: "+tempogasto);
	System.out.println("A deistancia: "+distancia);
	System.out.println("Quantidade de litros usados na viagem: "+litrosusados);
	
	
	
	
	
	
	}

}
