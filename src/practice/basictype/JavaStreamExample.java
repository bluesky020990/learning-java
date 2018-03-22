package practice.basictype;

import java.io.*;

public class JavaStreamExample {
    public static void main(String args[]){
        readingAndWritingFileWithByteStream();
        readingAndWritingFileWithCharacterStream();
    }


    public static void readingAndWritingFileWithByteStream() {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("D:/input.txt");
            out = new FileOutputStream("D:/output.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }

            if (in != null) {
                in.close();
            }

            if (out != null) {
                out.close();
            }
        } catch (IOException ioE) {
            System.out.println(ioE.getMessage());
        } finally {

        }
    }

    public static void readingAndWritingFileWithCharacterStream() {
        FileReader in = null;
        FileWriter out = null;

        try{
            in = new FileReader("D:/input.txt");
            out = new FileWriter("D:/output_charactor.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }

            if (in != null) {
                in.close();
            }

            if (out != null) {
                out.close();
            }

        } catch (IOException ioe){

        }
    }
}
