package Javga;
import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		//fazer um programa que receba 3 numeros, armazene, multiplique e de o resultado.
		
		double numero1;
		double numero2;
		double numero3;
		double resultado;
		
		System.out.println("digite o primeiro numero: ");
		numero1 = ler.nextDouble();
		
		System.out.println("digite seu segundo numero: ");
		numero2 = ler.nextDouble();
		
		System.out.println("digite seu segundo numero: ");
		numero3 = ler.nextDouble();
		
		resultado = numero1 * numero2 * numero3;
		System.out.println("seu resultado é: "+resultado);
		
		
		
		

	}

}
