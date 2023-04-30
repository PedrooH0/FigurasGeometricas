package br.edu.figurasgeometricasespaciais;

import java.util.Scanner;

public class Cubo {
	private double lado;
	private double areaTotal;
	private double areaLateral;
	private double volume;
	
	Scanner sc = new Scanner(System.in);
	
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		if (lado > 0) {
		  this.lado = lado;
		}
	}
	
	public double getAreaTotal() {
		return areaTotal;
	}
	
	public double getAreaLateral() {
		return areaLateral;
	}
	
	public double getVolume() {
		return volume;
	}
	
	
	public void CalcAreaTotal() {
		areaTotal = Math.pow(lado, 2) * 6;
	}
	public void CalcAreaLateral() {
		areaLateral = Math.pow(lado, 2) * 4;
		
	}
	public void CalcVolume() {	
		volume = Math.pow(lado, 3);
	}
	public void listaAtributos() {
		System.out.println("\nATRIBUTO\n\nlado: " + getLado() /*+ ", Área Total: " + areaTotal + ", Área Lateral: " + areaLateral + "e Volume: " + volume*/);
	}
}