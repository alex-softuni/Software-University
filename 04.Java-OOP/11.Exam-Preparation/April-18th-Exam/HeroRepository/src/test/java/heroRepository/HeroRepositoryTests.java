package heroRepository;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.*;

public class HeroRepositoryTests {
    private Hero hero;
    private HeroRepository heroRepository;

    @Before
    public void setUp() {
        hero = new Hero("Judge", 10);
        heroRepository = new HeroRepository();
    }

    @Test(expected = NullPointerException.class)
    public void testCreateShouldFailWhenHeroIsNull() {
        hero = null;
        heroRepository.create(hero);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateShouldFailWhenHeroIsAlreadyCreated() {
        heroRepository.create(hero);
        heroRepository.create(hero);
    }

    @Test
    public void testCreateShouldAddHeroToRepository() {
        heroRepository.create(hero);
        assertEquals(heroRepository.getHero(hero.getName()).getName(), hero.getName());
    }

    @Test
    public void testGetCountShouldReturnCorrectSizeOfCollection() {
        heroRepository.create(hero);
        int expected = 1;
        int actual = heroRepository.getCount();

        assertEquals(expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void testRemoveShouldFailWhenInputIsNull() {
        heroRepository.remove(null);
    }

    @Test(expected = NullPointerException.class)
    public void testRemoveShouldFailWhenInputIsEmpty() {
        heroRepository.remove("");
    }

    @Test
    public void testRemoveShouldDeleteFromRepo() {
        heroRepository.create(hero);
        heroRepository.remove("Judge");
        assertNull(heroRepository.getHero("Judge"));
        assertEquals(0, heroRepository.getCount());
    }

    @Test
    public void testGetHeroWithHighestLevelShouldReturnNullIfRepoIsEmpty() {
        assertNull(heroRepository.getHeroWithHighestLevel());
    }

    @Test
    public void testGetHeroWithHighestLevelShouldReturnCorrectHero() {
        addHeroes();
        Hero bestHero = heroRepository.getHeroWithHighestLevel();
        assertEquals("Georgi", bestHero.getName());
        assertEquals(999, bestHero.getLevel());
    }

    @Test
    public void testGetHeroesShouldReturnCorrectValues() {
        addHeroes();
        Collection<Hero> heroes = heroRepository.getHeroes();
        assertEquals(heroRepository.getCount(), heroes.size());
        for (Hero h : heroes) {
            assertNotNull(heroRepository.getHero(h.getName()));
        }
    }

    private void addHeroes() {
        heroRepository.create(new Hero("Peter", 13));
        heroRepository.create(new Hero("Alex", 42));
        heroRepository.create(new Hero("Georgi", 999));
        heroRepository.create(new Hero("Judge", 73));
    }


}
