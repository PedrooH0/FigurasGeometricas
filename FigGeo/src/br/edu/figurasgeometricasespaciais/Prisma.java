package br.edu.figurasgeometricasespaciais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Prisma {
   
	public double arestaBase;
	public double altura;
	public double areaFace;
	public double areaLateral;
	public double areaBase;
	public double volume;
	public double areaTotal;
	public int numArestaBase;
	
	DecimalFormat df = new DecimalFormat ("#.00");
	Scanner sc = new Scanner(System.in);
	
	
	public void calcAreaTotal() {
		System.out.println("Digite o n�mero de arestas da base: ");
		numArestaBase = sc.nextInt();
		System.out.println("Digite o valor da aresta da base: ");
		arestaBase = sc.nextDouble();
		System.out.println("Digite o valor da altura: ");
		altura = sc.nextDouble();		
		areaBase = Math.sqrt(3) * arestaBase * arestaBase/4;
		areaTotal = areaBase + arestaBase * altura * numArestaBase;
		System.out.println("AREA TOTAL = " + df.format(areaTotal));
	}
	public void calcAreaFace() {
		System.out.println("Digite o valor da aresta da base: ");
		arestaBase = sc.nextDouble();
		System.out.println("Digite o valor da altura: ");
		altura = sc.nextDouble();
		areaFace = arestaBase * altura;
		System.out.println("ÁREA DA FACE = " + df.format(areaFace));
	}
	public void calcAreaLateral() {
		System.out.println("Digite o valor da aresta da base: ");
		arestaBase = sc.nextDouble();
		System.out.println("Digite o valor da altura: ");
		altura = sc.nextDouble();
		areaLateral = arestaBase * altura * numArestaBase;
		System.out.println("ÁREA LATERAL = " + df.format(areaLateral));
	}
	public void calcAreaBase() {
		System.out.println("Digite o n�mero de arestas da base: ");
		numArestaBase = sc.nextInt();
		System.out.println("Digite o valor da aresta da base: ");
		arestaBase = sc.nextDouble();
		areaBase = numArestaBase * Math.sqrt(3) * arestaBase * arestaBase/4;
		System.out.println("ÁREA BASE = " + df.format(areaBase));
	}
	public void calcVolume() {
		System.out.println("Digite o n�mero de arestas da base: ");
		numArestaBase = sc.nextInt();
		System.out.println("Digite o valor da aresta da base: ");
		arestaBase = sc.nextDouble();
		System.out.println("Digite o valor da altura: ");
		altura = sc.nextDouble();		
		areaBase = Math.sqrt(3) * arestaBase * arestaBase/4;
		volume = areaBase * altura;
		System.out.println("VOLUME = " + df.format(areaTotal));
	}
	
	
}
