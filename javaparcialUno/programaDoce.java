package primeraUnidad;

import java.util.Scanner;

public class programaDoce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res;
		float calificacion;
		double s=0 , prom;
		int i=0;
				
				
		Scanner leer= new Scanner(System.in);
		
		
		do{
		
		System.out.print("Ingrese la calificaci�n: ");
		calificacion = leer.nextFloat();
		
		s=s+calificacion;
		i=i+1;
		prom=s/i;
		
		System.out.println("�Quiere caprutar una califiacion? (S/N)");
		res= leer.next();
		
	}while(res.equals("S"));
	
	if(prom>0 & prom<50){
		System.out.print("Suspenso");
	}
	
	if(prom>40 & prom<70){
		System.out.print("Aprobado");
	}
	
	if(prom>69 & prom<90){
		System.out.print("Notable");
	}
		
	if(prom>89 & prom<100){
		System.out.print("Sobresaliente");
	}
	
	if(prom==100){
		System.out.print("Matricula de honor");
	}
}
		

	}


