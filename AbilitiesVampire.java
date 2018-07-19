import java.lang.Math;





public class AbilitiesVampire extends Abilities {
    public AbilitiesVampire(int damage) {
        super(damage);
    }

    public void action(Unit owner, Unit enemy) throws UnitIsDeadException {
        
        enemy.takeDamage(damage);
        System.out.println(owner.getName() + " attack " + enemy.getName() + '\n');
        bloodDrain(owner, enemy);
        enemy.getAbilities().counterAttack(enemy, owner);
        infected(enemy);
    }

    public void counterAttack(Unit owner, Unit enemy) throws UnitIsDeadException {
        System.out.println(owner.getName() + " counterattack " + enemy.getName() + '\n');
        enemy.takeDamage(damage/2);
        bloodDrain(owner, enemy);
    }

    public void bloodDrain(Unit owner, Unit enemy) {
        if (enemy.getType() == "Vampire") {
            return;
        }
        if ( owner.getState().getHp() == owner.getState().getHpLimit() || owner.getState().getHp() == 0 ) {
            return;
        }

        int hpBlood;
        if ( enemy.getState().getHp() < damage ) {
            hpBlood = enemy.getState().getHp()/5;
        } else {
            hpBlood = damage/5;
        }
        owner.getState().addHp(hpBlood);
        System.out.println(owner.getName() + " draine blood " + enemy.getName());
    }

    public void infected(Unit enemy) {
        if (enemy.getState().getHp() == 0) {
            return;
        }
        double infected;
        infected = Math.random();
        if (enemy.getType() == "Werevolf" || enemy.getType() == "Vampire" ) {
            return;
        }
        if ( enemy.getState().getHp() == 0 ) {
            return;
        }
        if (infected < 0.25 ) {
            enemy.setAbilities(new AbilitiesVampire(enemy.getAbilities().getDamage()));
            enemy.setType("Vampire");
            System.out.println(enemy.getName() + " infected !!!, " + enemy.getName() + " became a vampire");
        }
    }

     

}