package C2_L2;

import java.io.PrintStream;

public class MyArrayDataException extends NumberFormatException {

    @Override
    public void printStackTrace(PrintStream s) {
        super.printStackTrace(s);
        System.out.println("Проблема в " + s);
    }
}
