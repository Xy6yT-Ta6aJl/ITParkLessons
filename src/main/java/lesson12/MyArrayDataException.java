package lesson12;

public class MyArrayDataException  extends RuntimeException{

    public MyArrayDataException() {
    }

    public MyArrayDataException(int i, int j) {
        super ("В ячейке массива (" + i + ", " + j + ") лежит что-то не то.");;
    }
}
