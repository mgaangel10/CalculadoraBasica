package calculadora;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op=0;
		double num1=0;
		double num2=0;
		double result=0;
		
		System.out.println("Calculadora Básica");
		do {
			System.out.println("1---Sumar");
		System.out.println("2---Restar");
		System.out.println("3---Multiplicar");
		System.out.println("4---Division resto");
		switch (op) {
		case 1:
			System.out.println("Para sumar indiqueme el primer numero");
			num1=Leer.datoDouble();
			System.out.println("Diga el numero 2");
			num2=Leer.datoDouble();
			result=num1+num2;
			break;
		

		default:
			break;
		}
		} while (op!=0);
		
		
	}

}
