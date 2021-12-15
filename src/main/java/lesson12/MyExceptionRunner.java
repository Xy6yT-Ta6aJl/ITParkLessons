package lesson12;

public class MyExceptionRunner {

    public static void main(String[] args) {

        String[][] array = {{"2", "16", "3", "12"}, {"2", "4", "3", "12"},
                {"2", "1", "3", "12"}, {"2", "16", "4", "2"}};
      /*
          String[][] array1 = {{"2", "16", "Ку-ку", "12"}, {"2", "4", "3", "12"},
                 {"2", "1", "3", "12"}, {"2", "16", "4", "2"}};
        */
        String[][] array2 = {{"2", "16", "3", "12"}, {"2", "4", "3", "12", "8"},
                {"2", "1", "3", "12"}, {"2", "16", "4", "2"}};

        stringToInt(array);
        // stringToInt(array1);
        stringToInt(array2);
    }

    public static void stringToInt(String[][] stringArray) throws MyArraySizeException, MyArrayDataException {
        int[][] intArray = new int[4][4];
        int sum = 0;
        if (stringArray.length > 4 || stringArray[0].length > 4 ||
                stringArray[1].length > 4 || stringArray[2].length > 4 || stringArray[3].length > 4) {
            throw new MyArraySizeException("Неверный размер массива.");
        }
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray.length; j++) {
                char[] charArray = stringArray[i][j].toCharArray();
                for (char c : charArray) {
                    if (c >= '0' && c <= '9') {
                        intArray[i][j] = Integer.parseInt(stringArray[i][j]);
                        sum += intArray[i][j];
                    } else {
                        throw new MyArrayDataException(i, j);
                    }
                }
            }
        }
        System.out.println("Сумма всех элементов массива равна " + sum);
    }
}