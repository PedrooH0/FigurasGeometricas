package br.edu.figurasgeometricasplanas;

import java.util.Scanner;

public class Quadrado {
    
	private double lado;
	
	public void setLado(double lado) {
		if (lado > 0) {
		  this.lado = lado;
		}
	}
    
	public double getArea() {
		return area;
	}

	private double area;
	
	Scanner sc = new Scanner(System.in);
	
	public void CalcArea1() {
		area = Math.pow(lado, 2);
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
		System.out.println("\nATRIBUTO\n\nlado: " + lado);
	}
		
}