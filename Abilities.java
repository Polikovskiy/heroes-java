

public abstract class Abilities {
	protected int damage;

	public Abilities(int damage) {
		this.damage = damage;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int newDamage) {
			this.damage = newDamage;
	}

	public abstract void action(Unit owner, Unit enemy) throws UnitIsDeadException; 

	public abstract void counterAttack(Unit owner, Unit enemy) throws UnitIsDeadException;	


}