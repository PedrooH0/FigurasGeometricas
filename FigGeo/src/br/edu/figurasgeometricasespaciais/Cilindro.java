package br.edu.figurasgeometricasespaciais;

import java.util.Scanner;

  public class Cilindro {
  Scanner sc = new Scanner(System.in);
	
	public double raio;
	public double altura;
	public double areaLateral;
	public double areaTotal;
	public double volume;
	
	public void calcAreaTotal() {
		System.out.println("Digite a medida do raio: ");
		raio = sc.nextDouble();
		System.out.println("Digite a medida da altura: ");
		altura = sc.nextDouble();
		areaTotal = 2 * 3.14 * raio * (raio + altura);
		System.out.println("ÁREA TOTAL = " + areaTotal);
	}
	public void calcAreaLateral() {
		System.out.println("Digite a medida do raio: ");
		raio = sc.nextDouble();
		System.out.println("Digite a medida da altura: ");
		altura = sc.nextDouble();
		areaLateral = 2 * 3.14 * raio * altura;
		System.out.println("ÁREA LATERAL = " + areaLateral);
	}
	public void calcVolume() {
		System.out.println("Digite a medida do raio: ");
		raio = sc.nextDouble();
		System.out.println("Digite a medida da altura: ");
		altura = sc.nextDouble();
		volume = 3.14 * Math.pow(raio, 2) * altura;
		System.out.println("VOLUME = " + volume);

	}
	
	public void listaAtributos () {
		System.out.println("Raio: " + raio + ", Altura: " + altura + ", Área Lateral: " + areaLateral + ", Área Total: " + areaTotal + " e Volume: " + volume);
	}
}
