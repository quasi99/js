import java.util.Scanner;

public class Retangulo {
	// Atributos da classe = ESTADO da classe
	float altura;
	float largura;

	// Metodos da classe = COMPRIMENTO da classe
	float calcularPerimetro() {
		float pm;
		pm = 2 * altura + 2 * largura;
		return pm;
	}

	void imprimirDados() {
		float p;	// variavel local
		p = calcularPerimetro(); // calcula o perimetro do retangulo
		System.out.println("Retangulo: ");
		System.out.println("- altura:   " + altura);
		System.out.println("- largura:  " + largura);
		System.out.println("- perimetro:" + p);
	}
	// Metodo principal - inicio de execucao do programa
	public static void main(String[] args) {
		System.out.println("Mundo dos retangulos");

		// Objetto de Retangulo retg1
		Retangulo retg1;  // referencia de objto da classe
		retg1 = new Retangulo();  // instaciacao da classe Retangulo
		retg1.altura = 10;	// atribuicao de valor para atributos
		retg1.largura = 20;	// atribuicao de valor para atributos
		retg1.imprimirDados();	// invocacao de metodo do objeto

		Retangulo retg2;
		retg2 = new Retangulo();
		retg2.altura = 5;
		retg2.largura = 15;
		retg2.imprimirDados();
	}
}