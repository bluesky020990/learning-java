package practice.basic.createobject;

public class JavaLesson03 {
    private String message;

    public JavaLesson03(){

    }

    public JavaLesson03(String message){
        this.message = message;
    }

    public void sayHello(){
        if(this.message != null && this.message.trim() != ""){
            System.out.println(message);
        } else {
            System.out.println("Say hello world!");
        }
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static void main(String[] args)  {
        createObjectFromNewMethod();
        createObjectFromClassName();
        createObjectByClassLoaderAndGetInstanceMethod();
        createObjectByCloneMethod();
        showParentOfEachObject();
    }

    public static void createObjectFromNewMethod () {
        JavaLesson03 demoClass = new JavaLesson03("The object create by new operator");
        demoClass.sayHello();
    }

    public static void createObjectFromClassName () {
        try{
            Class clazz = Class.forName("practice.basic.createobject.JavaLesson03");
            JavaLesson03 demo = (JavaLesson03) clazz.newInstance();
            demo.setMessage("The object created from class name!!");
            demo.sayHello();

        }catch(ClassNotFoundException e){
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }

    public static void createObjectByClassLoaderAndGetInstanceMethod(){
        try {
            ClassLoader cl = JavaLesson03.class.getClassLoader();
            JavaLesson03 t = (JavaLesson03)cl.loadClass("practice.basic.createobject.JavaLesson03").newInstance();
            t.setMessage("The object created from Class Loader and get Instance method!!");
            t.sayHello();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void createObjectByCloneMethod(){
        JavaLesson03 demoClass = new JavaLesson03("The object create by new operator");
        try {
            JavaLesson03 cloneObject = (JavaLesson03) demoClass.clone();
            cloneObject.setMessage("The object create by clone method");
            cloneObject.sayHello();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }

    public static void showParentOfEachObject (){
        JavaLesson03 lesson03 = new JavaLesson03("test function !!");
        String str = new String("Hello");
        Object obj = new Object();

        //Get the superClass of each objects
        System.out.println("Super class of JavaLesson03 class is : " + lesson03.getClass().getSuperclass());
        System.out.println("Super class of String       class is : " + str.getClass().getSuperclass());
        System.out.println("Super class of Object       class is : " + obj.getClass().getSuperclass());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new JavaLesson03(this.getMessage());
    }
}
