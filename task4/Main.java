package by.epam.petropavlovskaya.task4;

import by.epam.petropavlovskaya.task4.Sweets.Sweets;
import by.epam.petropavlovskaya.task4.utillity.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<String> list = new ArrayList<String>();
        List<Sweets> myGift = new ArrayList<Sweets>();
        ReadTxtForFactory.readDataForFactory();                 // Ispravleno
//
//        PrintInfo.printCountsSweets();
//
//        PrintInfo.printAllCollections();

        myGift = CreatePresent.collectGift(7);

        SortCollection.sortGiftForWeight(myGift);
        System.out.println();
        SortCollection.sortGiftForWeightAndSugar(myGift);
        List<Sweets> mewSWEEEE = FindBySugar.findSweetsBySugar(myGift, 14, 65);
        System.out.println("Find by sugar from 14 to 65");
        for (Sweets s:mewSWEEEE){
            System.out.println(s.toString());
        }
    }
}
