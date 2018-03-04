package practice.basic.lesson02;

public class JavaLesson02 {

    public static void main(String args[]){
        testSingletonResult();
        testEagerSingletonResult();
        testLazyLoaderSingletonResult();
        testDoubleCheckSingletonResult();
        testLazyHolderSingletonResult();
    }

    public static void testSingletonResult (){
        System.out.println("--- Singleton Pattern ---");
        Singleton single1 = Singleton.getInstance();
        Singleton single2 = Singleton.getInstance();
        if (single1.equals(single2)) {
            System.out.println("Is Unique Instance");
        } else {
            System.out.println("Is NOT Unique Instance");
        }
    }

    public static void testEagerSingletonResult (){
        System.out.println("--- Eager Singleton  ---");
        Singleton single1 = Singleton.getEagerLoadSingleton();
        Singleton single2 = Singleton.getEagerLoadSingleton();
        if (single1.equals(single2)) {
            System.out.println("Is Unique Instance");
        } else {
            System.out.println("Is NOT Unique Instance");
        }
    }

    public static void testLazyLoaderSingletonResult (){
        System.out.println("--- Lazy Loader Singleton ---");
        Singleton single1 = Singleton.getLazyLoadSingleton();
        Singleton single2 = Singleton.getLazyLoadSingleton();
        if (single1.equals(single2)) {
            System.out.println("Is Unique Instance");
        } else {
            System.out.println("Is NOT Unique Instance");
        }
    }

    public static void testDoubleCheckSingletonResult (){
        System.out.println("--- Double check Singleton ---");
        Singleton single1 = Singleton.getDoubleCheckSynchronizedSingleton();
        Singleton single2 = Singleton.getDoubleCheckSynchronizedSingleton();
        if (single1.equals(single2)) {
            System.out.println("Is Unique Instance");
        } else {
            System.out.println("Is NOT Unique Instance");
        }
    }

    public static void testLazyHolderSingletonResult (){
        System.out.println("--- Lazy Holder Pattern ---");
        Singleton single1 = Singleton.getLazyHolderInstance();
        Singleton single2 = Singleton.getLazyHolderInstance();
        if (single1.equals(single2)) {
            System.out.println("Is Unique Instance");
        } else {
            System.out.println("Is NOT Unique Instance");
        }
    }

}
