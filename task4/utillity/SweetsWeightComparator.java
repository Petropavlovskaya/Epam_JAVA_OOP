package by.epam.petropavlovskaya.task4.utillity;

import by.epam.petropavlovskaya.task4.Sweets.Sweets;

import java.util.Comparator;

// sortirovka po vesu
public class SweetsWeightComparator implements Comparator<Sweets> {
    public int compare(Sweets a, Sweets b){
        if(a.getWeight()> b.getWeight())
            return 1;
        else if(a.getWeight()< b.getWeight())
            return -1;
        else
            return 0;
    }

}
