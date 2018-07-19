public class Freez extends Spell {
	public Freez() {
		super(15, 30, "Freez");
	}
	public void action(Unit owner, Unit enemy) throws UnitIsDeadException {
		System.out.println(owner.getName() + " cast freez");
		System.out.println(enemy.getName() + " ");
		enemy.getAbilities().setDamage(enemy.getAbilities().getDamage() - 5);
		enemy.takeMagicDamage(spellpower);
	}
	
}