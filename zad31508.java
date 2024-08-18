import java.util.Scanner;

public class zad31508 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        if (X > 0) {
            System.out.println(X);
        }
            if (X < 0) {
                System.out.println(-X);
    }
    }
}