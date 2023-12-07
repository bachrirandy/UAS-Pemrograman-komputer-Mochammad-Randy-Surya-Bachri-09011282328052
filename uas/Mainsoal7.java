public class Mainsoal7 {
    public static void main(String[] args) {
        // Create books
        soal7 buku1 = new soal7("Funiculi Funicula", "Toshigaku Kawaguchi", 2015);
        soal7 buku2 = new soal7("A Brief History of Time", "Stephen Hawking", 1988);
        soal7 buku3 = new soal7("Keajaiban Toko Kelontong Namiya", "Keigo Higashino", 2012);
        soal7 buku4 = new soal7("The Midnight Library", "Matt Haig", 2020);
        soal7 buku5 = new soal7("Matahari", "Tere Liye", 2016);
        soal7 buku6 = new soal7("SagaraS", "Tere Liye", 2022);
        soal7 buku7 = new soal7("Laut Bercerita", "Salikha Chudori", 2017);

        // Display information of each book
        buku1.tampilkanInfo();
        buku2.tampilkanInfo();
        buku3.tampilkanInfo();
        buku4.tampilkanInfo();
        buku5.tampilkanInfo();
        buku6.tampilkanInfo();
        buku7.tampilkanInfo();

        System.out.println("-------------------------------------------------------------");

        // Borrow a book
        buku1.pinjam();
        buku4.pinjam();
        buku7.pinjam();
        System.out.println();

        // Display updated information after borrowing
        buku1.tampilkanInfo();
        buku4.tampilkanInfo();
        buku7.tampilkanInfo();
    }
}
