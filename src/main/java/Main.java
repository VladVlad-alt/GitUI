import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int y = in.nextInt();

        String operation = in.next();

        if (operation.equals("+")) {
            sum(x, y);
        } else {
            System.out.println("Это я пока не умею");
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
        System.out.println(a / b);
    }

}
