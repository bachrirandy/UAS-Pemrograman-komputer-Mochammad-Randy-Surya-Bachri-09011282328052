import java.util.Stack;
import java.util.Scanner;

public class soal9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan ekspresi matematika: ");
        String ekspresi = scanner.nextLine();

        // Memanggil metode untuk memeriksa urutan kurung
        if (cekUrutanKurung(ekspresi)) {
            System.out.println("Urutan kurung benar.");
        } else {
            System.out.println("Urutan kurung salah.");
        }

        scanner.close();
    }

    // Memeriksa urutan kurung
    public static boolean cekUrutanKurung(String ekspresi) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < ekspresi.length(); i++) {
            char karakter = ekspresi.charAt(i);

            if (isKurungBuka(karakter)) {
                stack.push(karakter);
            } else if (isKurungTutup(karakter)) {
                if (stack.isEmpty() || !pasanganKurung(stack.pop(), karakter)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    // Metode untuk mengecek apakah karakter adalah kurung buka
    private static boolean isKurungBuka(char karakter) {
        return karakter == '(' || karakter == '{' || karakter == '[';
    }

    // Metode untuk mengecek apakah karakter adalah kurung tutup
    private static boolean isKurungTutup(char karakter) {
        return karakter == ')' || karakter == '}' || karakter == ']';
    }

    // Metode untuk memeriksa pasangan kurung
    private static boolean pasanganKurung(char buka, char tutup) {
        return (buka == '(' && tutup == ')') ||
               (buka == '{' && tutup == '}') ||
               (buka == '[' && tutup == ']');
    }
}
