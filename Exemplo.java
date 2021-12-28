public class Exemplo {
	static int realizarConta(int x, int y) {
		return y / x;
	}

	public static void main(String[] args) {
		try {
			int z = realizarConta(2, 10);
			System.out.println(z);
		}	catch (ArithmeticException e) {
			System.out.println("Divisão por zero");
		}	catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}	finally {
			System.out.println("Sempre executado!");
		}
		System.out.println("FIM");
	}
}
