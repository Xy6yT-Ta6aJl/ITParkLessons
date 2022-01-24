package test;

import java.io.File;

public class FileRunner {
    public static void main(String[] args) {
        String fileLocation = "D:/test.txt";
        File file = new File(fileLocation);
        file.exists(); // проверка существования файла
        System.out.println(file.getName());
    }
}
