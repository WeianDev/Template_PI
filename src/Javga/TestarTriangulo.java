package Javga;
import java.util.Scanner;
public class TestarTriangulo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float baseDigitada;
		float alturaDigitada;
		
		System.out.println("digite a base: ");
		baseDigitada = ler.nextFloat();
		
		System.out.println("digite a altura: ");
		alturaDigitada = ler.nextFloat();
		
		Triangulo t1 = new Triangulo(baseDigitada, alturaDigitada);
		System.out.println(t1.imprimeDados());
		
		// criando o segundo objeto 
		
		Triangulo t2 = new Triangulo();
		t2.base = 20;
		t2.altura = 8;
		
	System.out.println(t2.imprimeDados());
		}
	}


