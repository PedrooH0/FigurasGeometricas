package br.edu.figurasgeometricasespaciais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Piramide {
    
	public int tipoBase;
	public double arestaBase;
	public double altura;
	public double areaBase;
	public double apotemaBase;
	public double apotema;
	public double faceLateral;
	public double areaTotal;
	public double volume;
	
	Scanner sc = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("0.00");
	
	
	
	public void calcAreaTotal() {
		System.out.println("\nÁREA TOTAL\n");
		System.out.println("\nDigite qual figura é a base:\n\n1. Quadrado\n2. Pentágono\n3. Hexágono\n");
		tipoBase = sc.nextInt();
		switch(tipoBase) {
		  case 1:
			  System.out.println("\nÁREA DA BASE\n");
			  System.out.println("\nDigite o valor da aresta da base: \n");
			  arestaBase = sc.nextDouble();
			  areaBase = Math.pow(arestaBase, 2);
			  System.out.println("\nDigite o valor do apótema da pirâmide: \n");
			  apotema = sc.nextDouble();
			  faceLateral = arestaBase * apotema/2;
			  areaTotal = areaBase + 4 * faceLateral;
			  break;
		  case 2:
			  System.out.println("\nÁREA DA BASE\n");
			  System.out.println("\nDigite o valor da aresta da base: \n");
			  arestaBase = sc.nextDouble();
			  System.out.println("\nDigite o valor do apótema da base: \n");
			  apotemaBase = sc.nextDouble();
			  areaBase = 5 * arestaBase * apotemaBase;
			  System.out.println("\nDigite o valor do apótema da pirâmide: \n");
			  apotema = sc.nextDouble();
			  faceLateral = arestaBase * apotema/2;
			  areaTotal = areaBase + 5 * faceLateral;
			  break;
		  case 3:
			  System.out.println("\nÁREA DA BASE\n");
			  System.out.println("\nDigite o valor da aresta da base: \n");
			  arestaBase = sc.nextDouble();
			  areaBase = 6 * Math.pow(arestaBase, 2) * Math.sqrt(3) / 4;
			  System.out.println("\nDigite o valor do apótema da pirâmide: \n");
			  apotema = sc.nextDouble();
			  faceLateral = arestaBase * apotema/2;
			  areaTotal = areaBase + 6 * faceLateral;
		}
		
		System.out.println("\nÁREA TOTAL = " + df.format(areaTotal));
	}
	
	public void calcVolume() {
		System.out.println("\nÁREA TOTAL\n");
		System.out.println("\nDigite qual figura é a base:\n\n1. Quadrado\n2. Pentágono\n3. Hexágono\n");
		tipoBase = sc.nextInt();
		switch(tipoBase) {
		  case 1:
			  System.out.println("\nÁREA DA BASE\n");
			  System.out.println("\nDigite o valor da aresta da base: \n");
			  arestaBase = sc.nextDouble();
			  areaBase = Math.pow(arestaBase, 2);
			  System.out.println("\nDigite o valor da altura da pirâmide: \n");
			  altura = sc.nextDouble();
			  volume = areaBase * altura/3;  
			  break;
		  case 2:
			  System.out.println("\nÁREA DA BASE\n");
			  System.out.println("\nDigite o valor da aresta da base: \n");
			  arestaBase = sc.nextDouble();
			  System.out.println("\nDigite o valor do apótema da base: \n");
			  arestaBase = sc.nextDouble();
			  areaBase = 5 * arestaBase * apotemaBase;
			  System.out.println("\nDigite o valor da altura da pirâmide: \n");
			  altura = sc.nextDouble();
			  volume = areaBase * altura/3;
			  break;
		  case 3:
			  System.out.println("\nÁREA DA BASE\n");
			  System.out.println("\nDigite o valor da aresta da base: \n");
			  arestaBase = sc.nextDouble();
			  areaBase = 6 * Math.pow(arestaBase, 2) * Math.sqrt(3) / 4;
			  System.out.println("\nDigite o valor da altura da pirâmide: \n");
			  altura = sc.nextDouble();
			  volume = areaBase * altura/3;
		}
		System.out.println("\nVOLUME = " + df.format(volume));
	}
	
	public void listaAtributos () {
		System.out.println("Tipo da Base: " + tipoBase + ", Aresta da Base: " + arestaBase + ", Apótema da Base: " + apotemaBase + ", Apótema: " + apotema + ", Área da Base: " + areaBase + ", Altura da Pirâmide: " + altura + ", Face Lateral: " + faceLateral + ", Área Total: " + areaTotal + " e Volume: " + volume);
	}
	
}
