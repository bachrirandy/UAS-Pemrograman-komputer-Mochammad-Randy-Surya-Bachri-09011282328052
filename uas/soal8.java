import java.util.Scanner;

public class soal8 {
    private String username;
    private String password;
    private boolean aktif;

    public soal8(String username, String password, boolean aktif) {
        this.username = username;
        this.password = password;
        this.aktif = aktif;
    }

    public void aktifkan() {
        aktif = true;
        System.out.println("Akun " + username + " telah diaktifkan");
    }

    public void nonaktifkan() {
        aktif = false;
        System.out.println("Akun " + username + " telah dinonaktifkan");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        soal8 akun = null; // Declare akun outside the loop
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Aktifkan Akun");
            System.out.println("2. Nonaktifkan Akun");
            System.out.println("3. Selesai");

            System.out.print("Pilih menu (1-3): ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan username: ");
                    String username = scanner.next();
                    System.out.print("Masukkan password: ");
                    String password = scanner.next();
                    System.out.print("Masukkan status aktif (1 untuk aktif, 0 untuk nonaktif): ");
                    int status = scanner.nextInt();
                    akun = new soal8(username, password, status == 1);
                    akun.aktifkan();
                    break;
                case 2:
                    akun.nonaktifkan();
                    break;
                case 3:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1-3.");
            }
        } while (pilihan != 3);
    }
}
