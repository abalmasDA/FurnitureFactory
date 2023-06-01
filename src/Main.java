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
                FurnitureFactory furnitureArtDeco = new FurnitureFactoryArtDeco();
                furnitureArtDeco.createArmchair();
                furnitureArtDeco.createSofa();
                furnitureArtDeco.createTable();
                furnitureArtDeco.getTotalSumFurniture();
                break;
            case 2:
                FurnitureFactory furnitureVictorian = new FurnitureFactoryVictorian();
                furnitureVictorian.createArmchair();
                furnitureVictorian.createSofa();
                furnitureVictorian.createTable();
                furnitureVictorian.getTotalSumFurniture();
                break;
            case 3:
                FurnitureFactory furnitureModern = new FurnitureFactoryModern();
                furnitureModern.createArmchair();
                furnitureModern.createSofa();
                furnitureModern.createTable();
                furnitureModern.getTotalSumFurniture();
                break;
            default:
                System.out.println("Такий код відсутній, спробуйте ще раз.");
        }
        scannerInput.close();


    }
}
