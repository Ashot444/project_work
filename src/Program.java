import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int i, k;
        System.out.print("Введите Значение-1 =");
        i = num.nextInt();
        System.out.print("Введите Значение-2 =");
        k = num.nextInt();
        System.out.println("Значение-1 = " + i);
        System.out.println("Значение-2 = " + k);

        if (i > k) {
            System.out.println("Значение " + i + " > чем " + k);
        } else {
            System.out.println("Значение " + k + " > чем " + i);
        }
    }
}
