import java.util.Scanner;

public class ProstoeChisloProverka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для проверки: ");
        int num = scanner.nextInt();
        System.out.println("Программа определяет на предмет простых чисел.");
        boolean b = true;
        if (num <= 1) {
            b = false;
        } else {
            for (int i = 2; i <= 9; i++) {
                if (num % i == 0 && num / i != 1) {
                    b = false;
                    break;
                }
            }
        }
        if (b == false) {
            System.out.println("Число " + num + " является сложным.");
        }
        if (b == true) {
            System.out.println("Число " + num + " является простым.");
        }


    }
}


/*
Serhey Pavirayeu, [25.03.24 17:06]
public static boolean isSimple(Integer number) {
        if(number < 2) return false;
        for(int i = 2; i < number / 2; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
 */
