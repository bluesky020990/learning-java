package practice.object_reference;
/*
*
*
* */
public class ObjectReference {
    public static void main(String[] args) {
        swapTwoNumberAndShowResult();
//        swapTwoObjectAndShowResult();
//        swapTwoColorAndShowResult();
//        swapTwoColorObjectAndShowResult();
    }

    public static void swapTwoColorObjectAndShowResult(){
        Color redColor = new Color("red");
        Color subColorRed = new Color("orange");
        redColor.setSubColor(subColorRed);

        Color greenColor = new Color("green");
        Color subColorGreen = new Color("lightgreen");
        greenColor.setSubColor(subColorGreen);

        System.out.println("What we want: ");
        System.out.println("Sub __red color is lightgreen");
        System.out.println("Sub Green color is orange");

        swapTwoColorBySubColor(redColor, greenColor);

        System.out.println("And result is: ");
        System.out.println("What we want: ");
        System.out.println("Sub __red color is " +  redColor.getSubColor().getColor());
        System.out.println("Sub Green color is " +  greenColor.getSubColor().getColor());

    }

    public static void swapTwoColorAndShowResult(){
        Color redColor = new Color("red");
        Color greenColor = new Color("green");

        System.out.println("What we want: ");
        System.out.println("Red color is green");
        System.out.println("Green color is red");

        swapTwoColor(redColor, greenColor);

        System.out.println("And result is: ");
        System.out.println("Red color is " + redColor.getColor());
        System.out.println("Green color is " + greenColor.getColor());
    }

    public static void swapTwoObjectAndShowResult(){
        Color redColor = new Color("red");
        Color greenColor = new Color("green");

        System.out.println("What we want: ");
        System.out.println("Red color is green");
        System.out.println("Green color is red");

        swapTwoObject(redColor, greenColor);

        System.out.println("And result is: ");
        System.out.println("Red color is " + redColor.getColor());
        System.out.println("Green color is " + greenColor.getColor());
    }

    public static void swapTwoNumberAndShowResult(){
        int numberA = 10;
        int numberB = 100;

        System.out.println("What we want: ");
        System.out.println("Number A is 100");
        System.out.println("Number B is 10");

        swapTwoNumber(numberA, numberB);

        System.out.println("And result is: ");
        System.out.println("Number A is " + numberA);
        System.out.println("Number B is " + numberB);
    }

    public static void swapTwoNumber (int numberA, int numberB){
        int temp = numberB;
        numberB = numberA;
        numberA = temp;
    }

    public static void swapTwoObject(Color objectA, Color objectB){
        Color objectC = objectB;
        objectB = objectA;
        objectA = objectC;
    }

    public static void swapTwoColor(Color objectA, Color objectB){
        String temp = objectB.getColor();
        objectB.setColor(objectA.getColor());
        objectA.setColor(temp);
    }

    public static void swapTwoColorBySubColor(Color objectA, Color objectB){
        Color subColorTemp = objectA.getSubColor();
        objectA.setSubColor(objectB.getSubColor());
        objectB.setSubColor(subColorTemp);
    }
}
