

public class AbilitiesDefault extends Abilities {
	public AbilitiesDefault(int damage) {
		super(damage);
	}

	public void action(Unit owner, Unit enemy) throws UnitIsDeadException {
		System.out.println(owner.getName() + " attack " + enemy.getName() + '\n');
		enemy.takeDamage(owner.getAbilities().getDamage());
		enemy.getAbilities().counterAttack(enemy, owner);
	}

	public void counterAttack(Unit owner, Unit enemy) throws UnitIsDeadException {
		System.out.println(owner.getName() + " counterattack " + enemy.getName() + '\n');
		enemy.takeDamage((owner.getAbilities().getDamage())/2);
	}
}