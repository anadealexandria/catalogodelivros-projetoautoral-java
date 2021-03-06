import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int contador = 0;

		TelaDeApresentacao tela = new TelaDeApresentacao();

		while (contador >= 0) {
			System.out.println("Bem-vindo(a) ao Cat�logo  de Livros! \nSelecione uma das op��es apresentadas abaixo: ");

			tela.inicioDaAplicacao();
			int escolha = entrada.nextInt();
			entrada.nextLine();
			if (escolha == 8) {
				System.out.println("Voc� deseja mesmo sair do cat�logo?(S/N) ");
				String confirmacao = entrada.next().toLowerCase();
				boolean verificacaoDeSaida = tela.sair(confirmacao);
				if (verificacaoDeSaida) {
					System.out.println("At� a pr�xima!!");
					break;
				} else {
					continue;
				}
			}
			if (escolha == 1) {
				System.out.println("Digite um livro para cadastr�-lo (nome, autor, categoria):\n ");

				String nome = entrada.nextLine().toLowerCase();
				String autor = entrada.nextLine().toLowerCase();
				String categoria = entrada.nextLine().toLowerCase();

				tela.escolha(escolha, nome, autor, categoria);
			}
			if (escolha == 2) {
				System.out.println("Digite o index do livro que deseja modificar, assim como as altera��es:");

				int index = entrada.nextInt();
				entrada.nextLine();
				String nome = entrada.nextLine().toLowerCase();
				String autor = entrada.nextLine().toLowerCase();
				String categoria = entrada.nextLine().toLowerCase();
				tela.escolha(escolha, index, nome, autor, categoria);
			}

			if (escolha == 4) {
				System.out.println("Digite o nome do livro que voc� busca:");
				String nome = entrada.nextLine().toLowerCase();
				tela.escolha(escolha, nome);
			} 
			
			if (escolha == 5) {
				System.out.println("Digite o nome do autor que busca: ");
				String autor = entrada.nextLine().toLowerCase();
				tela.escolha(escolha, autor);
			}
			
			if (escolha == 6) {
				System.out.println("Digite o nome da categoria: ");
				String categoria = entrada.nextLine().toLowerCase();
				tela.escolha(escolha, categoria);
			}
			
			if (escolha == 7) {
				if(tela.getRegrasDoCatalogo().getLivros().isEmpty()) {
					System.out.println("N�o h� livros cadastrados!");
				}else {
				System.out.println("Digite o n�mero correspondente ao elemento que deseja excluir: ");
				int num = entrada.nextInt();
				entrada.nextLine();
				System.out.println("Voc� deseja mesmo remover?(S/N)");
				String resposta = entrada.next().toLowerCase();
				tela.escolha(escolha, num, resposta);
				}
			}
			else {
				tela.escolha(escolha);

			}

			System.out.print("\n");
		}
		entrada.close();
	}
}
