

public class Soldier extends Unit {
	public Soldier(String name) {
		super(name, new State(100), new AbilitiesDefault(20), "Soldier");
	}

}