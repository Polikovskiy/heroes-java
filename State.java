public class State {

	public int hp;
	public int hpLimit;


	public State(int hp) {
    	this.hp = hp;
    	this.hpLimit = hp;
	}

	public int getHp() {
    	return hp;
	}	

	public int getHpLimit() {
    	return this.hpLimit;
	}

	public void addHp(int hp) {
    	this.hp += hp;
    	if ( this.hp > this.hpLimit ) {
        	this.hp = this.hpLimit;
    	}
	}

	public void setHp(int newHp) {
    	if (newHp < 0 ) {
        	return;
    	}
    	if (newHp > hpLimit ) {
        	newHp = hpLimit;
    	}
    	this.hp = newHp;

	}

	public void setHpLimit(int newHpLimit) {
    	if (newHpLimit < 0 ) {
        	return;
    	}

    	this.hpLimit = newHpLimit;

	}  

	public String toString() {
		return hpLimit + "/" + hp;
	}	
}