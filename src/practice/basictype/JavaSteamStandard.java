package practice.basictype;

import java.io.*;

public class JavaSteamStandard {
    public static void main(String args[]) throws IOException {
        ReadConsoleExample();
    }

    public static void ReadConsoleExample() throws IOException {
        InputStreamReader cin = null;
        try {
            cin = new InputStreamReader(System.in);
            System.out.println("Enter characters, 'q' to quit.");
            char c;
            do {
                c = (char) cin.read();
                System.out.print(c);
            } while(c != 'q');
        }finally {
            if (cin != null) {
                cin.close();
            }
        }
    }
}
