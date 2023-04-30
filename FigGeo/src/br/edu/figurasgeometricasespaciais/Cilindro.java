package br.edu.figurasgeometricasespaciais;

import java.util.Scanner;

  public class Cilindro {
  Scanner sc = new Scanner(System.in);
	
	private double raio;
	private double altura;
	private double areaLateral;
	private double areaTotal;
	private double volume;
	
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getAreaLateral() {
		return areaLateral;
	}
	public void setAreaLateral(double areaLateral) {
		this.areaLateral = areaLateral;
	}
	public double getAreaTotal() {
		return areaTotal;
	}
	public void setAreaTotal(double areaTotal) {
		this.areaTotal = areaTotal;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	
	public void calcAreaTotal() {
		areaTotal = 2 * Math.PI * raio * (raio + altura);
	}
	
	public void calcAreaLateral() {
		areaLateral = 2 * Math.PI * raio * altura;
	}
	public void calcVolume() {
		volume = Math.PI * Math.pow(raio, 2) * altura;

	}
	
	public void listaAtributos () {
		System.out.println("\nATRIBUTOS \n\nraio: " + getRaio() + "\naltura: " + getAltura() /*+ ", Área Lateral: " + areaLateral + ", Área Total: " + areaTotal + " e Volume: " + volume*/);
	}
}
