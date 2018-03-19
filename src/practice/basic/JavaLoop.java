package practice.basic;

import practice.javaoop.inheritance.InterfaceB;

import java.util.ArrayList;
import java.util.List;

public class JavaLoop {

    private int currentValue;

    public int getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(int currentValue) {
        this.currentValue = currentValue;
    }

    public JavaLoop(int currentValue) {
        this.currentValue = currentValue;
    }

    public static void main (String array[]){
//        testBreakKeyword();
//        testContinuousKeyword();

        testSemiColonKeyword();
    }

    public static void testBreakKeyword(){
        for(int i = 0; i < 10; i++){
            System.out.println("Current index is " + i);

            if(i == 5){
                break;

            }

            System.out.println("--------------------------");
        }

        System.out.println("Go out of loop!!");
    }


    public static void testContinuousKeyword(){
        for(int i = 0; i < 10; i++){
            if(i == 5){
                continue;
            }

            System.out.println("Current index is " + i);
        }

        System.out.println("Go out of loop!!");
    }

    public static void testSemiColonKeyword(){
        int [] numberArray = new int[10];
        List<Integer> numberArrrays = new ArrayList<>();
        List<JavaLoop> listObject = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            numberArray[i] = i * 10;
            numberArrrays.add(i);
            listObject.add(new JavaLoop(i));
        }

        for(int num : numberArray){
            System.out.println("Current value is " + num);
        }

        for(int num : numberArrrays){
            System.out.println("Current value of list array is " + num);
        }

        for(JavaLoop obj : listObject){
            System.out.println("Current value of list object is " + obj.getCurrentValue());
        }


    }
}
