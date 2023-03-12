import java.util.Scanner; //Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).
public class dz3 {

    public static boolean palindrom(String text){
        StringBuffer Text = new StringBuffer(text).reverse();
        boolean result = true;
        for (int i=0; i<Text.length(); i++){
            if (Text.charAt(i) != text.charAt(i)){
                result = false;
            }
        } return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число для проверки на палиндром: ");
        String text =sc.nextLine();
        System.out.println(palindrom(text));
        sc.close();
    }

}