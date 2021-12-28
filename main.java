// comentario em uma linha

/*
====== 
conetario en bloco 
======
*/

public class OlaMundo {
	public static void main(String[] args) {
		int x, y;	// declaraão
		int X;	// declaração não é boa
		boolean p, q;	// declaração de varivel
		float a = 10.5f; // declaração de variavel
		x = 10; // atribuição de valor
		y = x - 30;  // atribuição do valor
		X = 9 % 2;  // X recebe o resultado da operação
		p = (3 >= 5); // p recebe o valor de false
		q = (true || false); // q recebe o valor de true

		System.out.println("x = x");
		System.out.println("y = " + y);
		System.out.println("X = " + X);
		System.out.println("p = " + p);
		System.out.println("q = " + q);

		System.out.println("Ola mundo !");
		System.out.println("linha1\tcoluna1\nlinha2\tcoluna2");
	}
}

