public class Heal extends Spell {
	public Heal() {
		super(30, 20, "Heal");
	} 

	public void action(Unit owner, Unit target) {
		System.out.println(owner.getName() + " cast heal");
		System.out.println(target.getName() + " healing");
		if (owner.getType() != "Healer" || owner.getType() != "Priest") {
			target.getState().addHp(spellpower/2);
		} else {
			target.getState().addHp(spellpower);
		}	
	}
}