import java.util.Scanner;

public class ArrayClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Введите значение " + i + ": ");
            int num = scanner.nextInt();
            arr[i] = num;
        }
        System.out.println("Содержимое массива: " + arr);
    }
}

class MinArrClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner scaner = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Введите элементы массива:  ");
            int vol = scaner.nextInt();
            arr[i] = vol;
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Миннимальное значние массива равно " + min);
    }
}

// сортировка массива по возрастанию

class SortArrClass {
    public static void main(String[] args) {
        int[] arr = {100, 4234, 1324, 29, 2433, 8};
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println("Отсортированный массив по возрастанию:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

class MassSortZwei {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] ord = new int[arr.length];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Введите элемент массива: ");
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            int mas = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < mas) {
                    mas = arr[j];
                    arr[j] = arr[i];
                    arr[i] = mas;
                }
            }
            ord[i] = mas;
            System.out.print(ord[i] + " ");
        }
    }
}

class MassSortDrei {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] ord = new int[arr.length];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Введите элемент массива: ");
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            int mas = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < mas) {
                    mas = arr[j];
                    arr[j] = arr[i];
                    arr[i] = mas;
                }
            }
            ord[i] = mas;
            System.out.print(ord[i] + " ");
        }
    }
}
