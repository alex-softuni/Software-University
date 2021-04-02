package rpg_tests;

import org.junit.Before;
import org.junit.Test;
import rpg_lab.Axe;
import rpg_lab.Dummy;

import static org.junit.Assert.*;

public class AxeTest {
    private static final int AXE_ATTACK = 10;
    private static final int AXE_DURABILITY = 1;
    private static final int DUMMY_HEALTH = 20;
    private static final int DUMMY_XP = 10;
    private static final int EXPECTED_DURABILITY = AXE_DURABILITY - 1;

    private Axe axe;
    private Dummy dummy;

    @Before
    public void initializeTestObjects() {
        axe = new Axe(AXE_ATTACK,AXE_DURABILITY);
        dummy = new Dummy(DUMMY_HEALTH,DUMMY_XP);
    }

    @Test
    public void testWeaponLosesDurabilityWhenAttacking() {
        axe.attack(dummy);
        assertEquals(EXPECTED_DURABILITY, axe.getDurabilityPoints());
    }

    @Test(expected = IllegalStateException.class)
    public void testAttackingWithBrokenWeaponFails() {
        axe = new Axe(10,0);
        axe.attack(dummy);
    }


}
