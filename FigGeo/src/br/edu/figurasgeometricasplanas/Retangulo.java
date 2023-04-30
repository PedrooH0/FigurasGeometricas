package br.edu.figurasgeometricasplanas;

import java.util.Scanner;

public class Retangulo {
  
    Scanner sc = new Scanner(System.in);
	
	private double base;
	private double altura;
    private double area;
	
	public void CalcArea1() {
		area = base * altura;
	}
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		if (base > 0) {
		  this.base = base;
		}
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
	   if (altura > 0) {	
		this.altura = altura;
	   }
	}

	public double getArea() {
		return area;
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
		System.out.println("\nATRIBUTOS \n\nbase: " + getBase() + "\naltura: " + getAltura());
	
	}
	
}