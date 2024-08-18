import java.util.Scanner;

public class zad51508 {
    public static void main(String[] args) {
        System.out.println("Введите координаты");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (x >= 0 && y >= 0) {
            System.out.println("Точка во второй четверти");
        }
            if (x >= 0 && y <= 0) {
                System.out.println("Точка в первой четверти");

            }
        if (x <= 0 && y <= 0) {
            System.out.println("Точка в третьей четверти");

        }
        if (x <= 0 && y >= 0) {
            System.out.println("Точка в четвертой четверти");
    }
}
}
