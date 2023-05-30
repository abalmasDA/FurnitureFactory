import java.util.Scanner;

/**
 * Створити програму яка буде описувати виробництво меблів на фабриці.
 * У нас будуть три варіанта меблів - Ар-деко, Вікторіанській і Модерн.
 * Фабрика вміє виробляти - Крісло, Диван, Столик.
 * Крісло, Диван, Столик - мають мати ціну - X.X, назву - "XXX".
 * Стпроектувати програму таким чином, щоб користувач міг вибрати який варіант меблів він хоче отримати і фабрика це зробила.
 * Після вибору він отримав докладний звіт.
 * Також передбачити умову - якщо у нас зʼявляється новий виріб - наприклад Поличка то фабрика яка виробляє меблі після адаптації могла працювати далі
 * і не зломати весь наш процес.
 * Наприклад
 * ------------------
 * Який варіант набору Ви хотіли б придбати ?
 * 1 -> Ар-деко
 * 2 -> Вікторіанській
 * 3 -> Модерн
 * ------------------
 * Ви обрали варіант: 2
 * Детальний опис:
 * Крісло - "Тиха гавань", 2340 грн.
 * Диван - "Мудрість віків", 7340.57 грн.
 * Столик - "Місце роздумів", 4340 грн.
 * Загаьна сумма: 14020.57 грн.
 * ----------------
 * Який варіант набору Ви хотіли б придбати ?
 * 1 -> Ар-деко
 * 2 -> Вікторіанській
 * 3 -> Модерн
 * -----------------
 * Ви обрали варіант: 3
 * Детальний опис:
 * Крісло - "Стар шіп", 1340 грн.
 * Диван - "Гіпер портал", 5340.17 грн.
 * Столик - "Пульт керування", 4340 грн.
 * Загаьна сумма: 11020.17 грн.
 */


public class Main {
    static Scanner scannerInput = new Scanner(System.in);
    private static final String TOTAL_SUM_ITEM = "Загальна сума: ";
    private static final String CURRENCY = " грн.";

    public static void main(String[] args) {
        System.out.println("Фабрика виготовляє меблі наступних стилів:" + "\n"
                + "1 -> Ар-деко" + "\n"
                + "2 -> Вікторіанській" + "\n"
                + "3 -> Модерн" + "\n");
        System.out.println("Який варінт набору ви хотіли придбати? (виберіть один з варінтів та введіть його код)");
        int userChoice = scannerInput.nextInt();
        System.out.println("Ви обрали варіант: " + userChoice);
        switch (userChoice) {
            case 1:
                Furniture armchair1 = new Armchair("\"Шумна крапка\"", 7451);
                System.out.println(armchair1.getInfoItem());
                Furniture sofa1 = new Sofa("\"Глибина озера\"", 5475.61);
                System.out.println(sofa1.getInfoItem());
                Furniture table1 = new Table("\"Частинка щастя\"", 9610);
                System.out.println(table1.getInfoItem());
                System.out.println(TOTAL_SUM_ITEM + (armchair1.getPrice() + sofa1.getPrice() + table1.getPrice()) + CURRENCY);
                break;
            case 2:
                Furniture armchair2 = new Armchair("\"Тиха гавань\"", 2340);
                System.out.println(armchair2.getInfoItem());
                Furniture sofa2 = new Sofa("\"Мудрість віків\"", 7340.57);
                System.out.println(sofa2.getInfoItem());
                Furniture table2 = new Table("\"Місце роздумів\"", 4340);
                System.out.println(table2.getInfoItem());
                System.out.println(TOTAL_SUM_ITEM + (armchair2.getPrice() + sofa2.getPrice() + table2.getPrice()) + CURRENCY);
                break;
            case 3:
                Furniture armchair3 = new Armchair("\"Стар шіп\"", 1340);
                System.out.println(armchair3.getInfoItem());
                Furniture sofa3 = new Sofa("\"Гіпер портал\"", 5340.17);
                System.out.println(sofa3.getInfoItem());
                Furniture table3 = new Table("\"Пульт керування\"", 4340);
                System.out.println(table3.getInfoItem());
                System.out.println(TOTAL_SUM_ITEM + (armchair3.getPrice() + sofa3.getPrice() + table3.getPrice()) + CURRENCY);
                break;
            default:
                System.out.println("Такий код відсутній, спробуйте ще раз.");
        }
        scannerInput.close();

    }
}
