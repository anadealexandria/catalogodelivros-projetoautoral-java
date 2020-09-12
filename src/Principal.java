import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int contador = 0;

		TelaDeApresentacao tela = new TelaDeApresentacao();

		while (contador >= 0) {
			System.out.println("Bem-vindo(a) ao Catálogo  de Livros! \nSelecione uma das opções apresentadas abaixo: ");

			tela.inicioDaAplicacao();
			int escolha = entrada.nextInt();
			entrada.nextLine();
			if (escolha == 8) {
				System.out.println("Você deseja mesmo sair do catálogo?(S/N) ");
				String confirmacao = entrada.next().toUpperCase();
				boolean verificacaoDeSaida = tela.sair(confirmacao);
				if (verificacaoDeSaida) {
					System.out.println("Até a próxima!!");
					break;
				} else {
					continue;
				}
			}
			if (escolha == 1) {
				System.out.println("Digite um livro para cadastrá-lo (nome, autor, categoria):\n ");

				String nome = entrada.nextLine();
				String autor = entrada.nextLine();
				String categoria = entrada.nextLine();

				tela.escolha(escolha, nome, autor, categoria);
			}
			if (escolha == 2) {
				System.out.println("Digite o index do livro que deseja modificar, assim como as alterações:");

				int index = entrada.nextInt();
				entrada.nextLine();
				String nome = entrada.nextLine();
				String autor = entrada.nextLine();
				String categoria = entrada.nextLine();
				tela.escolha(escolha, index, nome, autor, categoria);
			}

			if (escolha == 4) {
				System.out.println("Digite o nome do livro que você busca:");
				String nome = entrada.nextLine();
				tela.escolha(escolha, nome);
			} else {
				tela.escolha(escolha);

			}

			entrada.nextLine();
			// entrada.close();
		}
	}
}
