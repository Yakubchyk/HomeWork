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
