package br.edu.figurasgeometricasespaciais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MenuEspaciais {

	
    byte escolhafig;
    byte escolhacalc;
	
	Scanner sc = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("0.00"); 
	
	public void FigEspaciais() {
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
		    
		    
		    System.out.print("\nDigite a medida da aresta da base: ");
			double x = sc.nextDouble();
			objTetra.setArestaBase(x);
			
			System.out.print("\nDigite a medida da altura do tetraedo: ");
			x = sc.nextDouble();
			objTetra.setAltura(x);
			
			objTetra.listaAtributos();
			
			switch(escolhacalc) {
			  case 1:
				objTetra.calcAreaTotal();
				System.out.println("\nA área total do tetraedo vale: " + df.format(objTetra.getArea()));
			    break;
			  case 2:
				objTetra.calcVolume();
				System.out.println("\nO volume do tetraedo vale: " + df.format(objTetra.getVolume()));
			    break;
			}
		 }
	 
	 if (escolhafig == 6) {	
          Cone objCone = new Cone();
			
          System.out.println("\nESCOLHA O TIPO DE CÁLCULO\n\n1. Área Lateral\n2. Área Total\n3. Volume\n");	
		    escolhacalc = sc.nextByte();
		    
		    System.out.print("\nDigite a medida do raio: ");
			double x = sc.nextDouble();
			objCone.setRaio(x);
			
			System.out.print("\nDigite a medida da altura: ");
			x = sc.nextDouble();
			objCone.setAltura(x);
			
			objCone.listaAtributos();
			
			switch(escolhacalc) {
			  case 1:
				objCone.calcAreaLateral();
				System.out.println("\nA área lateral do cone vale: " + df.format(objCone.getAreaLateral()));
			    break;
			  case 2:
				objCone.calcAreaTotal();
				System.out.println("\nA área total do cone vale: " + df.format(objCone.getAreaTotal()));
				break;
			  case 3:
				objCone.calcVolume();
				System.out.println("\nO volume do cone vale: " + df.format(objCone.getVolume()));
			}
		 }
	 
	 if (escolhafig == 7) {
		 Paralelepipedo objParallp = new Paralelepipedo();
		 
		    System.out.println("\nESCOLHA O TIPO DE CÁLCULO\n\n1. Área da Base\n2. Área Lateral\n3. Área Total\n4. Diagonais\n5. Volume\n");	
			escolhacalc = sc.nextByte();
			
			System.out.print("\nDigite o valor da largura: ");
			double x = sc.nextDouble();
			objParallp.setLargura(x);
			
			System.out.print("\nDigite o valor da comprimento: ");
			x = sc.nextDouble();
			objParallp.setComprim(x);
			
			System.out.print("\nDigite o valor da altura: ");
			x = sc.nextDouble();
			objParallp.setAltura(x);
			
			objParallp.listaAtributos();
			
			switch(escolhacalc) {
			  case 1:
			    objParallp.calcAreaBase();
			    System.out.println("\nA área da base do paralelepípedo vale: " + df.format(objParallp.getAreaBase()));
			    break;
			  case 2:  
			    objParallp.calcAreaLateral();
			    System.out.println("\nA área lateral do paralelepípedo vale: " + df.format(objParallp.getAreaLateral()));
			    break;
			  case 3:  
			    objParallp.calcAreaTotal();
			    System.out.println("\nA área total do paralelepípedo vale: " + df.format(objParallp.getAreaTotal()));
			    break;
			  case 4:
				objParallp.calcDiagonais();
				System.out.println("\nA diagonal do paralelepípedo vale: " + df.format(objParallp.getDiagonal()));
				break;
			  case 5:
			    objParallp.calcVolume();	
			    System.out.println("\nO volume do paralelepípedo vale: " + df.format(objParallp.getVolume()));
			}
	 }
	 
	 if (escolhafig == 8) {
		 Piramide objPiram = new Piramide();
		 
		 System.out.println("\nESCOLHA O TIPO DE CÁLCULO\n\n1. Área Total\n2. Volume\n");	
		 escolhacalc = sc.nextByte();
			
			System.out.print("\nDigite a medida da aresta da base: ");
			double x = sc.nextDouble();
			objPiram.setArestaBase(x);
			
			switch(escolhacalc) {
			  case 1:
				System.out.println("\nDigite o valor do apótema da pirâmide: \n");
				x = sc.nextDouble();
				objPiram.setApotema(x);
			    objPiram.calcAreaTotal();
			    System.out.println("\nA área total da pirâmide vale: " + df.format(objPiram.getAreaTotal()));
			    break;
			  case 2:  
			   System.out.print("\nDigite o valor da altura da pirâmide: ");
			   x = sc.nextDouble();
			   objPiram.setAltura(x);
			   objPiram.calcVolume();
			   System.out.println("\nO volume da pirâmide vale: " + df.format(objPiram.getVolume()));
			}
		 
	 }
	 
	}	
	
}
