import java.util.Scanner;

public class SummAll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для вычисления факториала: ");
        int n = scanner.nextInt();
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        System.out.println("Факториал числа " + n + " равен " + f);
    }
}

class SClass {
    public static void main(String[] args) {
        System.out.println("Программа выводит сумму всех чисел до введенного пользователем.");
        System.out.println(" ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int userZahlen = scanner.nextInt();
        int res = 0;
        for (int i = 0; i <= userZahlen; i++) {
            res = res + i;

        }
        System.out.println("Сумма всех чисел до " + userZahlen + " равно " + res);
    }
}

class ArrSummClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число:  ");
        int sum = 0;
        int kol = scanner.nextInt();
        int[] arr = new int[kol];
        System.out.print("Программа ссумирует все числа до введенного вами. \n\n");

        for (int i = 0; i <= arr.length; i++) {
            sum += i;
        }
        System.out.println("Сумма всех чисел сосавляет: " + sum);
    }
}
