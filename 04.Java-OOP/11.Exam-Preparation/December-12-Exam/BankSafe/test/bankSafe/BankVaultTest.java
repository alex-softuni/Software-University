package bankSafe;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;
import java.util.Collections;


public class BankVaultTest {
    private BankVault bankVault;
    private Item item;

    @Before
    public void setUp() {
        bankVault = new BankVault();
        item = new Item("Alex", "S63 L");

    }
    //TODO: Write your tests here

    @Test
    public void testIfConstructorInitMap() {
        Assert.assertEquals(Collections.unmodifiableMap(bankVault.getVaultCells()), bankVault.getVaultCells());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddItemToNonExistingCell() throws OperationNotSupportedException {

        bankVault.addItem("NonExistingCell", item);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddingItemToTakenCell() throws OperationNotSupportedException {
        bankVault.addItem("A1", item);
        bankVault.addItem("A1", item);

    }



    @Test
    public void testIfAddMethodWorks() throws OperationNotSupportedException {
        String expected = String.format("Item:%s saved successfully!", item.getItemId());
        String actual = bankVault.addItem("A1", item);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIfRemoveMethodWorks() throws OperationNotSupportedException {
        bankVault.addItem("A1", item);
        String expected = bankVault.removeItem("A1", item);
        String actual = String.format("Remove item:%s successfully!", item.getItemId());
        Assert.assertEquals(expected, actual);
        Assert.assertNull(bankVault.getVaultCells().get("A1"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemovingNonExistingKey() {
        bankVault.removeItem("A88888", item);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemovingNonExistingItem() throws OperationNotSupportedException {
        bankVault.addItem("Sharo", item);
        bankVault.removeItem("Sharo", new Item("SandoMando", "hubavo mi stava kat si piina"));
    }
}