import java.util.Scanner;


/*
Задача 1:
Написать приложение, которое будет вычислять и выводить значение по формуле:
a=4*(b+c-1)/2; b и c задаем в коде самостоятельно.
 */
public class Main {
    public static void main(String[] args) {

        int a, b, c;
        b = 2;
        c = 4;

        a = 4 * (b + c - 1) / 2;
        System.out.println(a);

    }
}

/*
Задача 2:
В переменной "n" хранится двузначное число. Создайте программу, вычисляющую и
выводящую на экран сумму цифр n. Например: n =26, в результате мы должны получить 8
*/
class HomeWork_2 {
    public static void main(String[] args) {

        int n = 56;
        int l = n / 10;
        int p = n % 10;
        int res = l + p;
        System.out.println(n);
        System.out.println(l);
        System.out.println(p);
        System.out.println(res);

    }
}


/*
Задача 3:
В переменной n хранится трёхзначное число. Создайте программу, вычисляющую и
выводящую на экран сумму цифр n. Например: n =126, в результате мы должны получить
9 (1+2+6).
 */
class HomeWork_3 {
    public static void main(String[] args) {
        int n = 547;
        int l = n / 100;
        System.out.println(l);
        int ln = n / 10;
        int ll = ln % 10;
        System.out.println(ll);
        int r = n % 100;
        int rn = r % 10;
        System.out.println(rn);
        int res = l + ll + rn;
        System.out.println(res);

    }
}

/*
Задача 4:
В переменной n хранится вещественное число с ненулевой дробной частью. Создайте
программу, округляющую число n до ближайшего целого и выводящую результат на
экран.
 */
class HomeWork_4 {
    public static void main(String[] args) {
        double n = 5.4;
        int res = (int) Math.round(n);
        System.out.println("Рузультат округления числа 5,4: " + res);

    }
}

/*
Задача 5:
В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую
на экран результат деления q на w с остатком. Пример вывода программы (для случая,
когда в q хранится 21, а в w хранится 8): 21 / 8 = 2 и 5 в остатке.
 */
class HomeWork_5 {
    public static void main(String[] args) {
        int q = 26;
        int w = 4;
        int res;
        res = q % w;
        System.out.println("Остаток от деления " + q + " на " + w + " равен " + res);

    }
}

/*
Задача *:
Написать программу которая будет менять местами значение целочисленных
переменных. Пример:
int a = 1; int b = 2;
//код (ваше решение)
sout(a); //выведет 2
sout(b); //выведет 1
 */
class HomeWork_6 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println(" ");

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}

// А сейчас домашка второго дня:
/////////////////////////////////
/*
Задача 1:
Напишите программу, которая будет принимать на вход число из консоли и на выход
будет выводить сообщение четное число или нет. Для определения четности числа
используйте операцию получения остатка от деления (операция выглядит так: '% 2').
 */
class HomeWork01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введитн число:  ");
        int a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println(" Четное ");
        } else {
            System.out.println(" Нечетное ");
        }
    }
}

/*
Задача 2:
Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести «Warm».
Если –5>= t > –20, то вывести «Normal». Если –20>= t, то вывести «Cold».
 */
class TempClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Введите температуру: ");

//        switch (scanner.nextInt()){
//            case -1, -2, -3, -4, -5 -> System.out.println("Warm");
//            case -6, -7, -8, -9, -10, -11, -12, -13, -14, -15, -16, - -> System.out.println("Norm");
//
//        }
        int a = scanner.nextInt();
        if (a >= -5) {
            System.out.println("Warm");
        }
        if (a < -5 || a > -20) {
            System.out.println("Norm");
        }
        if (a < -20) {
            System.out.println("Kalt");
        }
    }
}

/*
Задача 3:
Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.
 */
class SquareClass {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        for (int i = 10; i <= 20; i++) {
            int res = i * i;
            System.out.println("Квадратный корень числа " + i + " равно " + res);
        }
    }
}

/*
Задача 4:
Необходимо, чтоб программа выводила на экран вот такую последовательность:
7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while.
 */
class TablizaClass {
    public static void main(String[] args) {
        int i = 7;

        while (i <= 100) {
            System.out.print(i + " ");
            i = i + 7;

//        for (int i = 7; i <= 100; i = i + 7){
//            System.out.println(i);
        }
    }
}

/*
Напишите программу, где пользователь вводит любое целое положительное число. А
программа суммирует все числа от 1 до введенного пользователем числа. Для ввода
числа воспользуйтесь классом Scanner. Сделать проверку, чтобы пользователь не мог
ввести некорректные данные.
 */
class SummClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое положительное число:  ");
        int UserNumber = 0;
        int sum = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                UserNumber = scanner.nextInt();

                break;
            } else {
                System.out.print("Неверно введено число. Попробуйте еще раз: ");
                scanner.next();
            }
        }
        for (int i = 1; i <= UserNumber; i++) {
            sum = sum + i;
            System.out.println(sum);
        }

    }
}