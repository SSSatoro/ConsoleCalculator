import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(calc(getInt(), getInt(), getOperation()));
    }

    public static int getInt() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your value");
        int a = scan.nextInt();
        return a;
    }

    public static String getOperation() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your operation");
        String x = scan.nextLine();
        return x;
    }


    public static int calc(int num1, int num2, String operation) {
        int result = 0;
        switch (operation) {
            case ("+"):
                result = num1 + num2;
                return result;
            case ("-"):
                result = num1 - num2;
                return result;
            case ("*"):
                result = num1 * num2;
                return result;
            case ("/"):
                result = num1 / num2;
                return result;
        }
        return result;
    }
}
