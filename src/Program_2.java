import java.util.Scanner;

public class Program_2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int min, max;
        System.out.print("Введите значение min = ");
        min = num.nextInt();
        System.out.print("Введите значение max = ");
        max = num.nextInt();
        System.out.print("Простые числа: ");
        for (int i = min; i < max; i++) {
            if (checkSimple(i))
                System.out.print(i + " ");
        }
    }
        public static boolean checkSimple(int i){
            if (i <= 1)
                return false;
            else if (i <= 3)
                return true;
            else if (i % 2 == 0 || i % 3 == 0)
                return false;
            int n = 5;
            while (n * n <= i){
                if (i % n == 0 || i % (n + 2) == 0)
                    return false;
                n = n + 6;
            }
            return true;
        }
    }
