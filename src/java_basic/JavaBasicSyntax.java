package java_basic;

import utils.JavaUtils;

public class JavaBasicSyntax {



    public static void main(String args[]){
        javaIdentifiersExample();
        javaModifierExample();
    }

    //1. Java identifiers
    public static void javaIdentifiersExample (){
        JavaUtils.displayHeaderOfLesson(" Java Identifiers ");
        /*
        Quy tắc đặt biến trong Java : Biến phải bắt đầu từ A -> Z,kí tự $ hoặc là dấu _
                                      Sau khi tự đầu tiên thì cái gì cũng được
                                      Không được sử dụng keyword
                                      Biến phân biệt chữ hoa chữ thường
        * */

    }

    public static void javaModifierExample (){
        JavaUtils.displayHeaderOfLesson(" Java Modifier ");
        /*
        * Có 2 loại modifier :  Access modifier : default public protected private
        *                       Non-access Modifier : final, abstract, strictfp
        * */

    }

    public static void javaVariableExample (){
        JavaUtils.displayHeaderOfLesson(" Java Variable ");
        /*
        * Có 3 loại :   Local variable
        *               Class Variable - Static variable
        *               Instance Variable - Non-static variable
        * */
    }

    public static void javaArrayExample (){
        JavaUtils.displayHeaderOfLesson(" Java Array ");
        /*
         * Có 3 loại :   Local variable
         *               Class Variable - Static variable
         *               Instance Variable - Non-static variable
         * */
    }
}
