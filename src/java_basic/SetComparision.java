package java_basic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetComparision {
    public static void main(String args[]){
        showInformationOfHashSet();
        showInformationOfLinkedHashSet();
        showInformationOfTreeSet();
    }

    static String [] listObject = {"Tao", "MangCau", "Buoi", "Man", "Cam", "Quit", "Chanh", "DuaHau"};

    public static void showInformationOfHashSet(){
        System.out.println("---------------HashSet--------------------");
        HashSet<String> fruitsStore = new HashSet<>();
        for(String traiCay : listObject){
            fruitsStore.add(traiCay);
        }

        Iterator<String> iterator = fruitsStore.iterator();

        while (iterator.hasNext()){
            String current = iterator.next();
            System.out.println(current.hashCode() + " : " + current);
        }
    }

    public static void showInformationOfLinkedHashSet(){
        System.out.println("---------------LinkedHashSet--------------------");
        LinkedHashSet<String> fruitsStore = new LinkedHashSet<>();
        for(String traiCay : listObject){
            fruitsStore.add(traiCay);
        }

        Iterator<String> iterator = fruitsStore.iterator();

        while (iterator.hasNext()){
            String current = iterator.next();
            System.out.println(current.hashCode() + " : " + current);
        }
    }

    public static void showInformationOfTreeSet(){
        System.out.println("---------------TreeSet--------------------");
        TreeSet<String> fruitsStore = new TreeSet<>();
        for(String traiCay : listObject){
            fruitsStore.add(traiCay);
        }

        Iterator<String> iterator = fruitsStore.iterator();

        while (iterator.hasNext()){
            String current = iterator.next();
            System.out.println(current.hashCode() + " : " + current);
        }
    }
}
