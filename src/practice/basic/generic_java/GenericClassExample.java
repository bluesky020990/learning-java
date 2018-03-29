package practice.basic.generic_java;

public class GenericClassExample {

    public static void main(String []args){
        testGenericMethod();

    }


    public static void testGenericMethod (){
        Integer [] listIntegerNumber = {25, 13, 1, 34, 62, 14, 56, 70};
        Long [] listDoubleNumber = {0l, 10l, 20l, 30l, 40l, 50l, 100l};

        displayValueOfArray(listIntegerNumber, "Show value of generic integer array ");
        displayValueOfArray(listDoubleNumber, "Show value of generic long array ");

        getMaxValueOfArray(listIntegerNumber, "Show value of generic integer array ");
    }

    public static <E> void displayValueOfArray (E array[], E message){
        System.out.println(message);
        for(E element : array){
            displayValueOfElement(element);
        }
    }

    public static <T extends Comparable<T>> void getMaxValueOfArray (T array[], String message){
        System.out.println(message);
        T maxValue = null;
        for(T element : array){
            displayValueOfElement(element);
            if(maxValue == null || maxValue.compareTo(element) < 0){
                maxValue = element;
            }
        }
        System.out.println("Max value of array is ");
        displayValueOfElement(maxValue);
    }

    public static <E> void displayValueOfElement (E element){
        System.out.println("This value is  " + element);
    }

}
