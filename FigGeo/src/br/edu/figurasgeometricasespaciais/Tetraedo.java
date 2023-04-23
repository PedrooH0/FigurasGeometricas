package br.edu.figurasgeometricasespaciais;

import br.edu.figurasgeometricasplanas.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Tetraedo {
    
	Scanner sc = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("0.00");
	
	public byte tipo;
	public double arestaBase;
	public double alturaBase;
	public double areaBase;
	public double altura;
	public double area;
	public double volume;
	
	Triangulo arealateral = new Triangulo();
	
	public void calcAreaTotal() {
	 System.out.println("O Tetraedo é: \n\n1. Regular\n2. Não Regular\n");
	 tipo = sc.nextByte();
	 if (tipo == 1) {
		 System.out.println("\nDigite a medida da aresta da base: ");
		 arestaBase = sc.nextDouble();
		 area = Math.pow(arestaBase, 2) * Math.sqrt(3);
		 System.out.println("\nÁREA TOTAL: " + df.format(area));
	 }
	 if (tipo == 2) {
		 System.out.println("\nDigite a medida da aresta da base: ");
		 arestaBase = sc.nextDouble();
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
		 System.out.println("\nÁREA TOTAL = " + df.format(area));
	 }
  }
	public void calcVolume() {
		System.out.println("O Tetraedo é: \n\n1. Regular\n2. Não Regular\n");
		 tipo = sc.nextByte();
		 if (tipo == 1) {
			 System.out.println("\nDigite a medida da aresta da base: ");
			 arestaBase = sc.nextDouble();
			 volume = Math.pow(arestaBase, 3)/12 * Math.sqrt(2);
			 System.out.println("\nVOLUME = " + df.format(volume));
		 }
		 if (tipo == 2) {
			 System.out.println("\nDigite a medida da aresta da base: ");
			 arestaBase = sc.nextDouble();
			 System.out.println("\nDigite a medida da altura da base: ");
			 alturaBase = sc.nextDouble();
			 areaBase = (arestaBase * alturaBase)/2;
			 System.out.println("\nDigite a medida da altura do tetraedo");
			 altura = sc.nextDouble();
			 volume = (areaBase * altura)/3;
			 System.out.println("\nVOLUME = " + df.format(volume));
		 }
	}
	public void listaAtributos () {
		System.out.println("Aresta da Base: " + arestaBase + ", Altura da Base: " + alturaBase + ", Área da Base: " + areaBase + ", Altura da Pirâmide: " + altura + ", Área Total: " + area + " e Volume: " + volume);
	}
}
