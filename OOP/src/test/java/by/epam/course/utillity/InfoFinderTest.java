package by.epam.course.utillity;

import by.epam.course.entity.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InfoFinderTest {
        List<Sweet> sweet = new ArrayList<>();

        ChocolateBar bar = new ChocolateBar(SweetType.CHOCOLATE_BAR, "Lion", 10, 15,
                BarSize.LARGE);
        ChocolateBar bar1 = new ChocolateBar(SweetType.CHOCOLATE_BAR, "Lion", 10, 20,
                BarSize.LARGE);
        ChocolateCandy candy = new ChocolateCandy(SweetType.CHOCOLATE_CANDY, "Alenka", 5,
                8, false);
        Lollipop lollipop = new Lollipop(SweetType.LOLLIPOP, "Chups", 8, 9, true);
        Lollipop lollipop1 = new Lollipop(SweetType.LOLLIPOP, "Chups", 9, 10, true);

    @Test
    void findSweetsBySugar() {
        List<Sweet> expected = new ArrayList<>();
        float[] twoNumber = {4, 9};

        sweet.add(bar);
        sweet.add(bar1);
        sweet.add(candy);
        sweet.add(lollipop);
        sweet.add(lollipop1);

        expected.add(candy);
        expected.add(lollipop);

        assertEquals(expected, InfoFinder.findSweetsBySugar(sweet, twoNumber));
    }

    @Test
    void countGiftWeight() {
        sweet.add(bar);
        sweet.add(bar1);
        sweet.add(lollipop1);

        assertEquals(29, InfoFinder.countGiftWeight(sweet));

    }


}