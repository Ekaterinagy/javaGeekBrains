package sem1;
import java.util.Scanner;

//Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
public class task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = iScanner.nextInt();
        int sum = 0;
        int multiple = 1;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
            multiple = multiple * i;
        }
        System.out.printf("Треугольного число: %d - %d%n ", n, sum);
        System.out.printf("n!: %d - %d%n ", n, multiple);
        iScanner.close();
    }
}
