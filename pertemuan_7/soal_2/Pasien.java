import java.util.ArrayDeque;

public class Pasien{
    public static void main(String[] args) {

        ArrayDeque<String> antrianPasien = new ArrayDeque<>();
        antrianPasien.addLast("Pasien 1 (Umum)");
        antrianPasien.addLast("Pasien 2 (Umum)");
        antrianPasien.addLast("Pasien 3 (Umum)");

        System.out.println("\n ====== Antrian Awal ======");
        int no = 1;
        for (String p : antrianPasien)
            System.out.println("  " + no++ + ". " + p);

        antrianPasien.addFirst("Pasien DARURAT");
        System.out.println("\n===== Pasien Gawat Darurat Masuk =====");
        System.out.println("==== Pasien Akan di Prioritaskan Terlebih Dahulu =====");

        System.out.println("\n====== Antrian Setelah di Tambah Pasien Gawat Darurat ======");
        no = 1;
        for (String p : antrianPasien) {
            System.out.println("  " + no++ + ". " + p);
        }

        System.out.println("\n===== Proses Pelayanan Pasien =====");
        no = 1;
        System.out.println(no++ + "." +" Melayani -> " + antrianPasien.pollFirst());
        System.out.println(no++ + "." +" Melayani -> " + antrianPasien.pollFirst());

        System.out.println("\nSisa Antrian");
        no = 1;
        for (String p : antrianPasien)
            System.out.println("  " + no++ + ". " + p);
    }
}