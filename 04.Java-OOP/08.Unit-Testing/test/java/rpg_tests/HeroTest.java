package rpg_tests;

import org.junit.Before;
import org.junit.Test;
import rpg_lab.Axe;
import rpg_lab.Dummy;
import rpg_lab.Hero;
import rpg_lab.interfaces.Target;
import rpg_lab.interfaces.Weapon;

import static org.junit.Assert.*;

public class HeroTest {
    private static final String HERO_NAME = "Alex";
    private static final int AXE_ATTACK = 10;
    private static final int AXE_DURABILITY = 10;
    private static final int DUMMY_HEALTH = 10;
    private static final int DUMMY_XP = 10000;

    private Hero hero;
    private Weapon weapon;
    private Target target;

    @Before
    public void initTestObjects() {
        weapon = new Axe(AXE_ATTACK, AXE_DURABILITY);
        hero = new Hero(HERO_NAME, weapon);
        target = new Dummy(DUMMY_HEALTH, DUMMY_XP);
    }

    @Test
    public void testKillingTargetGainsXP() {
        hero.attack(target);
        assertEquals(DUMMY_XP, hero.getExperience());
    }
}
