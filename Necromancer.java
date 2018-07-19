public class Necromancer extends SpellCaster implements Observer {
	public Necromancer(String name) {
		super(name, "Necromancer");
	}

	public void heal(Unit target) {
		System.out.println(target.getName() + " die, and gave his soul " + name);
		state.addHp(target.getState().getHpLimit()/3);
	}

	public void curse(Unit target) {
		System.out.println(name + " cursed " + target.getName());
		target.addObserver(this);
	}

	public void attack(Unit enemy) throws UnitIsDeadException {
    	abilities.action(this, enemy);
    	curse(enemy);
	}
}