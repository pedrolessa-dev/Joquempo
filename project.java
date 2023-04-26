import java.util.Scanner;

public class Joquempo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int player, computer, playerPoint = 0, computerPoint = 0, option, matches = 0, loop = 0;
		System.out.println("========================");
		System.out.println("Joquempô");
		while (loop < 1) {
			System.out.println("========================");
			System.out.println("Escolha uma das opções");
			System.out.println("1 - Pedra");
			System.out.println("2 - Papel");
			System.out.println("3 - Tesoura");
			player = sc.nextInt();
			switch (player) {
			case 1:
				System.out.println("Você escolheu: Pedra");
				loop++;
				matches++;
				break;
			case 2:
				System.out.println("Você escolheu: Papel");
				loop++;
				matches++;
				break;
			case 3:
				System.out.println("Você escolheu: Tesoura");
				loop++;
				matches++;
				break;
			default:
				System.out.println("Opção inválida");
				loop = 0;
				continue;
			}
			computer = (int) (Math.random() * 3 + 1);
			switch (computer) {
			case 1:
				System.out.println("O computador escolheu: Pedra");
				break;
			case 2:
				System.out.println("O computador escolheu: Papel");
				break;
			case 3:
				System.out.println("O computador escolheu: Tesoura");
				break;
			}
			if (player == computer) {
				System.out.println("Empate");
			} else if ((player == 1 && computer == 3) || (player == 2 && computer == 1)
					|| (player == 3 && computer == 2)) {
				System.out.println("Você venceu!");
				playerPoint++;
			} else if ((player == 1 && computer == 2) || (player == 2 && computer == 3)
					|| (player == 3 && computer == 1)) {
				computerPoint++;
				System.out.println("O computador venceu!");
			}
			System.out.println("\nDeseja continuar jogando?");
			System.out.println("1 - Sim");
			System.out.println("2 - Não");
			option = sc.nextInt();
			switch (option) {
			case 1:
				loop = 0;
				break;
			case 2:
				System.out.println("\nVocê jogou " + matches + " partidas");
				System.out.println("Sua pontuação: " + playerPoint);
				System.out.println("Pontuação do computador: " + computerPoint);
				if (playerPoint == computerPoint) {
					System.out.println("Houve um empate!");
				} else if (playerPoint > computerPoint) {
					System.out.println("Você venceu!");
				} else
					System.out.println("O computador venceu!");
				break;
			default:
				System.out.println("Opção inválida");
				loop = 0;
				continue;
			}
			sc.close();
		}
	}
}