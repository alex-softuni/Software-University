package rpg_tests;

import org.junit.Before;
import org.junit.Test;
import rpg_lab.Axe;
import rpg_lab.Dummy;
import rpg_lab.Hero;

import static org.junit.Assert.*;
public class DummyTest {
    private static final int DUMMY_HEALTH = 100;
    private static final int DUMMY_XP = 100;
    private static final int AXE_ATTACK = 10;
    private static final int AXE_DURABILITY = 10;
    private static final String HERO_NAME = "Alex";

    private Dummy dummy;
    private Axe axe;
    private Hero hero;

    @Before
    public void initializeTestObjects() {
        dummy = new Dummy(DUMMY_HEALTH, DUMMY_XP);
        axe = new Axe(AXE_ATTACK, AXE_DURABILITY);
        hero = new Hero(HERO_NAME);
    }

    @Test
    public void testDummyLosesHealthWhenAttacked() {
        dummy.takeAttack(axe.getAttackPoints());
        assertEquals(90, dummy.getHealth());
    }

    @Test(expected = IllegalStateException.class)
    public void testDeadDummyThrowsExceptionWhenAttacked() {
        dummy = new Dummy(0,10);
        dummy.takeAttack(axe.getAttackPoints());
    }

    @Test
    public void testDeadDummyGivesXP() {
        dummy = new Dummy(1,100);
        hero.attack(dummy);
        assertEquals(100,hero.getExperience());

    }

    @Test
    public void testAliveDummyCantGiveXP() {
        hero.attack(dummy);
        assertEquals(0,hero.getExperience());
    }
}
