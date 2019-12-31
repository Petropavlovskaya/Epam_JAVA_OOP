package by.epam.course.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChocolateCandyTest {
    ChocolateCandy candy = new ChocolateCandy(SweetType.CHOCOLATE_CANDY, "Alenka", 5,
            8, false);
    ChocolateCandy candy1 = new ChocolateCandy(SweetType.CHOCOLATE_CANDY, "Alenka", 5,
            8, false);
    ChocolateCandy candy2 = new ChocolateCandy(SweetType.CHOCOLATE_CANDY, "Alenka", 6,
            8, false);
    ChocolateCandy candy3 = new ChocolateCandy(SweetType.CHOCOLATE_CANDY, "Alenka", 5,
            8, true);

    @Test
    void testEquals() {
        assertEquals(candy1, candy);
        assertNotEquals(candy1, candy2);
        assertNotEquals(candy1, candy3);
    }
}
