import java.util.Scanner;

public class Sit {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int x;

		System.out.print ("Entre uma das opções: 1, 2, 3 ");
		x = leitor.nextInt();

		int escolha = x;
			switch (escolha) {
				case 1:
					System.out.println ("Escolha 1 selecionada");
					break;
				case 2:
					System.out.println ("Escolha 2 selecionada");
					break;
				case 3:
					System.out.println ("Escolha 3 selecionada");
					break;
				default:
					System.out.println ("Não foi possivel computar a sua escolha tente novamnete");
					break;
			}
	}
}

