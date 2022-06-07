import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final Scanner SCAN = new Scanner(System.in);
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        List<Integer> list = new ArrayList<>();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести все данные для списка\n" +
                "Введите размер списка:");
        int size = SCAN.nextInt();
        logger.log("Введите вверхнюю границу значений:");
        int value = SCAN.nextInt();
        for (int i = 0; i < size; i++) {
            list.add(RANDOM.nextInt(value));
        }
        logger.log("Создаем и наполняем список\n" +
                "Вот случайный список: " + list);
        logger.log("Просим пользователя ввести входные данные для фильтрации\n" +
                "Введите порог для фильтра:");
        int treshoId = SCAN.nextInt();
        Filter filter = new Filter(treshoId);
        List<Integer> result = filter.filterOut(list);
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + result);
    }
}
