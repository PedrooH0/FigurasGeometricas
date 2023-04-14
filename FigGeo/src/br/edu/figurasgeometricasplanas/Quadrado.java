package br.edu.figurasgeometricasplanas;

public class Quadrado {
	public double lado;
	public double area;
	
	public void CalcArea1() {
		area = Math.pow(lado, 2);
		System.out.println(area);
	}
	
	public void CalcArea2(double l) {
		lado = l;
		area = l * l;
		System.out.println(area);
	}
	
	public double CalcArea3(double l) {
		lado = l;
		area = l * l;
		return area;
	}
	public void listaAtributos() {
		System.out.println(lado + " " + area);
	}
	
}
