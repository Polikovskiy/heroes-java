import java.util.HashMap;
import java.util.Map;

public class SpellCaster extends Unit {
	protected int mana;
	protected int maxMana;
	protected Map<String, Spell> spellbook;

	public SpellCaster(String name, String type_spellcaster) {
		super(name, new State(80), new AbilitiesDefault(10), type_spellcaster);
		this.mana = 100;
		this.maxMana = 100;
		this.spellbook = new HashMap<String, Spell>(); 

	}

	public void cast(Unit enemy, String spellname) throws UnitIsDeadException {
    	Spell spell = spellbook.get(spellname);
    	if (spell == null) {
    		System.out.println("Spell not found!!!");
    		return;
    	}

    	if (mana < spell.getNeedmana()) {
    		System.out.println("not have a mana :(");
    		return;
    	}

    	mana -= spell.getNeedmana();
    	spell.action(this, enemy);

	}

	public void addSpell(Spell newSpell) {
		spellbook.put(newSpell.getSpellname(), newSpell);

	}

	 public String toString() {
		return name + " : " + unit_type + " , " +
        state + ", Mana: " + maxMana + "/" + mana + " ,Damage:" + this.getAbilities().getDamage() + '\n';
	}	

}