public class Bank {

    // Method 1 → transfer sederhana
    void transferUang(int jumlah, String rekeningTujuan) {
        // method ini digunakan untuk transfer ke rekening tanpa menyebutkan bank
        System.out.println("Transfer Rp " + jumlah +
                " ke rekening " + rekeningTujuan);
    }

    // Method 2 → OVERLOADING
    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        // method ini merupakan overloading karena nama sama tapi parameter berbeda
        // digunakan untuk transfer ke rekening beda bank
        System.out.println("Transfer Rp " + jumlah +
                " ke rekening " + rekeningTujuan +
                " di bank " + bankTujuan);
    }

    // Method 3 → OVERLOADING
    void transferUang(int jumlah, String rekeningTujuan,
                      String bankTujuan, String berita) {
        // method ini juga overloading karena jumlah parameter lebih banyak
        // ditambahkan parameter "berita" sebagai keterangan transfer
        System.out.println("Transfer Rp " + jumlah +
                " ke rekening " + rekeningTujuan +
                " di bank " + bankTujuan +
                " dengan berita: " + berita);
    }

    // Method suku bunga default
    void sukuBunga() {
        // method ini digunakan untuk menampilkan suku bunga standar
        System.out.println("Suku Bunga standar adalah 3%");
    }

    // BONUS → biaya transfer
    int biayaTransfer(String bankTujuan) {
        // method ini digunakan untuk menentukan biaya transfer berdasarkan bank tujuan
        if (bankTujuan.equalsIgnoreCase("BNI")) return 4000;
        if (bankTujuan.equalsIgnoreCase("BCA")) return 6500;
        return 5000; // default jika bank lain
    }
}