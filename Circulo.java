import java.util.Scanner;

public class Circulo {
	// Atributo da classe -------
	float raio;
	final static float PI = 3.1415f; // Constante: final statc

	public Circulo ( float raio) {  // Construtor
		this.raio = raio;
	}

	// Metodo da classe ------
	float calcularPerimetro() {
		return 2 * PI * this.raio;
	}

	void imprimirDados() {
		System.out.println("Circulo: ");
		System.out.println("- raio     : " + raio);
		System.out.println("- perimetro: " + calcularPerimetro());
	}

	// Metodo principal --------
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in); // leitor de teclado
		float raio;
		System.out.println("Mundo dos Circulos");
		System.out.print("Entre o valor do raio:");
		raio = leitor.nextFloat(); // recebe o valor float
		Circulo circ1 = new Circulo (raio);	// instancia Circulo
		circ1.imprimirDados();	// invoca metodo
		System.out.println("-----------------");
		System.out.print("Entre o valor do raio:");
		raio = leitor.nextFloat();
		Circulo circ2 = new Circulo (raio);
		circ2.imprimirDados();
	}

}