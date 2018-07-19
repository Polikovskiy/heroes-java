

class Fireball extends Spell {
	Fireball() {
		super(30, 30, "Fireball");
	}

	public void action(Unit owner, Unit enemy) throws UnitIsDeadException {
		System.out.println(owner.getName() + " cast " + spellname);
		System.out.println(enemy.getName() + " bern in fire !!! ");
        
        if (owner.getType() == "Healer" || owner.getType() == "Priest") {
        	if (enemy.getType() == "Vampire" || enemy.getType() == "Necromanser") {
        		enemy.takeMagicDamage(spellpower*2);
        		return;
        	}
        	enemy.takeMagicDamage(spellpower/2);
        } else {
            enemy.takeMagicDamage(spellpower);
        }    
	}
}