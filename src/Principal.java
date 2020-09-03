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
			if (escolha == 5) {
			System.out.println("Voc� deseja mesmo sair do cat�logo?(S/N) ");
			String confirmacao = entrada.next().toUpperCase();
			boolean verificacaoDeSaida = tela.sair(confirmacao);
				if(verificacaoDeSaida) {
					System.out.println("At� a pr�xima!!");
					break;
				}else {
					continue;
				}
			}
			else if (escolha == 1) {
				System.out.println("Digite um livro para cadastr�-lo (nome, autor, categoria):\n ");

				String nome = entrada.nextLine();
				String autor = entrada.nextLine();
				String categoria = entrada.nextLine();

				tela.escolha(escolha, nome, autor, categoria);
			} else {
				tela.escolha(escolha);
			}
		
		entrada.close();
		}
	}
}
