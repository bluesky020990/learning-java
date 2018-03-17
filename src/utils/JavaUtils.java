package utils;

public class JavaUtils {

    public static void displayHeaderOfLesson(String lesson){
        String separateLine =  "--------------------------------------------------------------------------------------------------------";
        int beginIndex = (separateLine.length() - lesson.length())/2;
        System.out.println(separateLine.substring(0 , beginIndex) + lesson +  separateLine.substring(beginIndex + lesson.length()));
    }
}
