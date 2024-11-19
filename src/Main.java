import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String topTen;
        final int NUM = 3;
        String word = "dog";
        topTen = NUM + word;
        System.out.println(topTen);
        System.out.println(NUM);
        System.out.println(word);


        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }
        System.out.println("Введите ваше имя");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("привет" + name);


    }
}