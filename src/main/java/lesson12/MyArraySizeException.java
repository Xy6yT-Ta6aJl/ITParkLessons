package lesson12;

public class MyArraySizeException  extends RuntimeException{

    public MyArraySizeException() {
    }

    public MyArraySizeException(String message) {
       super(message);
    }
}
