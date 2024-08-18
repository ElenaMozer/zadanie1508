import java.util.Scanner;

public class zad21508 {
    public static void main(String[] args) {
        System.out.println("Введите ваш возраст");
        Scanner scanner = new Scanner(System.in);
        int V = scanner.nextInt();
        if (V > 0 && V < 120) {
            System.out.println("Возраст корректен");
        } else { System.out.println("Возраст не корректен");

        }

    }
}