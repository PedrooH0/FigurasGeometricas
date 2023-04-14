package br.edu.figurasgeometricasespaciais;

public class Cubo {
   
	public double lado;
	public double areaTotal;
	public double areaLateral;
	public double volume;
	
	public void CalcAreaTotal() {
		areaTotal = Math.pow(lado, 2) * 6;
		System.out.println(areaTotal);
	}
	public void CalcAreaLateral() {
		areaLateral = Math.pow(lado, 2) * 4;
		System.out.println(areaLateral);
	}
	public void CalcVolume() {
		volume = Math.pow(lado, 3);
		System.out.println(volume);
	}
	public void listaAtributos() {
		System.out.println("Lado: " + lado + " Área Total: " + areaTotal + " Área Lateral: " + areaLateral + " Volume: " + volume);
	}
}
