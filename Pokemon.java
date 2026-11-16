abstract class Pokemon {

	public int lifepoints;
	public int attackpoints;
	public abstract void about();
	public abstract void attack(Pokemon victim);

}

class Bulbasaur extends Pokemon {

	@Override
	public void about() {
		System.out.println("Bulbasuar stuff is a grass type and poison type.");
	}

	@Override
	public void attack(Pokemon victim) {
		victim.lifepoints = victim.lifepoints - super.attackpoints;
	}
}


class Charmander extends Pokemon {


	@Override
	public void about() {
		System.out.println("Charmendar stuff ");
	}

	@Override
	public void attack(Pokemon victim) {
		victim.lifepoints = victim.lifepoints - super.attackpoints;
	}

}

class Pikachu extends Pokemon {

	@Override
	public void about() {
		System.out.println("Pikachu stuff ");
	}

	@Override
	public void attack(Pokemon victim) {
		victim.lifepoints = victim.lifepoints - super.attackpoints;
	}

}


class Squirtle extends Pokemon {


	@Override
	public void about() {
		System.out.println("Squirtle stuff ");
	}

	@Override
	public void attack(Pokemon victim) {
		victim.lifepoints = victim.lifepoints - super.attackpoints;
	}

}



