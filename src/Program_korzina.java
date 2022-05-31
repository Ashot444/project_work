import java.util.Scanner;

public class Program_korzina {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        String[] arr = new String[100];
        for(int i = 0; i < 100; i++){
            System.out.print("Введите название товара, для завершения оставьте пустую строку: ");
            arr[i] = num.nextLine();
            if (arr[i] == ""){
                break;
            }
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != null && arr[i] != "") {
                System.out.println((i + 1) + "-й товар = " + arr[i]);
            }
        }
    }
}
