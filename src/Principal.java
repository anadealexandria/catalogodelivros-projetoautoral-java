import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		TelaDeApresentacao tela = new TelaDeApresentacao();
		System.out.println("Bem-vindo(a) ao Cat�logo de Livros! \nSelecione uma das op��es apresentadas abaixo: ");
		
		tela.inicioDaAplicacao();
		tela.escolha(entrada.nextInt());
	}

}
