class CarrinhoDeCompras {
	private static int maximo = 10;
	private static int quantidade = 0;
	private static int inseridos = 0;
	private static int removidos = 0;
	private static double preco_unitario = 10.00;

	public static void inserir() {
		assert (quantidade < maximo);
		quantidade++;
		inseridos++;
		assert (quantidade == inseridos - removidos);
	}

	public static void remover() {
		assert (quantidade > 0);
		quantidade--;
		removidos++;
		assert (quantidade >=0);
		assert (quantidade == inseridos - removidos);
	}
}