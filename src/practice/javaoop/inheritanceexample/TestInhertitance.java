package practice.javaoop.inheritanceexample;


import practice.javaoop.inheritanceexample.hierarchicalinheritance.TestHierarchicalInheritance;
import practice.javaoop.inheritanceexample.multilevelinheritance.TestMultilevelInheritance;
import practice.javaoop.inheritanceexample.multipleinheritance.TestMultipleInheritance;
import practice.javaoop.inheritanceexample.singleinheritance.TestSingleInheritance;

public class TestInhertitance {

    public static void main (String args[]){
        System.out.println("Test single inheritance. Trong mo hinh nay thang Child ke thua tu 1 thang Parent");
        TestSingleInheritance.main(args);

        System.out.println("\n \n------------------------------------------------------------ ");


        System.out.println("Test multiple inheritance. Trong mo hinh nay thang Child implement 2 interface A, B");
        TestMultipleInheritance.main(args);


        System.out.println("\n \n------------------------------------------------------------ ");


        System.out.println("Test multilevel inheritance. Trong mo hinh nay thang C ke thua thang B, thang B ke thua " +
                "thang A" +
                " ");
        TestMultilevelInheritance.main(args);


        System.out.println("\n \n------------------------------------------------------------ ");


        System.out.println("Test Hierarchical inheritance.  Trong mo hinh nay thang B, C, D cung ke thua thang A");
        TestHierarchicalInheritance.main(args);


        System.out.println("\n \n------------------------------------------------------------ ");


        System.out.println("Test Hierarchical inheritance.  Trong mo hinh nay thang B, C, D cung ke thua thang A");
        TestHierarchicalInheritance.main(args);

    }
}
