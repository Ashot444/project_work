import java.util.Scanner;
    public class Program_korzina {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int kol;
        kol = 0;
        String[] arr = new String[100];
        for(int i = 0; i < 100; i++){
            System.out.print("Введите название товара: ");
            arr[i] = num.nextLine();
            kol+=1;
            System.out.println("Желаете добавить еще товар? Y / N");
            String sogl = num.nextLine();
            if (sogl.equals("N")){
                break;
            }
        }

        for(int i = 0; i < kol; i++){
            System.out.println((i+1) + "-й товар = " +  arr[i]);
        }
    }
}
