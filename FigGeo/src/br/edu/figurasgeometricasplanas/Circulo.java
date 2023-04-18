package br.edu.figurasgeometricasplanas;

public class Circulo {
   
	public double raio;
	public double area;
	
	public void CalcArea1() {
		area = 3.14 * Math.pow(raio, 2);
		System.out.println(area);
	}
	
	public void CalcArea2(double r) {
		raio = r;
		area = 3.14 * Math.pow(raio, 2);
		System.out.println(area);
	}
	public double CalcArea3(double r) {
		raio = r;
		area = 3.14 * Math.pow(raio, 2);
		return area;
	}
	public void listaAtributos() {
		System.out.println(raio + " " + area);
	
	}
}
