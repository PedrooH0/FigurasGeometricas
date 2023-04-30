package br.edu.principal;

import br.edu.figurasgeometricasplanas.*;
import br.edu.figurasgeometricasespaciais.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Principal {
		
	public static void main(String[] args) {
		
		Byte escolhatip = 0;
		Byte escolhafig = 0;
		Byte escolhacalc = 0;
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
	    System.out.println("Deseja fazer cálculo de: \n1. Figura Plana\n2. Figura Espacial\n");
	    escolhatip = sc.nextByte();
	   	
		if (escolhatip == 1) {
			MenuPlanas mp = new MenuPlanas();
			mp.FigsPlanas();
		}
		
		if (escolhatip == 2) {
		 
		  System.out.println("\nDeseja fazer cálculo de: \n\n1. Cubo\n2. Prisma\n3. Esfera\n4. Cilindro\n5. Tetraedo\n6. Cone\n7. Paralelepípedo\n8. Pirâmide\n");
		  escolhafig = sc.nextByte();
			
		 if (escolhafig == 1) {	
			Cubo objCubo = new Cubo();
			
			System.out.println("\nESCOLHA O TIPO DE CÁLCULO\n\n1. Área Lateral\n2. Área Total\n3. Volume\n");	
			escolhacalc = sc.nextByte();
			
			System.out.print("\nDigite a medida do lado: ");
			double x = sc.nextDouble();
		    objCubo.setLado(x);
		    
		    objCubo.listaAtributos();
		    
			switch(escolhacalc) {
			  case 1:
			    objCubo.CalcAreaLateral();
			    System.out.println("\nA área lateral do cubo vale: " + df.format(objCubo.getAreaLateral()));
			    break;
			  case 2:  
			    objCubo.CalcAreaTotal();
			    System.out.println("\nA área total do cubo vale: " + df.format(objCubo.getAreaTotal()));
			    break;
			  case 3:  
			    objCubo.CalcVolume();
			    System.out.println("\nO volume do cubo vale: " + df.format(objCubo.getVolume()));
			}
		 }	
		 
		 if (escolhafig == 2) {
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
		 }
		 
		 if (escolhafig == 3) {
			Esfera objEsfera = new Esfera();
			
			System.out.println("\nESCOLHA O TIPO DE CÁLCULO\n\n1. Área Total\n2. Volume\n");	
		    escolhacalc = sc.nextByte();
		    
		    System.out.print("\nÁREA DA ESFERA\n\nDigite a medida do raio: ");
		    double x = sc.nextDouble();
		    objEsfera.setRaio(x);
		    
		    objEsfera.listaAtributos();
			switch(escolhacalc) {
			 case 1:
			  objEsfera.calcAreaTotal();
			  System.out.println("\nA área total da esfera vale: " + df.format(objEsfera.getArea()));
			  break;
			 case 2:
			  objEsfera.calcVolume();
			  System.out.println("\nO volume da esfera vale: " + df.format(objEsfera.getVolume()));
			}
		 }
		 
		 if (escolhafig == 4) {	
            Cilindro objCilin = new Cilindro();
			
            System.out.println("\nESCOLHA O TIPO DE CÁLCULO\n\n1. Área Lateral\n2. Área Total\n3. Volume\n");	
		    escolhacalc = sc.nextByte();
		    
		    System.out.print("\nDigite a medida do raio: ");
			double x = sc.nextDouble();
			objCilin.setRaio(x);
			
			System.out.print("\nDigite a medida da altura: ");
			x = sc.nextDouble();
			objCilin.setAltura(x);
			
			objCilin.listaAtributos();
			switch(escolhacalc) {
			  case 1:
				objCilin.calcAreaLateral();
				System.out.println("\nA área lateral da esfera vale: " + df.format(objCilin.getAreaLateral()));
			    break;
			  case 2:
				objCilin.calcAreaTotal();
				System.out.println("\nA área total da esfera vale: " + df.format(objCilin.getAreaTotal()));
			    break;
			  case 3:
				objCilin.calcVolume();
				System.out.println("\nA área total da esfera vale: " + df.format(objCilin.getVolume()));
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
		 if (escolhafig == 8) {
			 Piramide objPiram = new Piramide();
			 
			 System.out.println("\nESCOLHA O TIPO DE CÁLCULO\n\n1. Área Total\n2. Volume\n");	
				escolhacalc = sc.nextByte();
				switch(escolhacalc) {
				  case 1:
				    objPiram.calcAreaTotal();
				    break;
				  case 2:  
				   objPiram.calcVolume();
				     
				}
			 
		 }
		 
		}	
		
		
			
	}

}