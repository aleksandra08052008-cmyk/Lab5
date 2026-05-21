package com.gems;

import com.gems.model.*;
import com.gems.model.exceptions.EmptyNecklaceException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NecklaceTest {

    @Test
    void testTotalWeight() throws EmptyNecklaceException {
        Necklace n = new Necklace();
        n.addGem(new PreciousGem("Diamond", 1.0, 1000, 0.9));
        n.addGem(new SemiPreciousGem("Quartz", 2.0, 100, 0.6));

        assertEquals(3.0, n.totalWeight());
    }

    @Test
    void testTotalPrice() throws EmptyNecklaceException {
        Necklace n = new Necklace();
        n.addGem(new PreciousGem("Diamond", 1.0, 1000, 0.9));

        assertEquals(1000.0, n.totalPrice());
    }

    @Test
    void testSortByValue() {
        Necklace n = new Necklace();
        n.addGem(new PreciousGem("A", 1, 1000, 0.9));
        n.addGem(new SemiPreciousGem("B", 1, 100, 0.5));

        n.sortByValue();

        assertEquals("B", n.getGems().get(0).getName());
    }

    @Test
    void testEmptyNecklaceException() {
        Necklace n = new Necklace();

        assertThrows(EmptyNecklaceException.class, n::totalWeight);
    }
}
