package practice.basic.accessmodifier;

public class AccessModifierTest {


    public static void main (String args[]){
        AccessModifier accessModifier = new AccessModifier();

        String publicProperties = accessModifier.publicProperties;

        String protectedProperties = accessModifier.protectedProperties;

        // Cau lenh nay co loi vi ban ko duoc quyen truy cap den thuoc tinh duoc khai bao la private trong class
        // String privateProperties = accessModifier.privateProperties;

    }
}
