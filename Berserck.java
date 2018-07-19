public class Berserck extends Unit {
	public Berserck(String name) {
		super(name, new State(150), new AbilitiesDefault(30), "Berserck");
	}

	public void takeMagicDamage(int damage) throws UnitIsDeadException {
		System.out.println("Magic not work !!!");
	}
}