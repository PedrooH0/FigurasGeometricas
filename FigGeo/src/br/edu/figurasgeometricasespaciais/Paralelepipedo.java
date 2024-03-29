package br.edu.figurasgeometricasespaciais;

import java.util.Scanner;
import br.edu.figurasgeometricasplanas.*;

public class Paralelepipedo {
    
	private double largura;
	private double comprim;
	private double altura;
	private double areaBase;
	private double areaLateral;
	private double areaTotal;
	private double diagonal;
	private double volume;
	
	
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	public double getComprim() {
		return comprim;
	}
	public void setComprim(double comprim) {
		this.comprim = comprim;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getAreaBase() {
		return areaBase;
	}

	public double getAreaLateral() {
		return areaLateral;
	}
	
	public double getAreaTotal() {
		return areaTotal;
	}
	
	public double getDiagonal() {
		return diagonal;
	}
	
	public double getVolume() {
		return volume;
	}

	Scanner sc = new Scanner(System.in);
	
	Paralelogramo arBs = new Paralelogramo(); 
	
	public void calcAreaBase() {
		areaBase = arBs.CalcArea3(largura, comprim);
	}
	
	public void calcAreaLateral() {
		areaLateral = 2 * largura * altura + 2 * comprim * altura;
	}
	
	public void calcAreaTotal() {
		areaTotal = 2 * largura * comprim + 2 * largura * altura + 2 * comprim * altura;
	}
	
	public void calcDiagonais() {
		diagonal = Math.sqrt(Math.pow(altura, 2) + Math.pow(largura, 2) + Math.pow(comprim, 2));
	}
	
	public void calcVolume() {
		volume = largura * comprim * altura;
	}
	
	public void listaAtributos() {
		System.out.println("\nATRIBUTOS\n\nlargura: " + getLargura() + "\ncomprimento: " + getComprim() + "\naltura: " + getAltura() /*+ ", Área da Base: " + areaBase + ", Área Lateral: " + areaLateral + ", Área Total: " + areaTotal + " Diagonal: " + diagonal + "e Volume: " + volume*/);
	}

}
