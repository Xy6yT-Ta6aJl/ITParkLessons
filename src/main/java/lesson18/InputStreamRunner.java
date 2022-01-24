package lesson18;

import lombok.SneakyThrows;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputStreamRunner {

    @SneakyThrows
    public static void main(String[] args) {

        String[] paths = new String[]{"C:/Users/проСВЕТ/IdeaProjects/ITParkLessons/src/main/resources/line1.txt",
                "C:/Users/проСВЕТ/IdeaProjects/ITParkLessons/src/main/resources/line2.txt",
                "C:/Users/проСВЕТ/IdeaProjects/ITParkLessons/src/main/resources/line3.txt",
                "C:/Users/проСВЕТ/IdeaProjects/ITParkLessons/src/main/resources/line4.txt"};


        File file = new File("C:/Users/проСВЕТ/IdeaProjects/ITParkLessons/src/main/resources/урок18.txt");
        try (Scanner scanner = new Scanner(file)) {
            List<String> arrayList = new ArrayList<>();
            while (scanner.hasNextLine()) {
                arrayList.add(scanner.nextLine());
            }

            String s1 = arrayList.get(0);
            String s2 = arrayList.get(1);
            String s3 = arrayList.get(2);
            String s4 = arrayList.get(3);

            File file1 = new File(paths[0]);
            try (FileWriter fw = new FileWriter(file1)) {
                fw.write(s1);
            }

            File file2 = new File(paths[1]);
            try (FileWriter fw = new FileWriter(file2)) {
                fw.write(s2);
            }

            File file3 = new File(paths[2]);
            try (FileWriter fw = new FileWriter(file3)) {
                fw.write(s3);
            }

            File file4 = new File(paths[3]);
            try (FileWriter fw = new FileWriter(file4)) {
                fw.write(s4);
            }
        }
    }
}
