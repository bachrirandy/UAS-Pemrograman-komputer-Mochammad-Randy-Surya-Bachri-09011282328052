public class soal7 {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean dipinjam;

    public soal7(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.dipinjam = false; 
    }

    public void tampilkanInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Status: " + (dipinjam ? "Sedang Dipinjam" : "Tersedia"));
        System.out.println();  
    }

    public void pinjam() {
        if (!dipinjam) {
            System.out.println("Buku " + judul + " sedang dipinjam");
            dipinjam = true;
        } else {
            System.out.println("Buku " + judul + " sudah dipinjam sebelumnya");
        }
    }
}
