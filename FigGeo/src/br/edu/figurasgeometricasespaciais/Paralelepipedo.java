package br.edu.figurasgeometricasespaciais;

import java.util.Scanner;
import br.edu.figurasgeometricasplanas.*;

public class Paralelepipedo {
    
	public double largura;
	public double comprim;
	public double arestaLat;
	public double areaBase;
	public double areaLateral;
	public double areaTotal;
	public double diagonal;
	public double volume;
	
	Scanner sc = new Scanner(System.in);
	
	Paralelogramo arBs = new Paralelogramo(); 
	
	public void calcAreaBase() {
		System.out.println("\nÁREA DA BASE\n");
		areaBase = arBs.CalcArea3(largura, comprim);
		System.out.println("\nÁREA DA BASE = " + areaBase);
	}
	public void calcAreaLateral() {
		System.out.println("\nÁREA LATERAL\n");
		System.out.println("\nDigite o valor da largura: ");
		largura = sc.nextDouble();
		System.out.println("\nDigite o valor da comprimento: ");
		comprim = sc.nextDouble();
		System.out.println("\nDigite o valor da aresta lateral: \n");
		arestaLat = sc.nextDouble();
		areaLateral = 2 * largura * arestaLat + 2 * comprim * arestaLat;
		System.out.println("\nÁREA LATERAL = " + areaLateral);
	}
	
	public void calcAreaTotal() {
		System.out.println("\nÁREA TOTAL\n");
		System.out.println("\nDigite o valor da largura: ");
		largura = sc.nextDouble();
		System.out.println("\nDigite o valor da comprimento: ");
		comprim = sc.nextDouble();
		System.out.println("\nDigite o valor da aresta lateral:");
		arestaLat = sc.nextDouble();
		areaTotal = 2 * largura * comprim + 2 * largura * arestaLat + 2 * comprim * arestaLat;
		System.out.println("\nÁREA TOTAL = " + areaTotal);
	}
	
	public void calcDiagonais() {
		System.out.println("\nDIAGONAIS\n");
		System.out.println("\nDigite o valor da largura: ");
		largura = sc.nextDouble();
		System.out.println("\nDigite o valor da comprimento: ");
		comprim = sc.nextDouble();
		System.out.println("\nDigite o valor da aresta lateral:");
		arestaLat = sc.nextDouble();
		diagonal = Math.sqrt(Math.pow(arestaLat, 2) + Math.pow(largura, 2) + Math.pow(comprim, 2));
		System.out.println("\nDIAGONAL = " + diagonal);
	}
	
	public void calcVolume() {
		System.out.println("\nVOLUME\n");
		System.out.println("\nDigite o valor da largura: ");
		largura = sc.nextDouble();
		System.out.println("\nDigite o valor da comprimento: ");
		comprim = sc.nextDouble();
		System.out.println("\nDigite o valor da aresta lateral:");
		arestaLat = sc.nextDouble();
		volume = largura * comprim * arestaLat;
		System.out.println("\nVOLUME = " + volume);
	}
	
	public void listaAtributos() {
		System.out.println("Largura: " + largura + ", Comprimento: " + comprim + ", Aresta Lateral: " + arestaLat + ", Área da Base: " + areaBase + ", Área Lateral: " + areaLateral + ", Área Total: " + areaTotal + " Diagonal: " + diagonal + "e Volume: " + volume);
	}

	
	
	
}
