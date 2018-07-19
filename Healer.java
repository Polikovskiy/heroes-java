public class Healer extends SpellCaster {
	public Healer(String name) {
		super(name, "Healer");
		this.addSpell(new Heal());
	}
}