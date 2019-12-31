package by.epam.course.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SweetTest {
    ChocolateBar bar = new ChocolateBar(SweetType.CHOCOLATE_BAR, "Lion", 10, 15,
            BarSize.LARGE);
    ChocolateCandy candy = new ChocolateCandy(SweetType.CHOCOLATE_CANDY, "Alenka", 5,
            8, false);
    Lollipop lollipop = new Lollipop(SweetType.LOLLIPOP, "Chups", 8.3F, 9.7F, true);
    Lollipop lollipop1 = new Lollipop(SweetType.LOLLIPOP, "Chups", 8.3F, 9.7F, true);

    @Test
    void getWeight() {
        assertEquals(8.3F, lollipop.getWeight());
        assertEquals(10, bar.getWeight());
        assertEquals(5, candy.getWeight());
    }

    @Test
    void getAmountSugar() {
        assertEquals(9.7F, lollipop.getAmountSugar());
        assertEquals(15, bar.getAmountSugar());
        assertEquals(8, candy.getAmountSugar());
    }

    @Test
    void testEquals() {
        assertEquals(lollipop, lollipop1);
        assertNotEquals(lollipop, bar);
    }
}