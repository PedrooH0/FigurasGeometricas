package br.edu.principal;

import br.edu.figurasgeometricasplanas.*;
import br.edu.figurasgeometricasespaciais.*;
import java.util.Scanner;

public class Principal {
		
	public static void main(String[] args) {
		
		Byte escolhatip = 0;
		Byte escolhafig = 0;
		Byte escolhacalc = 0;
		
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("Deseja fazer cálculo de: \n1. Figura Plana\n2. Figura Espacial\n");
	    escolhatip = sc.nextByte();
	   	
		if (escolhatip == 1) {
			System.out.println("\nDeseja fazer cálculo de: \n1. Triângulo\n2. Quadrado\n3. Circulo\n4. Trapézio\n5. Paralelogramo\n6. Losango\n7. Retângulo\n");
			escolhafig = sc.nextByte();
			
			if (escolhafig == 1) {		
			   Triangulo objTrian = new Triangulo();
		       objTrian.calcArea1();   
			}
			
			if (escolhafig == 2) {
		       Quadrado objQuad = new Quadrado();
			   objQuad.CalcArea1();
			}
			
			if (escolhafig == 3) {
			   Circulo objCirc = new Circulo();
			   objCirc.CalcArea1();
			}
			
			if (escolhafig == 4) {		
               Trapezio objTrap = new Trapezio();
			   objTrap.CalcArea1();
			}
			
			if (escolhafig == 5) {	
			   Paralelogramo objParalel = new Paralelogramo();	
		       objParalel.CalcArea1();
			}
			
		    if (escolhafig == 6) {
		       Losango objLosan = new Losango();			
			   objLosan.CalcArea1();
		    }
		    
			if (escolhafig == 7) {
		       Retangulo objRetan = new Retangulo();
			   objRetan.CalcArea1();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		if (escolhatip == 2) {
		 
		  System.out.println("\nDeseja fazer cálculo de: \n1. Cubo\n2. Prisma\n3. Esfera\n4. Cilindro\n5. Tetraedo\n6. Cone\n7. Paralelepípedo\n");
		  escolhafig = sc.nextByte();
			
		 if (escolhafig == 1) {	
			Cubo objCubo = new Cubo();
			
			System.out.println("\nESCOLHA O TIPO DE CÁLCULO\n\n1. Área Lateral\n2. Área Total\n3. Volume\n");	
			escolhacalc = sc.nextByte();
			switch(escolhacalc) {
			  case 1:
			    objCubo.CalcAreaLateral();
			    break;
			  case 2:  
			    objCubo.CalcAreaTotal();
			    break;
			  case 3:  
			    objCubo.CalcVolume();
			}
		 }	
		 
		 /*if (escolhafig == 2) {
			Prisma objPrism = new Prisma();
			
			System.out.println("\nESCOLHA O TIPO DE CÁLCULO\n\n1. Área da Base\n2. Área da Face\n3. Área Lateral\n4. Área Total\n5. Volume\n");	
			escolhacalc = sc.nextByte();
			
			switch (escolhacalc) {
			 case 1:
			   objPrism.calcAreaBase();
			   break;
			 case 2:  
			   objPrism.calcAreaFace();
			   break;
			 case 3:  
			   objPrism.calcAreaLateral();
			   break;
			 case 4:  
			   objPrism.calcAreaTotal();
			   break;
			 case 5:
			   objPrism.calcVolume();
			}
		 }*/
		 
		 if (escolhafig == 3) {
			Esfera objEsfera = new Esfera();
			
			System.out.println("\nESCOLHA O TIPO DE CÁLCULO\n\n1. Área Total\n2. Volume\n");	
		    escolhacalc = sc.nextByte();
			switch(escolhacalc) {
			 case 1:
			  objEsfera.calcAreaTotal();
			  break;
			 case 2:
			  objEsfera.calcVolume();
			}
		 }
		 
		 if (escolhafig == 4) {	
            Cilindro objCilin = new Cilindro();
			
            System.out.println("\nESCOLHA O TIPO DE CÁLCULO\n\n1. Área Lateral\n2. Área Total\n2. Volume\n");	
		    escolhacalc = sc.nextByte();
			switch(escolhacalc) {
			  case 1:
				objCilin.calcAreaLateral();
			    break;
			  case 2:
				objCilin.calcAreaTotal();
			    break;
			  case 3:
				objCilin.calcVolume();
			}
		 }
		 
		 if (escolhafig == 5) {	
	            Tetraedo objTetra = new Tetraedo();
				
	            System.out.println("\nESCOLHA O TIPO DE CÁLCULO\n\n1. Área Total\n2. Volume\n");	
			    escolhacalc = sc.nextByte();
				switch(escolhacalc) {
				  case 1:
					objTetra.calcAreaTotal();
				    break;
				  case 2:
					objTetra.calcVolume();
				}
			 }
		 
		 if (escolhafig == 6) {	
	            Cone objCone = new Cone();
				
	            System.out.println("\nESCOLHA O TIPO DE CÁLCULO\n\n1. Área Lateral\n2. Área Total\n3. Volume\n");	
			    escolhacalc = sc.nextByte();
				switch(escolhacalc) {
				  case 1:
					objCone.calcAreaLateral();
				    break;
				  case 2:
					objCone.calcAreaTotal();
					break;
				  case 3:
					objCone.calcVolume();
				}
			 }
		 if (escolhafig == 7) {
			 Paralelepipedo objParallp = new Paralelepipedo();
			 
			 System.out.println("\nESCOLHA O TIPO DE CÁLCULO\n\n1. Área da Base\n2. Área Lateral\n3. Área Total\n4. Diagonais\n5. Volume\n");	
				escolhacalc = sc.nextByte();
				switch(escolhacalc) {
				  case 1:
				    objParallp.calcAreaBase();
				    break;
				  case 2:  
				    objParallp.calcAreaLateral();
				    break;
				  case 3:  
				    objParallp.calcAreaTotal();
				    break;
				  case 4:
					objParallp.calcDiagonais();
					break;
				  case 5:
				    objParallp.calcVolume();	  
				}
			 
		 }
		 
		}	
		
		
			
	}

}