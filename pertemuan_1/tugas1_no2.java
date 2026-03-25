import javax.swing.JOptionPane; // Untuk menampilkan kotak dialog input dan pesan pada program Java saat dipanggil

public class tugas1_no2 { // membuat kelas program
    public static void main(String[] args) { // sebagai fungsi utama untuk menjalankan program
        
        String belajar; // Untuk menyimpan inputan dari pengguna

        belajar = JOptionPane.showInputDialog("Anda sedang belajar apa?"); // Menampilkan kotak input untuk menanyakan apa yang sedang dipelajari pengguna

        JOptionPane.showMessageDialog(null,
                "Belajar " + belajar + " sangat mudah"); // untuk menampilkan pesan hasil input pengguna
    }
}