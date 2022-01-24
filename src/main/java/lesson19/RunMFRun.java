package lesson19;

import java.lang.reflect.Field;

public class RunMFRun {

    public static void main(String[] args) {

        Class<IndividualAccount> indAcc = IndividualAccount.class;
            Field[] fields = indAcc.getDeclaredFields();


    }
}
