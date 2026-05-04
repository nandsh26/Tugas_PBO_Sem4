import java.util.ArrayDeque;
import java.util.Deque;

public class AntrianTiket {
  public static void main(String[] args) {

    Deque<String> antrian = new ArrayDeque<>();

    // Pengunjung antri beli tiket wahana
    antrian.addLast("Riko - Roller Coaster");
    antrian.addLast("Sinta - Kora-Kora");
    antrian.addLast("Tono - Rumah Hantu");
    System.out.println("Antrian: " + antrian);

    // VIP masuk dari depan
    antrian.addFirst("Pak Bos - VIP");
    System.out.println("Setelah VIP masuk: " + antrian);

    // Cek siapa yang paling depan
    System.out.println("Depan antrian: " + antrian.peekFirst());

    // Layani pengunjung satu per satu
    String dilayani1 = antrian.pollFirst();
    System.out.println("Dilayani: " + dilayani1);

    String dilayani2 = antrian.pollFirst();
    System.out.println("Dilayani: " + dilayani2);

    System.out.println("Sisa antrian: " + antrian);

    // Pengunjung baru datang
    antrian.addLast("Udin - Bianglala");
    System.out.println("Antrian akhir: " + antrian);
    System.out.println("Jumlah antrian: " + antrian.size());
  }
}