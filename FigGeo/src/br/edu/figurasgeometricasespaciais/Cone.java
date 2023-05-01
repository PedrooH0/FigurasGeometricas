package br.edu.figurasgeometricasespaciais;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Cone {
   private double raio;
   private double altura;
   private double geratriz;
   private double areaLateral;
   private double areaTotal;
   private double volume;
   
   public double getRaio() {
	return raio;
   }

   public void setRaio(double raio) {
	if (raio > 0) {
	  this.raio = raio;
	}
   }
 
   public double getAltura() {
	return altura;
   }

   public void setAltura(double altura) {
	   if (altura > 0) {
	this.altura = altura;
	   }
   }

   public double getGeratriz() {
	return geratriz;
   }

   public double getAreaLateral() {
	return areaLateral;
   }
 
   public double getAreaTotal() {
	return areaTotal;
   }

   public double getVolume() {
	return volume;
   }


   Scanner sc = new Scanner (System.in);
   DecimalFormat df = new DecimalFormat("0.00");
   
   public void calcAreaLateral(){
	   geratriz = Math.sqrt(Math.pow(raio, 2) + Math.pow(altura, 2));
	   areaLateral = Math.PI * raio * geratriz;
   }
   
   public void calcAreaTotal () {
	   geratriz = Math.sqrt(Math.pow(raio, 2) + Math.pow(altura, 2));
	   areaTotal = Math.PI * raio * (raio + geratriz);
   }
   
   public void calcVolume() {
	   volume = (Math.PI * Math.pow(raio, 2) * altura)/3;
   }
   
   public void listaAtributos () {
		System.out.println("\nATRIBUTOS\n\nraio: " + getRaio() + "\naltura: " + getAltura() /*+ ", Área Lateral: " + areaLateral + ", Área Total: " + areaTotal + " e Volume: " + volume*/);
	}
 }
