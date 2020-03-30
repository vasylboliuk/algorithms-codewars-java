package org.tasks.kyu7.OopTasks.TwoFightersOneWinner;

/**
 * Created by Dell on 4/30/2017.
 * Create a function that returns the name of the winner in a fight between two fighters.
 Each fighter takes turns attacking the other and whoever kills the other first is victorious. Death is defined as having health <= 0.
 Each fighter will be a Fighter object/instance. See the Fighter class below in your chosen language.
 Both health and damagePerAttack (damage_per_attack for python) will be integers larger than 0. You can mutate the Fighter objects.
 ##Example:
 declareWinner(new Fighter("Lew", 10, 2), new Fighter("Harry", 5, 4), "Lew") => "Lew"
 // Python
 declare_winner(Fighter("Lew", 10, 2), Fighter("Harry", 5, 4), "Lew") => "Lew"
 Lew attacks Harry; Harry now has 3 health.
 Harry attacks Lew; Lew now has 6 health.
 Lew attacks Harry; Harry now has 1 health.
 Harry attacks Lew; Lew now has 2 health.
 Lew attacks Harry: Harry now has -1 health and is dead. Lew wins.
 ####Technical note for Clojure programmers: The second fighter argument (f2) always attacks first.
 */
public class Battle {

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {

        if(firstAttacker.equals(fighter2.name)){
            Fighter temp = fighter1;
            fighter1 = fighter2;
            fighter2 = temp;
        }

        while(fighter1.health >0 && fighter2.health >0)
        {
            fighter2.health = fighter2.health - fighter1.damagePerAttack;
            if(fighter2.health<=0){break;}
            fighter1.health = fighter1.health - fighter2.damagePerAttack;
        }

        return fighter2.health<=0 ? fighter1.name : fighter2.name;
    }

}
