public class soal1 {
    public static void main(String[] args) {
        int jumlahPembelian = 1; 
        double hargaPerBarang = 50.0; 

        // Hitung total harga sebelum diskon
        double totalHarga = jumlahPembelian * hargaPerBarang;

        // Hitung diskon berdasarkan jumlah pembelian
        double diskon = 0.0;
        if (jumlahPembelian >= 5 && jumlahPembelian <= 10) {
            diskon = 0.05; // 5%
        } else if (jumlahPembelian >= 11 && jumlahPembelian <= 20) {
            diskon = 0.1; // 10%
        } else if (jumlahPembelian > 20) {
            diskon = 0.2; // 20%
        }

        // Hitung total harga setelah diskon
        double totalHargaSetelahDiskon = totalHarga - (totalHarga * diskon);

        System.out.println("Total harga setelah diskon: " + totalHargaSetelahDiskon);
    }
}

