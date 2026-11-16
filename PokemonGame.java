import java.util.Scanner;

public class PokemonGame {

	private Pokemon attack_monster;
	private Pokemon defending_monster;


	public void menu() {
		//choose your pokemon
		Scanner input = new Scanner(System.in);

		int random_num = 1;

		while (random_num != 0) {

			System.out.println("\n\n\n0) Quit\n1) Bulbasaur\n2) Charmander\n3) Pikachu\n4) Squirtle\n");
			random_num = input.nextInt();

			System.out.print("\033[H\033[2J");
			System.out.flush();
			if (random_num == 0) {
				break;
			}
			else if(random_num == 1) {
				attack_monster = new Bulbasaur();
			}
			else if(random_num == 2) {
				attack_monster = new Charmander();
			}
			else if(random_num == 3) {
				attack_monster = new Pikachu();
			}
			else if(random_num == 4) {
				attack_monster = new Squirtle();
			}
			else {
				System.out.println("Invalid Input. Try again.");
				continue;
			}

			attack_monster.about();
		}

		//Cpu choose defending_monsoter

		//Dsiplay info about Pokemon



	}
}
