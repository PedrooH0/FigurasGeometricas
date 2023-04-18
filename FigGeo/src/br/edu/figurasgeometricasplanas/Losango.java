package br.edu.figurasgeometricasplanas;

public class Losango {
   
	public double diagonalMaior;
	public double diagonalMenor;
	public double area;
	
	public void CalcArea1() {
		area = diagonalMaior * diagonalMenor/2;
		System.out.println(area);
	}
	
	public void CalcArea2(double D, double d) {
		diagonalMaior = D;
		diagonalMenor = d;
		area = diagonalMaior * diagonalMenor/2;
		System.out.println(area);
	}
	public double CalcArea3(double D, double d) {
		diagonalMaior = D;
		diagonalMenor = d;
		area = diagonalMaior * diagonalMenor/2;
		return area;
	}
	
	
	public void listaAtributos() {
		System.out.println(diagonalMaior + " " + diagonalMenor + " " + area);
	
	}
}
