package View;

import java.util.Scanner;

import Model.Calcular;

public class Game {

	static Scanner teclado = new Scanner(System.in);
	static int pontos = 0;
	static Calcular  calc;

	public static void main(String[] args) {
		Game.jogar();
	}

	public static void jogar() {
		System.out.println("Informe o n�vel de dificuldade desejada [1, 2 , 3 ou 4]: ");
		int dificuldade = Game.teclado.nextInt();
		Game.calc = new Calcular(dificuldade);

		System.out.println("Informe o resultado para a seguinte opera��o: ");

		// somar
		if (calc.getOperacao() == 0) {
			System.out.println(calc.getValor1() + " + " + calc.getValor2());
			int resposta = Game.teclado.nextInt();

			if (calc.somar(resposta)) {
				// Ganha 1 ponto
				Game.pontos += 1;
				System.out.println("Voc� tem " + Game.pontos + " ponto(s).");
			} else {

			}
		}

		// diminuir
		else if (calc.getOperacao() == 1) {
			System.out.println(calc.getValor1() + " - " + calc.getValor2());
			int resposta = Game.teclado.nextInt();

			if (calc.diminuir(resposta)) {
				// Ganha 1 ponto
				Game.pontos ++;
				System.out.println("Voc� tem " + Game.pontos + " ponto(s).");
			} else {

			}
		}

		// multiplicar
		else if (calc.getOperacao() == 2) {
			System.out.println(calc.getValor1() + " * " + calc.getValor2());
			int resposta = Game.teclado.nextInt();

			if (calc.multiplicar(resposta)) {
				// Ganha 1 ponto
				Game.pontos ++;
				System.out.println("Voc� tem " + Game.pontos + " ponto(s).");
			} else {

			}
		} else {
			System.out.println("A opera��o " + calc.getOperacao() + " n�o � reconhecida.");
		}

		System.out.println("Deseja continuar? [1 - sim, 0 - n�o]");
		int continuar = Game.teclado.nextInt();
		if (continuar == 1) {
			Game.jogar();
		} else {
			System.out.println("Voc� fez  " + Game.pontos + " pontos.");
			System.out.println("At� a pr�xima!");
			System.exit(0);
		}

	}

}
