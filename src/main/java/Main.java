import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int y = in.nextInt();

        String operation = in.next();

        if (operation.equals("+")) {
            sum(x, y);
        } else if (operation.equals("-")) {
            sub(x, y);
        } else if (operation.equals("*")) {
            milt(x, y);
        } else if (operation.equals("/")) {
            div(x, y);
        }


    }

    public static void sum(int a, int b) {
        System.out.println(a + b);
    }

    public static void sub(int a, int b) {
        System.out.println(a - b);
    }

    public static void milt(int a, int b) {
        System.out.println(a * b);
    }

    public static void div(int a, int b) {
        if (a == 0 || b == 0) {
            System.out.println("Ошибка деления");
        } else {
            System.out.println(a / b);
        }
    }

}
