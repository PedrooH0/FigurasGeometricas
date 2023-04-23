package br.edu.figurasgeometricasespaciais;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Esfera {

	Scanner sc = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("0.00");
	
	public double raio;
	public double area;
	public double volume;
	
	public void calcAreaTotal() {
		System.out.print("\nÁREA DA ESFERA\n\nDigite a medida do raio: ");
		raio = sc.nextDouble();
		area = 4 * 3.14 * Math.pow(raio, 2);
		System.out.println("ÁREA = " + df.format(area));
	}
	public void calcVolume() {
		System.out.print("\nVOLUME DA ESFERA\n\nDigite a medida do raio: ");
		raio = sc.nextDouble();
		volume = 4 * 3.14/3 * Math.pow(raio, 3);
		System.out.println("VOLUME = " + df.format(volume));
	}
	public void listaAtributos () {
		System.out.println("Raio: " + raio + ", Área Total: " + area + " e Volume: " + volume);
	}
}