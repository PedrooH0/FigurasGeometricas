package br.edu.figurasgeometricasespaciais;

import java.text.DecimalFormat;

public class Prisma {
    
	
	public double arestaBase;
	public double altura;
	public double areaFace;
	public double areaLateral;
	public double areaBase;
	public double volume;
	public double areaTotal;
	
	DecimalFormat df = new DecimalFormat ("#.00");
	
	
	
	public void calcAreaTotal() {
		areaBase = Math.sqrt(3) * arestaBase * arestaBase/4;
		areaTotal = areaBase * altura;
		System.out.println(df.format(areaTotal));
	}
	
}
