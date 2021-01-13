import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        System.out.println("Введите два целых числа через пробел: ");
        int number1 = k.nextInt();
        int number2 = k.nextInt();
        System.out.println("Введите знак: ");
        Scanner scan = new Scanner(System.in);
        String zn = scan.nextLine();
        switch (zn) {
            case "+":
                System.out.println(number1 + number2);
                break;
            case "-":
                System.out.println(number1 - number2);
                break;
            case "*":
                System.out.println(umn(number1, number2));
                break;
            case "/":
                System.out.println(number1 / number2);
                break;
            case "fib":
                System.out.println(fibb(number1));
                break;
            default:
                System.out.println("Вы ввели неверный знак");
        }
    }

    public static int fibb(int n) {
        int f = 0;
        int s = 1;
        int it = 0;
        int sum;
        for (int i = 1; i <= n; i++) {
            it = f;
            sum = f + s;
            f = s;
            s = sum;
        }
        return it;
    }

    private static int umn(int number1, int number2) {
        return number1 * number2;
    }
}
