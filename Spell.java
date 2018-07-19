

public abstract class Spell {
	protected int spellpower;
	protected int needmana;
	protected String spellname;

	public Spell(int spellpower, int needmana, String spellname) {
		this.spellpower = spellpower;
		this.needmana = needmana;
		this.spellname = spellname;

	}
    
    public int getSpellpower() {
    	return spellpower;
    }

    public int getNeedmana() {
    	return needmana;
    }

    public String getSpellname() {
    	return spellname;
    }

    public abstract void action(Unit owner, Unit enemy) throws UnitIsDeadException;
}