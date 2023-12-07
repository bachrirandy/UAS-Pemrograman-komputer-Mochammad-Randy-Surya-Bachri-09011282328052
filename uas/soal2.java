import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        // Nilai tetap untuk username dan password
        String usernameTetap = "RandyBachri";
        String passwordTetap = "09011282328052";

        // Membuat objek Scanner untuk meminta input dari pengguna
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan username: ");
        String usernameInput = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String passwordInput = scanner.nextLine();

        if (usernameInput.equals(usernameTetap) && passwordInput.equals(passwordTetap)) {
            System.out.println("Autentikasi Berhasil");
        } else {
            System.out.println("Autentikasi Gagal");
        }

        scanner.close();
    }
}


