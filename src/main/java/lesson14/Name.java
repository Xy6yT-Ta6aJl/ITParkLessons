package lesson14;

import java.util.*;

public class Name {


    public static String getRandomName(){

        List<String> firstName = new ArrayList<>();
        firstName.add("Антон");
        firstName.add("Андрей");
        firstName.add("Алексей");
        firstName.add("Аарон");
        firstName.add("Августин");
        firstName.add("Авдей");
        firstName.add("Авраам");
        firstName.add("Агап");
        firstName.add("Адам");
        firstName.add("Азамат");
        firstName.add("Автоген");
        firstName.add("Арнольд");
        firstName.add("Осип");
        firstName.add("Диоген");
        firstName.add("Парамон");
        firstName.add("Автокран");
        firstName.add("Артемон");
        firstName.add("Аугусто");
        firstName.add("Колобок");
        firstName.add("Евстафий");
        firstName.add("Евлантий");
        firstName.add("Владислав");
        firstName.add("Виктор");
        firstName.add("Венеамин");
        firstName.add("Максим");
        firstName.add("Евгений");
        firstName.add("Семён");
        firstName.add("Валентин");
        firstName.add("Анальгин");
        firstName.add("Святозар");
        firstName.add("Борис");
        firstName.add("Мелман");
        firstName.add("Марти");
        firstName.add("Алекс");
        firstName.add("Стюарт");
        firstName.add("Джон");
        firstName.add("Василий");
        firstName.add("Патрокл");
        firstName.add("Леонид");
        firstName.add("Лев");
        firstName.add("Денис");
        firstName.add("Вольдемар");
        firstName.add("Станислав");
        firstName.add("Воландеморт");
        firstName.add("Гарри");
        firstName.add("Марк");
        firstName.add("Михаил");
        firstName.add("Артём");
        firstName.add("Дмитрий");
        firstName.add("Всеволод");
        firstName.add("Артур");
        firstName.add("Бенедикт");
        firstName.add("Гавриил");
        firstName.add("Гамлет");
        firstName.add("Гаспар");
        firstName.add("Хакон");
        firstName.add("Вамбо");
        firstName.add("Ларес");
        firstName.add("Диего");
        firstName.add("Гастон");
        firstName.add("Арамис");
        firstName.add("Атос");
        firstName.add("Партос");
        firstName.add("Генадий");
        firstName.add("Генрих");
        firstName.add("Ульрих");
        firstName.add("Герасим");
        firstName.add("Геральт");
        firstName.add("Георгий");
        firstName.add("Герман");
        firstName.add("Глеб");
        firstName.add("Гъярдар");
        firstName.add("Горыня");
        firstName.add("Весемир");
        firstName.add("Никита");
        firstName.add("Густав");
        firstName.add("Евграф");
        firstName.add("Елисей");
        firstName.add("Емельян");
        firstName.add("Зураб");
        firstName.add("Иван");
        firstName.add("Ибрагим");
        firstName.add("Игнат");
        firstName.add("Изя");
        firstName.add("Илья");
        firstName.add("Иннокентий");
        firstName.add("Иосиф");
        firstName.add("Арсений");
        firstName.add("Покемон");
        firstName.add("Иоганн");
        firstName.add("Себастьян");
        firstName.add("Иннос");
        firstName.add("Лаврентий");
        firstName.add("Карим");
        firstName.add("Карл");
        firstName.add("Кирилл");
        firstName.add("Клаус");
        firstName.add("Клим");
        firstName.add("Клод");
        firstName.add("Кузьма");

        String randomName = firstName.get(new Random().nextInt(firstName.size()));
        return randomName;

    }

    public static String getRandomSecondName() {

        List<String> secondName = new ArrayList<>();

        secondName.add("Иванов");
        secondName.add("Петров");
        secondName.add("Джонс");
        secondName.add("Сидоров");
        secondName.add("Кабанов");
        secondName.add("Пилюлькин");
        secondName.add("Караваев");
        secondName.add("Тапочкин");
        secondName.add("Серый");
        secondName.add("Корвалол");
        secondName.add("Подзёмкин");
        secondName.add("Беггинс");
        secondName.add("Сумкин");
        secondName.add("Кротов");
        secondName.add("Стильный");
        secondName.add("Подопригора");
        secondName.add("Малинов");
        secondName.add("Сердюков");
        secondName.add("Семёнов");
        secondName.add("Харламов");
        secondName.add("Ленин");
        secondName.add("Сталин");
        secondName.add("Баринов");
        secondName.add("Загогулина");
        secondName.add("Шубов");
        secondName.add("Гомербек");
        secondName.add("Симпсон");
        secondName.add("Градусник");
        secondName.add("Лагранж");
        secondName.add("Эйнштейн");
        secondName.add("Спилберг");
        secondName.add("Котов");
        secondName.add("Хаббл");
        secondName.add("Зозо");
        secondName.add("Вертолётов");
        secondName.add("Архипов");
        secondName.add("Демидов");
        secondName.add("Банькин");
        secondName.add("Кошкин");
        secondName.add("Месси");
        secondName.add("Карпин");
        secondName.add("Краковский");
        secondName.add("Мавроди");
        secondName.add("Печенька");
        secondName.add("Шапиров");
        secondName.add("Конев");
        secondName.add("Стрыжа");
        secondName.add("Князев");
        secondName.add("Попов");
        secondName.add("Широков");
        secondName.add("Сергеев");
        secondName.add("Зарубин");
        secondName.add("Подкатов");
        secondName.add("Парасолька");
        secondName.add("Гарбузов");
        secondName.add("Николаев");
        secondName.add("Шишкин");
        secondName.add("Максимов");
        secondName.add("Соболев");
        secondName.add("Жижа");
        secondName.add("Хвостов");
        secondName.add("Кузнецов");
        secondName.add("Соколов");
        secondName.add("Васильев");
        secondName.add("Зайцев");
        secondName.add("Виноградов");
        secondName.add("Крылов");
        secondName.add("Журавлёв");
        secondName.add("Бобров");
        secondName.add("Бобёр");
        secondName.add("Фролов");
        secondName.add("Воробьёв");
        secondName.add("Исаев");
        secondName.add("Орехов");
        secondName.add("Ткаченко");
        secondName.add("Панов");
        secondName.add("Лазарев");
        secondName.add("Захаров");
        secondName.add("Поваров");
        secondName.add("Злотников");
        secondName.add("Толкин");
        secondName.add("Салтыков");
        secondName.add("Пушкин");
        secondName.add("Лермонтов");
        secondName.add("Достоевский");
        secondName.add("Гоголь");
        secondName.add("Моголь");
        secondName.add("Есенин");
        secondName.add("Пирожков");
        secondName.add("Авдеев");
        secondName.add("Ионов");
        secondName.add("Барабанов");
        secondName.add("Блинов");
        secondName.add("Эвкалипт");
        secondName.add("Печкин");
        secondName.add("Матроскин");
        secondName.add("Шариков");
        secondName.add("Рогов");
        secondName.add("Буров");
        secondName.add("Усачёв");
        secondName.add("Карамазов");
        secondName.add("Бабкин");

        String randomSecondName = secondName.get(new Random().nextInt(secondName.size()));
        return randomSecondName;

    }

    public static String getRandomThirdName() {

        List<String> thirdName = new ArrayList<>();
        thirdName.add("Антонович");
        thirdName.add("Андреевич");
        thirdName.add("Алексеевич");
        thirdName.add("Ааронович");
        thirdName.add("Августинович");
        thirdName.add("Авдеевич");
        thirdName.add("Авраамович");
        thirdName.add("Агапович");
        thirdName.add("Адамович");
        thirdName.add("Азаматович");
        thirdName.add("Автогенович");
        thirdName.add("Арнольдович");
        thirdName.add("Осипович");
        thirdName.add("Диогенович");
        thirdName.add("Парамонович");
        thirdName.add("Автокранович");
        thirdName.add("Артемонович");
        thirdName.add("Аугустович");
        thirdName.add("Колобкович");
        thirdName.add("Евстафович");
        thirdName.add("Евлантиевич");
        thirdName.add("Владиславович");
        thirdName.add("Викторович");
        thirdName.add("Венеаминович");
        thirdName.add("Максимович");
        thirdName.add("Евгениевич");
        thirdName.add("Семёнович");
        thirdName.add("Валентинович");
        thirdName.add("Анальгинович");
        thirdName.add("Святозарович");
        thirdName.add("Борисович");
        thirdName.add("Мелманович");
        thirdName.add("Мартиевич");
        thirdName.add("Алексович");
        thirdName.add("Стюартович");
        thirdName.add("Джонович");
        thirdName.add("Василийович");
        thirdName.add("Патроклович");
        thirdName.add("Леонидович");
        thirdName.add("Львович");
        thirdName.add("Денисович");
        thirdName.add("Вольдемарович");
        thirdName.add("Станиславович");
        thirdName.add("Воландемортович");
        thirdName.add("Гарривич");
        thirdName.add("Маркович");
        thirdName.add("Михаилович");
        thirdName.add("Артёмович");
        thirdName.add("Дмитриевич");
        thirdName.add("Всеволодович");
        thirdName.add("Артурович");
        thirdName.add("Бенедиктович");
        thirdName.add("Гавриилович");
        thirdName.add("Гамлетович");
        thirdName.add("Гаспарович");
        thirdName.add("Хаконович");
        thirdName.add("Вамбович");
        thirdName.add("Ларесович");
        thirdName.add("Диегович");
        thirdName.add("Гастонович");
        thirdName.add("Арамисович");
        thirdName.add("Атосович");
        thirdName.add("Партосович");
        thirdName.add("Генадиевич");
        thirdName.add("Генрихович");
        thirdName.add("Ульрихович");
        thirdName.add("Герасимович");
        thirdName.add("Геральтович");
        thirdName.add("Георгиевич");
        thirdName.add("Германович");
        thirdName.add("Глебович");
        thirdName.add("Гъярдарович");
        thirdName.add("Горынович");
        thirdName.add("Весемирович");
        thirdName.add("Никитович");
        thirdName.add("Густавович");
        thirdName.add("Евграфович");
        thirdName.add("Елисеевич");
        thirdName.add("Емельянович");
        thirdName.add("Зурабович");
        thirdName.add("Иванович");
        thirdName.add("Ибрагимович");
        thirdName.add("Игнатович");
        thirdName.add("Изевич");
        thirdName.add("Ильич");
        thirdName.add("Иннокентиевич");
        thirdName.add("Иосифович");
        thirdName.add("Арсениевич");
        thirdName.add("Покемонович");
        thirdName.add("Иоганнович");
        thirdName.add("Себастьянович");
        thirdName.add("Инносович");
        thirdName.add("Лаврентиевич");
        thirdName.add("Каримович");
        thirdName.add("Карлович");
        thirdName.add("Кириллович");
        thirdName.add("Клаусович");
        thirdName.add("Климович");
        thirdName.add("Клодович");
        thirdName.add("Кузьмич");

        String randomThirdName = thirdName.get(new Random().nextInt(thirdName.size()));
        return randomThirdName;





    }
}