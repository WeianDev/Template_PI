package Javga;

public class Triangulo {
 float base;
 float altura;
 
 // criando o construtor vazio ()
 
 public Triangulo () {
	 base = 0;
	 altura = 0;
	 
} 
// construtor com parametros
	 
public Triangulo (float b, float a) {
	base = b;
	altura = a;
}
	float calcularArea() { 
		return(base * altura)/2;
		
		
	}
	String imprimeDados() {
		return "Base: " +base+
				"/nAltura: "+ altura +
				"nArea: "+ calcularArea();
			
	}
	
	// Crie a classe Java principal, 
	// instancie 2 objetos usando os construtores criados,
	// também utilize os outros métodos. 
	// Solicite para o usuário os lados do triângulo
 }

