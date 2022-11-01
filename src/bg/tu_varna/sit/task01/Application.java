package bg.tu_varna.sit.task01;

/**
 * Анализирайте задачата и определите грешката (без да пренаписвате целия код),
 *  така че да се изведе броят на срещнатите символи 'а'
 *
 * Вход през аргументите от команден ред
 * a 8 d p 0 o h a 3 o а u f a о
 *
 * Очакван резултат:
 * 4
 */

public class Application {

    public static void main(String[] args) {

        int countA = 0;
        for (int i = 0; i < args.length; i++) {
            if ("a".equals(args[i])) {  // FIX: Беше използвано "а" на кирилица за проверка
                countA++;
            }
        }
        System.out.println("The symbol a has " + countA + " repetitions in the array");
    }
}
