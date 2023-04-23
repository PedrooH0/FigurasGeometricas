package br.edu.figurasgeometricasespaciais;

import java.util.Scanner;

public class Cubo {
	public double lado;
	public double areaTotal;
	public double areaLateral;
	public double volume;
	
	Scanner sc = new Scanner(System.in);
	
	public void CalcAreaTotal() {
		System.out.println("Digite a medida do lado:");
		lado = sc.nextDouble();
		areaTotal = Math.pow(lado, 2) * 6;
		System.out.println("ÁREA TOTAL = " + areaTotal);
	}
	public void CalcAreaLateral() {
		System.out.println("Digite a medida do lado:");
		lado = sc.nextDouble();
		areaLateral = Math.pow(lado, 2) * 4;
		System.out.println("�REA LATERAL = " + areaLateral);
	}
	public void CalcVolume() {
		System.out.println("Digite a medida do lado:");
		lado = sc.nextDouble();
		volume = Math.pow(lado, 3);
		System.out.println("VOLUME = " + volume);
	}
	public void listaAtributos() {
		System.out.println("Lado: " + lado + ", Área Total: " + areaTotal + ", Área Lateral: " + areaLateral + "e Volume: " + volume);
	}
}