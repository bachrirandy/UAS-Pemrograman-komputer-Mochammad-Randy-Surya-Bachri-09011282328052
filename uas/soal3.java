import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();
        int a = 0, b = 1, c;
        System.out.print("Deret Fibonacci hingga suku ke-" + n + ": ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
