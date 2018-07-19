public class Priest extends SpellCaster {
	public Priest(String name) {
		super(name, "Priest");
		this.addSpell(new Heal());
	}
}