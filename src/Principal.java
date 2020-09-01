import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		TelaDeApresentacao tela = new TelaDeApresentacao();
		System.out.println("Bem-vindo(a) ao Catálogo de Livros! \nSelecione uma das opções apresentadas abaixo: ");
		
		tela.inicioDaAplicacao();
		tela.escolha(entrada.nextInt());
	}

}
