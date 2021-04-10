package aquarium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AquariumTests {
    //TODO: TEST ALL THE FUNCTIONALITY OF THE PROVIDED CLASS Aquarium
    private static final String AQUARIUM_NAME = "Mobi";
    private static final int AQUARIUM_CAPACITY = 100;
    private static final String FISH_NAME = "Sharan";

    Aquarium aquarium;
    Fish fish;

    @Before
    public void setUp() {
        aquarium = new Aquarium(AQUARIUM_NAME, AQUARIUM_CAPACITY);
        fish = new Fish(FISH_NAME);
    }

    @Test
    public void testIfConstructorSetsCorrectValues() {
        assertEquals(AQUARIUM_NAME, aquarium.getName());
        assertEquals(AQUARIUM_CAPACITY, aquarium.getCapacity());

    }

    @Test
    public void testGetNameReturnsCorrectValue() {
        assertEquals(AQUARIUM_NAME, aquarium.getName());
    }

    @Test
    public void testGetCapacityReturnsCorrectValue() {
        assertEquals(AQUARIUM_CAPACITY, aquarium.getCapacity());
    }

    @Test
    public void testGetCountReturnsCorrectValue() {
        assertEquals(0, aquarium.getCount());
    }

    //setName -> expected NullPointerException
    @Test(expected = NullPointerException.class)
    public void testIfSetterThrowsWhenReceivingNullorEmptyString() {
        aquarium = new Aquarium(null, AQUARIUM_CAPACITY);

    }

    //setCapacity -> expected IllegalArgumentException if < 0
    @Test(expected = IllegalArgumentException.class)
    public void testIfSetterThrowsWhenReceivingNegativeCapacity() {
        aquarium = new Aquarium(AQUARIUM_NAME, -1);
    }

    // add() -> expected IllegalArgumentException if capacity is full
    @Test(expected = IllegalArgumentException.class)
    public void testIfAddThrowsWhenListSizeIsFull() {
        aquarium = new Aquarium(AQUARIUM_NAME, 0);
        boolean available = fish.isAvailable();
        if (available) {
            aquarium.add(fish);
        }
    }

    // remove() -> expected IllegalArgumentException if name doesn't exist
    @Test(expected = IllegalArgumentException.class)
    public void testIfRemoveThrowsWhenNameDoesNotExist() {
        aquarium = new Aquarium(AQUARIUM_NAME, AQUARIUM_CAPACITY);
        aquarium.remove("Pasturva");
    }

    @Test
    public void testIfRemoveReturnsTrueWhenSuchAdded() {
        aquarium = new Aquarium(AQUARIUM_NAME, AQUARIUM_CAPACITY);
        aquarium.add(fish);
        aquarium.remove(FISH_NAME);
        String report = aquarium.report();
        assertEquals("Fish available at Mobi: ", report);
    }

    // sellFish() -> expected IllegalArgumentException if fish == null
    @Test(expected = IllegalArgumentException.class)
    public void testIfSellingNonExistingFishWillThrow() {
        aquarium.sellFish("Jena mi");
        assertFalse(fish.isAvailable());
    }

    @Test
    public void testIfSellFishReturnsCorrectFish() {
        aquarium.add(fish);
        Fish sellFish = aquarium.sellFish(FISH_NAME);
        assertEquals(sellFish.getName(), fish.getName());
    }

    // report() -> returns CorrectString
    @Test
    public void testIfReportReturnsCorrectValues() {
        aquarium.add(fish);
        String report = String.format("Fish available at %s: %s", AQUARIUM_NAME, FISH_NAME);
        assertEquals(report, aquarium.report());
    }
}

