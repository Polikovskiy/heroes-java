public class Rogue extends Unit {
	public Rogue(String name) {
		super(name, new State(80), new AbilitiesRogue(15), "Rogue");
	}

}