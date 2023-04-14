package br.edu.figurasgeometricasplanas;

public class Triangulo {
	public double base;
	public double altura;
	public double area;
	
	//Feito no dia 04/04/2023
	
	public void calcArea1() {
	    area = (base * altura)/2;
	    System.out.println(area);
	}
	
	public void calcArea2(double h, double b) {
		base = b;
		altura = h;
		area = (base * altura)/2;
		System.out.println(area);
	}
	
	public double calcArea3(double h, double b) {
		base = b;
		altura = h;
		area = (base * altura)/2;
		return area;
	}
	

	public void listaAtributos() {
		System.out.println(base + " " + altura + " " + area);	
	}
	
}
