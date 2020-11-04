package C2_L2;

public class MyArraySizeException extends IndexOutOfBoundsException {

    @Override
    public void printStackTrace() {
        System.out.println("Выход за пределы массива");
    }
}
