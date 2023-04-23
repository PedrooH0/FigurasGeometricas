package br.edu.figurasgeometricasespaciais;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Cone {
   public double raio;
   public double altura;
   public double geratriz;
   public double areaLateral;
   public double areaTotal;
   public double volume;
   
   Scanner sc = new Scanner (System.in);
   DecimalFormat df = new DecimalFormat("0.00");
   
   public void calcAreaLateral(){
	   System.out.println("\nDigite a medida do raio: ");
	   raio = sc.nextDouble();
	   System.out.println("Digite a medida da altura: ");
	   altura = sc.nextDouble();
	   geratriz = Math.sqrt(Math.pow(raio, 2) + Math.pow(altura, 2));
	   areaLateral = Math.PI * raio * geratriz;
	   System.out.println("\nÁREA LATERAL = " + df.format(areaLateral));
   }
   
   public void calcAreaTotal () {
	   System.out.println("\nDigite a medida do raio: ");
	   raio = sc.nextDouble();
	   System.out.println("Digite a medida da altura: ");
	   altura = sc.nextDouble();
	   geratriz = Math.sqrt(Math.pow(raio, 2) + Math.pow(altura, 2));
	   areaTotal = Math.PI * raio * (raio + geratriz);
	   System.out.println("\nÁREA TOTAL = " + df.format(areaTotal));
   }
   
   public void calcVolume() {
	   System.out.println("\nDigite a medida do raio: ");
	   raio = sc.nextDouble();
	   System.out.println("Digite a medida da altura: ");
	   altura = sc.nextDouble();
	   volume = (Math.PI * Math.pow(raio, 2) * altura)/3;
	   System.out.println("\nVOLUME = " + df.format(volume));
   }
   
   public void listaAtributos () {
		System.out.println("Raio: " + raio + ", Altura: " + altura + ", Área Lateral: " + areaLateral + ", Área Total: " + areaTotal + " e Volume: " + volume);
	}
 }
