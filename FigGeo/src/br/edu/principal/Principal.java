package br.edu.principal;

import br.edu.figurasgeometricasplanas.*;

public class Principal {

	public static void main(String[] args) {
		
		/*Triangulo objtri = new Triangulo();
		
		objtri.base = 5;
		objtri.altura = 3;
		objtri.area = 7.5;
		
		System.out.println("A base do triângulo é: " + objtri.base);
		System.out.println("A altura do triângulo é: " + objtri.altura);
		System.out.println("A área do triângulo é: " + objtri.area);*/
		
		//Feito no dia 04/04/2023
		
		Triangulo objT1 = new Triangulo();
		objT1.base = 7;
		objT1.altura = 9;
		objT1.calcArea1();
		
		objT1.calcArea2(7,9);
		
		double retornoT = objT1.calcArea3(9, 7);
		System.out.println(retornoT);
		
		objT1.listaAtributos();
		
		
		
		Quadrado objQ1 = new Quadrado();
		objQ1.lado = 5;
		
		objQ1.CalcArea1();
		objQ1.CalcArea2(5);
		double retornoQ = objQ1.CalcArea3(5);
		System.out.println(retornoQ);
		
		objQ1.listaAtributos();
        
		
		
		
		Retangulo objR1 = new Retangulo();
		
		objR1.base = 8;
		objR1.altura = 5;
		
		objR1.CalcArea1();
		objR1.CalcArea2(8, 5);
		
		double retornoR = objR1.CalcArea3(8, 5);
		System.out.println(retornoR);
		
		objR1.listaAtributos();
		
	}

}
