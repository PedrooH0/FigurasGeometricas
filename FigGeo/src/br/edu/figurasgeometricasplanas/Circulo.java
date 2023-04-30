package br.edu.figurasgeometricasplanas;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Circulo {
	private double raio;
	private double area;

	Scanner sc = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("0.00");
	
	public void setRaio(double raio) {
		if (raio > 0) {
		  this.raio = raio;
		}
	}

	public double getArea() {
		return area;
	}

	public void CalcArea1() {
		area = Math.PI * Math.pow(raio, 2);
	}
	
	public void CalcArea2(double r) {
		raio = r;
		area = Math.PI * Math.pow(raio, 2);
		System.out.println(area);
	}
	public double CalcArea3(double r) {
		raio = r;
		area = 3.14 * Math.pow(raio, 2);
		return area;
	}
	public void listaAtributos() {
		System.out.println("\nATRIBUTO\n\nraio: " + raio);
	
	}
	
}