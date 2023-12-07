import java.util.Scanner;

public class soal6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kata/frasa: ");
        String input = scanner.nextLine();
        if (isPalindrom(input)) {
            System.out.println("Kata/frasa tersebut palindrom.");
        } else {
            System.out.println("Kata/frasa tersebut bukan palindrom.");
        }
    }

    public static boolean isPalindrom(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }
}
