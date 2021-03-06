package org.tasks.kyu7.OopTasks;

import static org.testng.Assert.assertEquals;

import org.tasks.kyu7.OopTasks.TwoFightersOneWinner.Battle;
import org.tasks.kyu7.OopTasks.TwoFightersOneWinner.Fighter;
import org.testng.annotations.Test;

/**
 * Created by Dell on 4/30/2017.
 */
public class TestTwoFightersOneWinner {
    Battle battle = new Battle();

    @Test
    public void test() {
        String str = battle.declareWinner(new Fighter("Lew", 10, 2), new Fighter("Harry", 5, 4), "Lew");
        System.out.println(str);
        assertEquals("Lew", battle.declareWinner(new Fighter("Lew", 10, 2),new Fighter("Harry", 5, 4), "Lew"));
        assertEquals("Harry", battle.declareWinner(new Fighter("Lew", 10, 2),new Fighter("Harry", 5, 4), "Harry"));
        assertEquals("Harald", battle.declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harry"));
        assertEquals("Harald", battle.declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harald"));
        assertEquals("Harald", battle.declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Jerry"));
        assertEquals("Harald", battle.declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Harald"));
    }

}
