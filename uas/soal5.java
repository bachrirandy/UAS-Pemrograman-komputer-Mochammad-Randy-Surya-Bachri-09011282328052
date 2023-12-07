import java.util.Scanner;

public class soal5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan pertama: ");
        double bil1 = scanner.nextDouble();
        System.out.print("Masukkan bilangan kedua: ");
        double bil2 = scanner.nextDouble();
        System.out.println("Pilih operasi yang diinginkan:");
        System.out.println("Hasil penjumlahan: " + penjumlahan(bil1, bil2));
        System.out.println("Hasil pengurangan: " + pengurangan(bil1, bil2));
        System.out.println("Hasil perkalian: " + perkalian(bil1, bil2));
        System.out.println("Hasil pembagian: " + pembagian(bil1, bil2));
        
        }

    public static double penjumlahan(double bil1, double bil2) {
        return bil1 + bil2;
    }

    public static double pengurangan(double bil1, double bil2) {
        return bil1 - bil2;
    }

    public static double perkalian(double bil1, double bil2) {
        return bil1 * bil2;
    }

    public static double pembagian(double bil1, double bil2) {
        return bil1 / bil2;
    }
}
