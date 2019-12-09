package by.epam.petropavlovskaya.task4;

import by.epam.petropavlovskaya.task4.Sweets.ChocolateBar;
import by.epam.petropavlovskaya.task4.Sweets.Lollipop;
import by.epam.petropavlovskaya.task4.Sweets.Sweets;
import by.epam.petropavlovskaya.task4.utillity.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<String> list = new ArrayList<String>();

        // chitajem iz faila
        list = TxtFileReader.readTxtFile();

        // peredajem schitannuju ifo
        CreateSweets.createNewSweets(list);
//
//        PrintInfo.printCountsSweets();
//
//        PrintInfo.printAllCollections();

        ChocolateBar b = new ChocolateBar();
        Lollipop l = new Lollipop();

        List<Sweets> swList = new ArrayList<Sweets>();
        swList.add(l);
        swList.add(b);
        System.out.println(swList.toString());
        CreatePresent.collectGift(5);
    }
}
