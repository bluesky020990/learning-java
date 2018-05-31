package practice.designpattern.strutural.flyweight;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class FlyweightExample {

    public static void main(String args[]){
        getFibonacci(100);
    }

    private static void  getFibonacci (Integer number){
        HashMap<Integer, Integer> mapFibonacci = new HashMap<>();

        Integer fib = getFibonacciByFlyweight(mapFibonacci, 20);
        System.out.println(fib);

        printHashMap(mapFibonacci);
    }

    private static Integer getFibonacciByFlyweight (HashMap<Integer, Integer> mapFibonacci, Integer number){
        if(mapFibonacci.get(number) != null) {
            return mapFibonacci.get(number);
        } else if(number == 1 || number == 2){
            Integer fib = 1;
            mapFibonacci.put(number, fib);
            return fib;
        } else {
            Integer fib = getFibonacciByFlyweight(mapFibonacci, number - 1) + getFibonacciByFlyweight(mapFibonacci, number - 2);
            mapFibonacci.put(number, fib);
            return fib;
        }
    }

    private static void printHashMap(HashMap<Integer, Integer> mapFibonacci){
        StringBuffer message = new StringBuffer();
        Map<Integer, Integer> treeMap = new TreeMap<Integer, Integer>(mapFibonacci);

        Iterator it = treeMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            message.append(pair.getValue() + ", ");
            it.remove();
        }

        System.out.println(message.toString());
    }
}
