package br.edu.figurasgeometricasplanas;

public class Trapezio {
   
	public double baseMaior;
	public double baseMenor;
	public double altura;
	public double area;
	
	public void CalcArea1() {
		area = (baseMenor + baseMaior) * altura/2;
		System.out.println(area);
	}
	
	public void CalcArea2(double B, double b, double h) {
		baseMaior = B;
		baseMenor = b;
		altura = h;
		area = (baseMenor + baseMaior) * altura/2;
		System.out.println(area);
	}
	public double CalcArea3(double B, double b, double h) {
		baseMaior = B;
		baseMenor = b;
		altura = h;
		area = (baseMenor + baseMaior) * altura/2;
		return area;
	}
	public void listaAtributos() {
		System.out.println(baseMaior + " " + baseMenor + " " + altura + " " + area);
	
	}
}
