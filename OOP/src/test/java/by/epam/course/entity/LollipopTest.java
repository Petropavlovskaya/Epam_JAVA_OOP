package by.epam.course.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LollipopTest {
    Lollipop lollipop = new Lollipop(SweetType.LOLLIPOP, "Chups", 8, 9, true);
    Lollipop lollipop1 = new Lollipop(SweetType.LOLLIPOP, "Chups", 8, 9, true);
    Lollipop lollipop2 = new Lollipop(SweetType.LOLLIPOP, "Chups", 9, 10, true);
    Lollipop lollipop3 = new Lollipop(SweetType.LOLLIPOP, "Chupss", 9, 10, true);

    @Test
    void testEquals() {
        assertEquals(lollipop, lollipop1);
        assertNotEquals(lollipop1, lollipop2);
        assertNotEquals(lollipop2, lollipop3);
    }
}