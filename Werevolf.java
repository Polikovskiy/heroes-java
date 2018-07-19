public class Werevolf extends Unit {
	public Werevolf(String name) {
		super(name, new State(100), new AbilitiesWerevolf(20), "Werevolf");
	}

}