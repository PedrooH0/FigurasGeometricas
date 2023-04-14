package br.edu.figurasgeometricasplanas;

public class Retangulo {

	public double base;
	public double altura;
	public double area;
	
	public void CalcArea1() {
		area = base * altura;
		System.out.println(area);
	}
	
	public void CalcArea2(double b, double h) {
		base = b;
		altura = h;
		area = b * h;
		System.out.println(area);
	}
	public double CalcArea3(double b, double h) {
		base = b;
		altura = h;
		area = b * h;
		return area;
	}
	public void listaAtributos() {
		System.out.println(base + " " + altura + " " + area);
	
	}
	
	
}
