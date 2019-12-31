package by.epam.course.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChocolateBarTest {

    ChocolateBar bar = new ChocolateBar(SweetType.CHOCOLATE_BAR, "Lion", 10, 15,
            BarSize.LARGE);
    ChocolateBar bar1 = new ChocolateBar(SweetType.CHOCOLATE_BAR, "Lion", 10, 20,
            BarSize.LARGE);
    ChocolateBar bar2 = new ChocolateBar(SweetType.CHOCOLATE_BAR, "Lion", 10, 20,
            BarSize.LARGE);
    ChocolateBar bar3 = new ChocolateBar(SweetType.CHOCOLATE_BAR, "Lion", 10, 20,
            BarSize.EXTRA_LARGE);

    @Test
    void testEquals() {
        assertNotEquals(bar, bar1);
        assertEquals(bar1, bar2);
        assertNotEquals(bar2, bar3);
    }
}