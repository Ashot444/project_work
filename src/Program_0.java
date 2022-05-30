public class Program_0 {
    public static void main(String[] args) {
        char sim = 'a';
        String stroka = "Hello word";
        int [] arr = new int [] {5, 66, 325};
        System.out.println("Мин byte = " + Byte.MIN_VALUE + " " + "Макс byte = " + Byte.MAX_VALUE);
        System.out.println("Мин int = " + Integer.MIN_VALUE + " " + "Макс int = " + Integer.MAX_VALUE);
        System.out.println("Мин long = " + Long.MIN_VALUE + " " + "Макс Long = " + Long.MAX_VALUE);
        System.out.println("Мин float = " + Float.MIN_VALUE + " " + "Макс float = " + Float.MAX_VALUE);
        System.out.println("Мин double = " + Double.MIN_VALUE + " " + "Макс double = " + Double.MAX_VALUE);
        System.out.println("Мин short = " + Short.MIN_VALUE + " " + "Макс short = " + Short.MAX_VALUE);
        System.out.println("Одно значение boolean = " + Boolean.FALSE + " " + "Второе значение boolean = " + Boolean.TRUE);
        System.out.println("Значение char = " + sim );
        System.out.println("Значение string = " + stroka );
        System.out.print("Значения array = ");
        for (int i = 0; i < arr.length; i++){
            System.out.print( arr[i] + " " );
        }
    }
}
