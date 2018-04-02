package practice.designpattern.creational.singleton;

public class TestSingleton {

    public static void main(String args[]){
        testSingletonResult();
        testEagerSingletonResult();
        testLazyLoaderSingletonResult();
        testDoubleCheckSingletonResult();
        testLazyHolderSingletonResult();
        testEnumSingleTonResult();
    }

    public static void testSingletonResult (){
        System.out.println("--- SingletonExample Pattern ---");
        SingletonExample single1 = SingletonExample.getInstance();
        SingletonExample single2 = SingletonExample.getInstance();
        if (single1.equals(single2)) {
            System.out.println("Is Unique Instance");
        } else {
            System.out.println("Is NOT Unique Instance");
        }
    }

    public static void testEagerSingletonResult (){
        System.out.println("--- Eager SingletonExample  ---");
        SingletonExample single1 = SingletonExample.getEagerLoadSingleton();
        SingletonExample single2 = SingletonExample.getEagerLoadSingleton();
        if (single1.equals(single2)) {
            System.out.println("Is Unique Instance");
        } else {
            System.out.println("Is NOT Unique Instance");
        }
    }

    public static void testLazyLoaderSingletonResult (){
        System.out.println("--- Lazy Loader SingletonExample ---");
        SingletonExample single1 = SingletonExample.getLazyLoadSingleton();
        SingletonExample single2 = SingletonExample.getLazyLoadSingleton();
        if (single1.equals(single2)) {
            System.out.println("Is Unique Instance");
        } else {
            System.out.println("Is NOT Unique Instance");
        }
    }

    public static void testDoubleCheckSingletonResult (){
        System.out.println("--- Double check SingletonExample ---");
        SingletonExample single1 = SingletonExample.getDoubleCheckSynchronizedSingleton();
        SingletonExample single2 = SingletonExample.getDoubleCheckSynchronizedSingleton();
        if (single1.equals(single2)) {
            System.out.println("Is Unique Instance");
        } else {
            System.out.println("Is NOT Unique Instance");
        }
    }

    public static void testLazyHolderSingletonResult (){
        System.out.println("--- Lazy Holder Pattern ---");
        SingletonExample single1 = SingletonExample.getLazyHolderInstance();
        SingletonExample single2 = SingletonExample.getLazyHolderInstance();
        if (single1.equals(single2)) {
            System.out.println("Is Unique Instance");
        } else {
            System.out.println("Is NOT Unique Instance");
        }
    }

    public static void testEnumSingleTonResult (){
        EnumSingleton singleton  = EnumSingleton.INSTANCE;
        singleton.showMessage();
    }

}
