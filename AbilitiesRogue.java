public class AbilitiesRogue extends Abilities {
	public AbilitiesRogue(int damage) {
		super(damage);
	}

	public void action(Unit owner, Unit enemy) throws UnitIsDeadException {
		System.out.println(owner.getName() + " attack " + enemy.getName());
		enemy.takeDamage(owner.getAbilities().getDamage());
    }

	public void counterAttack(Unit owner, Unit enemy) throws UnitIsDeadException {
		System.out.println(owner.getName() + " counterattack " + enemy.getName());
		enemy.takeDamage((owner.getAbilities().getDamage())/2);
	}
}