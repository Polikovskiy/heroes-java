import java.lang.Math;
import java.util.Scanner;

public class AbilitiesWerevolf extends Abilities {
    private String form; 

	public AbilitiesWerevolf(int damage) {
		super(damage);
		this.form = "Human";
	}

	public String getForm() {
		return form;
	}

	public void action(Unit owner, Unit enemy) throws UnitIsDeadException {

    	System.out.println(owner.getName() + " in form " + form);
   		System.out.println("Transform? 1-yes, 0-no");
    	Scanner in = new Scanner(System.in);
    	int flag = in.nextInt();


    	if ( flag == 1 ) {
        	transform(owner);
    	}

		System.out.println(owner.getName() + " attack " + enemy.getName() + '\n');
    	enemy.takeDamage(damage);
    	enemy.getAbilities().counterAttack(enemy, owner);

    	if ( form == "Volf" ) {
        	infected(enemy);
    	}    
	}

	public void counterAttack(Unit owner, Unit enemy) throws UnitIsDeadException {
    	System.out.println(owner.getName() + " counterattack " + enemy.getName() + '\n');
    	enemy.takeDamage(damage/2);
    }	


	public void transform(Unit owner) {
    	if ( form == "Human" ) {
        	owner.getState().setHpLimit((owner.getState().getHpLimit())*2);
        	owner.getState().setHp((owner.getState().getHp())*2);
        	damage *= 2;
        	form = "Volf";
        	System.out.println(owner.getName() + " transform in " + form);
    	} else if ( form == "Volf" ) {
        	owner.getState().setHpLimit((owner.getState().getHpLimit())/2);
        	owner.getState().setHp((owner.getState().getHp())/2);
        	damage /= 2;
        	form = "Human";
        	System.out.println(owner.getName() + " transform in " + form);
    	} else {
        	return;
    	}
	}


	public void infected(Unit enemy) {
		double infected;
        infected = Math.random();

		if (enemy.getType() == "Werevolf" || enemy.getType() == "Vampire") {
			return;
		}
    	if ( enemy.getState().getHp() == 0 ) {
    		return;
    	}
    	if (infected < 0.25) {
        	enemy.setAbilities(new AbilitiesWerevolf(enemy.getAbilities().getDamage()));
            enemy.setType("Werevolf");
        	System.out.println(enemy.getName() + " infected !!!, " + enemy.getName() + " became a werevolf");
    	}
	}

}