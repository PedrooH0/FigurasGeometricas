package br.edu.figurasgeometricasespaciais;

import br.edu.figurasgeometricasplanas.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Tetraedo {
    
	Scanner sc = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("0.00");
	
	private byte tipo;
	private double arestaBase;
	private double alturaBase;
	private double areaBase;
	private double altura;
	private double area;
	private double volume;
	
	public double getArestaBase() {
		return arestaBase;
	}
	public void setArestaBase(double arestaBase) {
		this.arestaBase = arestaBase;
	}
	public double getAlturaBase() {
		return alturaBase;
	}
	public void setAlturaBase(double alturaBase) {
		this.alturaBase = alturaBase;
	}
	public double getAreaBase() {
		return areaBase;
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
	
	public double getVolume() {
		return volume;
	}

	public Triangulo getArealateral() {
		return arealateral;
	}

	Triangulo arealateral = new Triangulo();
	
	 public void calcAreaTotal() {
	 /*System.out.println("O Tetraedo é: \n\n1. Regular\n2. Não Regular\n");
	 tipo = sc.nextByte();
	 if (tipo == 1) {*/
		 area = Math.pow(getArestaBase(), 2) * Math.sqrt(3);
	 //}
	 /*if (tipo == 2) {
		 System.out.println("\nDigite a medida da altura da base: ");
		 alturaBase = sc.nextDouble();
		 areaBase = (arestaBase * alturaBase)/2;
		 
		 System.out.println("\nAGORA VOCÊ IRÁ DIGITAR OS VALORES PARA CALCULAR AS ÁREAS DAS FACES LATERAIS\n");
		 double fl = arealateral.calcArea4();
		 area = fl + areaBase;
		 fl = arealateral.calcArea4();
		 area = fl + area;
		 fl = arealateral.calcArea4();
		 area = fl + area;
	 }*/
    }
	public void calcVolume() {
		 /*System.out.println("O Tetraedo é: \n\n1. Regular\n2. Não Regular\n");
		 tipo = sc.nextByte();
		 if (tipo == 1) {*/
			 volume = Math.pow(getArestaBase(), 3)/12 * Math.sqrt(2);
		 /*}
		 if (tipo == 2) {
			 System.out.println("\nDigite a medida da altura da base: ");
			 alturaBase = sc.nextDouble();
			 areaBase = (getArestaBase() * alturaBase)/2;
			 volume = (areaBase * getAltura())/3;
		 }*/
	}
	public void listaAtributos () {
		System.out.println("\nATRIBUTOS\n\naresta da base: " + getArestaBase() /*+ "\naltura da base: " + getAlturaBase() + "\nárea da base: " + areaBase + "\naltura do tetraedro: " + getAltura() + ", Área Total: " + area + " e Volume: " + volume*/);
	}
}
