

public class Vampire extends Unit {
	public Vampire (String name) {
		super(name, new State(120), new AbilitiesVampire(25), "Vampire");
	}	
}