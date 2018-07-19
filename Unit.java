


public class Unit extends Observable {
	protected String name;
	protected String unit_type;
	protected State state;
	protected Abilities abilities;

	public Unit(String name, State state, Abilities abilities, String unit_type) {
		this.name = name;
		this.state = state;
		this.abilities = abilities;
		this.unit_type = unit_type;
	 	System.out.println(name + " unit created ");
    }

    public String getName() {
    	return name;
    }

    public String getType() {
    	return unit_type;
    }

    public State getState() {
    	return state;
    } 

    public Abilities getAbilities() {
    	return abilities;
    }

    void setAbilities(Abilities newAbilities){
		this.abilities = newAbilities;
	}

	void setType(String newUnit_type){
		this.unit_type = newUnit_type;
	}

    void setState(State newState) {
		this.state = newState;
	}

	public void takeDamage(int damage) throws UnitIsDeadException {
		ensureIsAlive();

    	if ( damage > this.state.getHp() ) {
    		damage = this.state.getHp();
    	}
    	this.state.setHp(this.state.getHp()- damage);
    	if (state.getHp() == 0) {
    		die(this);
    	}

	}

	public void takeMagicDamage(int damage) throws UnitIsDeadException {
		takeDamage(damage);
	}

	public void attack(Unit enemy) throws UnitIsDeadException {
    	abilities.action(this, enemy);
	}

	private void ensureIsAlive() throws UnitIsDeadException {

    	if ( state.getHp() == 0 ) {
    	    throw new UnitIsDeadException();
        }
    }

    public String toString() {
		return name + " : " + unit_type + " , " +
        state + " ,Damage:" + this.getAbilities().getDamage() + '\n';
	}	


}