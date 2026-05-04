import java.util.ArrayList;
import java.util.Collections;

public class DataSiswa {
  public static void main(String[] args) {

    // ArrayList siswa yang lanjut kuliah
    ArrayList<String> lanjutKuliah = new ArrayList<>();
    lanjutKuliah.add("Andi");
    lanjutKuliah.add("Budi");
    lanjutKuliah.add("Citra");
    lanjutKuliah.add("Dewi");
    System.out.println("Siswa lanjut kuliah: " + lanjutKuliah);

    // ArrayList siswa yang tidak lanjut
    ArrayList<String> tidakLanjut = new ArrayList<>();
    tidakLanjut.add("Eko");
    tidakLanjut.add("Fani");
    System.out.println("Tidak lanjut: " + tidakLanjut);

    // Akses by index
    System.out.println("Siswa ke-1: " + lanjutKuliah.get(0));

    // Update: Budi ternyata tidak jadi kuliah
    lanjutKuliah.remove("Budi");
    tidakLanjut.add("Budi");
    System.out.println("Update lanjut: " + lanjutKuliah);
    System.out.println("Update tidak: " + tidakLanjut);

    // Jumlah total siswa
    int total = lanjutKuliah.size() + tidakLanjut.size();
    System.out.println("Total siswa: " + total);

    // Iterasi semua yang lanjut kuliah
    System.out.println("Daftar kuliah:");
    for (String s : lanjutKuliah) {
      System.out.println(" [Kuliah] " + s);
    }

    // Sorting abjad
    Collections.sort(lanjutKuliah);
    System.out.println("Sorted: " + lanjutKuliah);
  }
}