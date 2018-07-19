public class UnitMain {
	public static void main(String[] args) throws UnitIsDeadException {
		Soldier jaine = new Soldier("Jaine");
        Soldier ryan = new Soldier("Ryan");
        Rogue barmaley = new Rogue("Barmaley"); 
        Vampire dracula = new Vampire("Dracula");
        Werevolf lycan = new Werevolf("Lycan"); 
        Berserck viking = new Berserck("Viking");
        Wizard merlin = new Wizard("Merlin");
        Healer aibolit = new Healer("Aibolit");
        Priest batiushka = new Priest("Batiushka");
        Warlock darckLord = new Warlock("DarckLord");
        Necromancer skeleton = new Necromancer("Skeleton");


        System.out.println(jaine);
        System.out.println(ryan);
        System.out.println(barmaley);
        System.out.println(dracula);
        System.out.println(lycan);
        System.out.println(viking);
        System.out.println(merlin);
        System.out.println(aibolit);
        System.out.println(darckLord);
        System.out.println(skeleton);




        jaine.attack(ryan);

        System.out.println(jaine);
        System.out.println(ryan);

        ryan.attack(jaine);

        System.out.println(jaine);
        System.out.println(ryan);

        barmaley.attack(jaine);
        barmaley.attack(ryan);

        System.out.println(jaine);
        System.out.println(ryan);
        System.out.println(barmaley);

        dracula.attack(jaine);
        dracula.attack(barmaley);
        barmaley.attack(dracula);

        System.out.println(jaine);
        System.out.println(dracula);
        System.out.println(barmaley);

        barmaley.attack(ryan);
        System.out.println(barmaley);

        lycan.attack(ryan);
        System.out.println(ryan);
        System.out.println(lycan);

        merlin.addSpell(new Fireball());
        merlin.cast(dracula, "Fireball");

        System.out.println(dracula);

        aibolit.cast(dracula, "Heal");
        System.out.println(dracula);

        merlin.addSpell(new Freez());
        merlin.cast(dracula, "Freez");
        System.out.println(dracula);

        //merlin.addMana(40);
        System.out.println(merlin);
        System.out.println(aibolit);

        batiushka.addSpell(new Fireball());
        batiushka.cast(dracula, "Fireball");

        System.out.println(dracula);

        darckLord.attack(lycan);

        darckLord.attack(lycan);

        darckLord.attack(darckLord);

        skeleton.attack(dracula);
        System.out.println(darckLord);

        //skeleton.attack(dracula);
        System.out.println(dracula);
        System.out.println(skeleton);

        lycan.attack(dracula);

        System.out.println(dracula);
        System.out.println(skeleton);



        //a.addHitPoints(25);
        //b.addHitPoints(25);

        //System.out.println(a);
        //System.out.println(b);

        /*a.drive(2, 8);
        System.out.println(a);

        a.drive(new Point(5, 12));
        System.out.println(a);*/
    }
}    