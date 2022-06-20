/**
 * First_task - Написать программу вычисления n-ого треугольного числа
 */
import java.util.Scanner;
public class First_task {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        boolean check = iScanner.hasNextInt();
        if (check == true) {
            int n = iScanner.nextInt();
            if (n < 0) {
                System.out.println("Введено некоректное (отрицательное) число");
            } else {
                int T = (n*(n+1))/2;
                System.out.print(T);
            }
        } else {
            System.out.println("Введено некоректное число или данные");
        }   
    }
}
