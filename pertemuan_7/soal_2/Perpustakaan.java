import java.util.ArrayList;

class Buku {
    String judul;
    String penulis;

    Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    void tampil(int no) {
        System.out.println("  " + no + ". " + judul + " - " + penulis);
    }
}

public class Perpustakaan {
    public static void main(String[] args) {

        ArrayList<Buku> daftarBuku = new ArrayList<>();
        daftarBuku.add(new Buku("Laskar Pelangi", "Andrea Hirata"));
        daftarBuku.add(new Buku("Bumi", "Tere Liye"));
        daftarBuku.add(new Buku("Dilan 1990", "Pidi Baiq"));

        System.out.println("Daftar Buku");
        for (int i = 0; i < daftarBuku.size(); i++)
            daftarBuku.get(i).tampil(i + 1);

        String judulDihapus = daftarBuku.get(0).judul;
        daftarBuku.remove(0);
        System.out.println("\n\"" + judulDihapus + "\" berhasil dihapus");

        System.out.println("\nDaftar Buku");
        for (int i = 0; i < daftarBuku.size(); i++)
            daftarBuku.get(i).tampil(i + 1);
    }
}