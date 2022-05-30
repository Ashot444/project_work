import java.util.Scanner;

    public class Program_login {
        public static void main(String[] args) {
            Scanner num = new Scanner(System.in);
            String pass, input;
            System.out.print("Создать пароль: ");
            pass = num.nextLine();
            System.out.print("Введите пароль: ");
            input = num.nextLine();
            while (!pass.equals(input)) {
                System.out.print("Введите пароль снова: ");
                input = num.nextLine();
            }
            System.out.print("Пароль принят!");
        }
    }
