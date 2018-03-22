package practice.basictype;

import java.util.ArrayList;
import java.util.List;

public class NumberClass {
    public static void main (String args[]){
        Integer numberA = 100;
        Integer numberB = 100;

        numberA.byteValue();

        System.out.println(numberA.compareTo(-100));

        List<Integer> listNumber = new ArrayList<>();
        listNumber.add(20);
        listNumber.add(30);
        listNumber.add(10);
        listNumber.add(50);
        listNumber.add(35);
        listNumber.add(24);
        listNumber.add(62);


        System.out.println(numberA.equals(numberB));

        Double numberC = 10.44;
        System.out.println(Math.floor(100.55));

        System.out.println(Math.rint(100.500));
        System.out.println(Math.round(100.500));

        System.out.println(Math.max(numberA, numberB));

        System.out.println(Math.random());

        Integer minNumber = 100;
        Integer maxNumber = 106;
        System.out.println((Math.floor(Math.random() * (maxNumber - minNumber))) + minNumber);

        int arrayNumb [] = null;
        arrayNumb = new int [12];
        for(int i = 0; i < 10; i++){
            arrayNumb[i] = i * (int) Math.floor(Math.random() * 20);

        }

        System.out.println(arrayNumb);

        arrayNumb[11] = 123;

        System.out.println(arrayNumb);
    }
}
