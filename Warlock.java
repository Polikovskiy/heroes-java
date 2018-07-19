

public class Warlock extends SpellCaster {
	protected Demon demon;
	public Warlock(String name) {
		super(name, "Warlock");
		this.demon = null;
	}

	public void cast() {
		if (demon != null) {
			return;
		}
		System.out.println(name + " encourages Demon");
		this.demon = new Demon("Velzevulf");
		System.out.println(demon);
	}

	public void attack(Unit enemy) throws UnitIsDeadException {
		cast();
		if (enemy == this) {
			System.out.println("I can not attach a lord ");
			return;
		}
		demon.attack(enemy);

	}
}