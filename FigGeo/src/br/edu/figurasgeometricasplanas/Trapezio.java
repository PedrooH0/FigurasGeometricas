package br.edu.figurasgeometricasplanas;

import java.util.Scanner;

public class Trapezio {
	
	private double baseMaior;
	private double baseMenor;
	private double altura;
	private double area;
	
	public double getBaseMaior() {
		return baseMaior;
	}

	public void setBaseMaior(double baseMaior) {
		if (baseMaior > 0) {
		   this.baseMaior = baseMaior;
		}
	}

	public double getBaseMenor() {
		return baseMenor;
	}

	public void setBaseMenor(double baseMenor) {
		if (baseMenor > 0) {
		  this.baseMenor = baseMenor;
		}
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getArea() {
		return area;
	}

	
	
	public void CalcArea1() {
		area = (baseMenor + baseMaior) * altura/2;
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
		System.out.println("\nATRIBUTOS \n\nbase maior: " + getBaseMaior() + "\nbase menor: " + getBaseMenor() + "\naltura: " + getAltura());	
	}
	
}