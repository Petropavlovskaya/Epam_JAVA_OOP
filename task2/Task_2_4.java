package by.epam.petropavlovskaya.task2;

public class Task_2_4 {
    static int day=28, month=02, year=1700;
    static boolean isLeap = false;

    public static void main(String[] args){
        System.out.println("Old date is: "+day+"."+month+"."+year );
        checkYear();
        nextDate();
        System.out.println("New date is: "+day+"."+month+"."+year );
    }

    static void checkYear(){
        if ((year%4 == 0 & year%100 == 0 & year%400 == 0) || (year%4 == 0 & (year%100 != 0)) )//|| year%4 == 0
            isLeap = true;
    }

    static void nextDate(){
        if ((day==29 & month==2 & isLeap) || (day==28 & month==2 & !isLeap) ||
                (day==30 & (month==4 || month==9 || month==11) || day==31)){
            day=1;
            setNextMonth();
        }
        else
            day++;
    }
    static void setNextMonth(){
        if (month==12){
            month=1;
            year++;
        }
        else
            month++;
    }
}
