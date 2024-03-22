public class Fibonacy {
    public static void main(String[] args) {
        int fi1 = 1;
        int fi2 = 1;
        int n;

        for (int i = 3; i <= 11; i++) { // подглядел. Я непонял почему тут надо с 3 начинать.
            n = fi1 + fi2;
            System.out.print(n + " ");
            fi1 = fi2;
            fi2 = n;
        }

    }
}
