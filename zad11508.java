import java.util.Scanner;

public class zad11508 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int action = scanner.nextInt();
        if (action == 0) {
            System.out.println("Число равно 0");
        }
if (action > 0) {
    System.out.println("Число положительное");
    } else { System.out.println("Число отрицательное");

}

    }
}




