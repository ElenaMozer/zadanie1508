import java.util.Scanner;

public class zad41508 {
    public static void main(String[] args) {
        System.out.println("Введите часы/минуты/секунды");
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();
        if (h > 0 && h < 24 && m > 0 && m < 60 && s >0 && s < 60) {
            System.out.println("Данные корректны");
        } else { System.out.println("Данные не корректны");
    }
}
}