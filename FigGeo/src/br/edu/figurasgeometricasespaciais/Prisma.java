package br.edu.figurasgeometricasespaciais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Prisma {
   
	
	public int tipoBase;
	public double arestaBase;
	public double arestaLateral;
	public double altura;
	public double apotemaBase;
	public double alturaBase;
	public double areaFace;
	public double areaLateral;
	public double areaBase;
	public double volume;
	public double areaTotal;
	
	DecimalFormat df = new DecimalFormat ("#.00");
	Scanner sc = new Scanner(System.in);
	
	public void calcAreaFace() {
		System.out.println("\nÁREA DA FACE\n");
		System.out.println("\nDigite o valor da aresta da base: \n");
		arestaBase = sc.nextDouble();
		System.out.println("\nDigite o valor da aresta lateral: \n");
		arestaLateral = sc.nextDouble();
		areaFace = arestaBase * arestaLateral;
		System.out.println("\nÁREA DA FACE = " + df.format(areaFace));
	}
	
	public void calcAreaLateral() {
		System.out.println("\nÁREA LATERAL\n");
		System.out.println("\nQuantas arestas laterais há na base (3, 5 ou 6)?");
		tipoBase = sc.nextInt();
		switch(tipoBase) {
		  case 1:
			 for (int x = 1 ; x < 4 ; x++) {
				 System.out.println("\nÁREA DA FACE " + x);
				 System.out.println("\nDigite o valor da aresta da base: \n");
					arestaBase = sc.nextDouble();
					System.out.println("\nDigite o valor da aresta lateral: \n");
					arestaLateral = sc.nextDouble();
					areaFace = arestaBase * arestaLateral;
					areaLateral+= areaFace;
			 }
		  case 2:
				 for (int x = 1 ; x < 6 ; x++) {
					 System.out.println("\nÁREA DA FACE " + x);
					 System.out.println("\nDigite o valor da aresta da base: \n");
						arestaBase = sc.nextDouble();
						System.out.println("\nDigite o valor da aresta lateral: \n");
						arestaLateral = sc.nextDouble();
						areaFace = arestaBase * arestaLateral;
						areaLateral+= areaFace;
				 } 
		  case 3:
				 for (int x = 1 ; x < 7; x++) {
					 System.out.println("\nÁREA DA FACE " + x);
					 System.out.println("\nDigite o valor da aresta da base: \n");
						arestaBase = sc.nextDouble();
						System.out.println("\nDigite o valor da aresta lateral: \n");
						arestaLateral = sc.nextDouble();
						areaFace = arestaBase * arestaLateral;
						areaLateral+= areaFace;
				 } 
		}
		
		System.out.println("\nÁREA LATERAL = " + df.format(areaLateral));
	}
		
		public void calcAreaTotal() {
			System.out.println("\nÁREA TOTAL\n");
		    calcAreaBase();
		    calcAreaLateral();
			areaTotal = 2 * areaBase * areaLateral;
			System.out.println("\nÁREA TOTAL = " + df.format(areaTotal));
		
		
	}	
	
	public void calcAreaBase() {
		System.out.println("\nÁREA DA BASE\n");
		System.out.println("\nDigite qual figura é a base:\n\n1. Triângulo\n2. Pentágono\n3. Hexágono\n");
		tipoBase = sc.nextInt();
		switch(tipoBase) {
		  case 1:
			  System.out.println("\nÁREA DA BASE\n");
			  System.out.println("\nDigite o valor da aresta da base: \n");
			  arestaBase = sc.nextDouble();
			  System.out.println("\nDigite o valor da altura da base: \n");
			  alturaBase = sc.nextDouble();
			  areaBase = arestaBase * alturaBase/2;
		  case 2:
			  System.out.println("\nÁREA DA BASE\n");
			  System.out.println("\nDigite o valor da aresta da base: \n");
			  arestaBase = sc.nextDouble();
			  System.out.println("\nDigite o valor do apótema da base: \n");
			  areaBase = 5 * arestaBase * apotemaBase;
		  case 3:
			  System.out.println("\nÁREA DA BASE\n");
			  System.out.println("\nDigite o valor da aresta da base: \n");
			  arestaBase = sc.nextDouble();
			  areaBase = 6 * Math.pow(arestaBase, 2) * Math.sqrt(3) / 4;
		}
		
		System.out.println("\nÁREA DA BASE = " + df.format(areaBase));
	}
	
	public void calcVolume() {
		System.out.println("\nVOLUME\n");
	    calcAreaBase();
	    System.out.println("\nDigite o valor da altura do prisma: \n");
		altura = sc.nextDouble();
		areaTotal = areaBase * altura;
		System.out.println("\nVOLUME = " + df.format(volume));
	}
	
	public void listaAtributos () {
		System.out.println("Aresta da Base: " + arestaBase + "Aresta Lateral: " + arestaLateral + ", Apótema da Base: " + apotemaBase + ", Altura da Base: " + alturaBase + ", Área da Base: " + areaBase + ", Área da Face: " + areaFace + ", Área Lateral: " + areaLateral + ", Altura do Prisma: " + altura /*+ ", Área Total: " + areaTotal + " e Volume: " + volume*/);
	}
	
}
