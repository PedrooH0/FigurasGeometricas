package br.edu.figurasgeometricasespaciais;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Esfera {

	Scanner sc = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("0.00");
	
	private double raio;
	private double area;
	private double volume;
	
	
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		if (raio > 0) {
		  this.raio = raio;
		}
	}
	public double getArea() {
		return area;
	}
	
	public double getVolume() {
		return volume;
	}
	
	public void calcAreaTotal() {
		area = 4 * Math.PI * Math.pow(raio, 2);
	}
	public void calcVolume() {
		volume = 4 * Math.PI/3 * Math.pow(raio, 3);
	}
	public void listaAtributos () {
		System.out.println("\nraio: " + getRaio() /*+ ", Área Total: " + area + " e Volume: " + volume*/);
	}
}