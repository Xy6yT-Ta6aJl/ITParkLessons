package lesson14;

import java.util.*;
import java.util.stream.Stream;

public class PhoneBookRunner {

    public static void main(String[] args) {

        List<Item> phoneBook = new ArrayList<Item>();
        for (int i =0; i < 1000; i++){
            Item item = new Item();
            item.setNumber("" + new Random().nextInt(1000));
            item.setFirstName(Name.getRandomName());
            item.setSecondName(Name.getRandomSecondName());
            item.setThirdName(Name.getRandomThirdName());
            phoneBook.add(item);
        }

        for (int i = 0; i < 1000; i++) {
            Item item = phoneBook.get(i);
          //  System.out.println(item.getNumber());
            for (int j = 0; j < new Random().nextInt(10); j++) {
                item.addNumberToListOfNumbers(phoneBook.get(new Random().nextInt(1000)).getNumber());
            }

        }

        for (int i =0; i < 1000; i++){
            System.out.println(phoneBook.get(i));
        }


        Map<String, Integer> popularity = new HashMap<>();
        for (int i = 0; i < 1000; i++) {
            Item item = phoneBook.get(i);
            List<String> numbersList = item.getListOfNumbers();
            for (int j = 0; j < numbersList.size(); j++) {
                String number = numbersList.get(j);
                if(popularity.containsKey(number)){
                    int amount = popularity.get(number);
                    amount++;
                    popularity.put(number, amount);
                }else {
                    popularity.put(number, 1);
                }

            }

        }
        Stream<Map.Entry<String, Integer>> sorted =
                popularity.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue());
        sorted.forEach(System.out::println);

    }
}
