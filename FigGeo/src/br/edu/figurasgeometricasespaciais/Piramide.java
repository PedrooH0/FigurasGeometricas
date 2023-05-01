package br.edu.figurasgeometricasespaciais;

public class Piramide {
    
	private double arestaBase;
	private double altura;
	private double areaBase;
	private double apotemaBase;
	private double apotema;
	private double faceLateral;
	private double areaTotal;
	private double volume;
	
	
	public double getArestaBase() {
		return arestaBase;
	}

	public void setArestaBase(double arestaBase) {
		this.arestaBase = arestaBase;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getAreaBase() {
		return areaBase;
	}

	public double getApotemaBase() {
		return apotemaBase;
	}

	public void setApotemaBase(double apotemaBase) {
		this.apotemaBase = apotemaBase;
	}

	public double getApotema() {
		return apotema;
	}

	public void setApotema(double apotema) {
		this.apotema = apotema;
	}

	public double getFaceLateral() {
		return faceLateral;
	}

	public double getAreaTotal() {
		return areaTotal;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public void calcAreaTotal() {
		   areaBase = Math.pow(arestaBase, 2);
		   faceLateral = arestaBase * apotema/2;
		   areaTotal = areaBase + 4 * faceLateral;
			 
	}
	
	public void calcVolume() {
			  areaBase = Math.pow(arestaBase, 2);
			  volume = areaBase * altura/3;  
	}
	
	public void listaAtributos () {
		System.out.println("Aresta da Base: " + arestaBase + ", Apótema da Base: " + apotemaBase + ", Apótema: " + apotema + ", Área da Base: " + areaBase + ", Altura da Pirâmide: " + altura + ", Face Lateral: " + faceLateral + ", Área Total: " + areaTotal + " e Volume: " + volume);
	}
	
}
