import java.util.Scanner; // import Scanner untuk menginput data

public class Main {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); //Membuat objek Scanner


        int jumlah = 4; //Untuk menentukan jumlah inputan yang dapat dimasukkan
       
        NilaiMahasiswa[] akhir = new NilaiMahasiswa[jumlah]; //Membuat array objek NilaiMahasiswa untuk menyimpan data mahasiswa

        int total = 0; //variabel untuk menyimpan total nilai
        int lulus = 0; //variabel untuk menghitung jumlah mahasiswa lulus
        int tidakLulus = 0; //variabel untuk menghitung jumlah mahasiswa tidak lulus

        //variabel untuk menghitung jumlah grade
        int gradeA = 0;
        int gradeB = 0;
        int gradeC = 0;
        int gradeD = 0;
        int gradeE = 0;

        //variabel untuk menyimpan nama mahasiswa berdasarkan grade
        String namaA = "";
        String namaB = "";
        String namaC = "";
        String namaD = "";
        String namaE = "";

        //variabel untuk menyimpan nama mahasiswa lulus dan tidak lulus
        String namaLulus = "";
        String namaTidakLulus = "";

        String daftarNilai = ""; //Untuk menyimpan daftar nilai untuk perhitungan rata-rata

        //Loop untuk melakukan input data mahasiswa
        for (int i = 0; i < jumlah; i++) {
            
            System.out.println("Data Mahasiswa ke-" + (i + 1));

            System.out.print("NIM: ");
            int nim = input.nextInt(); 
            input.nextLine(); //untuk membersihkan enter

            System.out.print("Nama: ");
            String nama = input.nextLine();

            System.out.print("Nilai: ");
            int nilai = input.nextInt();

            //Validasi nilai agar hanya menerima 0 - 100
            if (nilai < 0 || nilai > 100) {
                System.out.println("\nInput nilai anda salah");
                System.out.println("Tolong masukkan nilai yang benar (0-100)!\n");
                i--; //Agar program mengulang input mahasiswa yang sama
                continue;
            }

            daftarNilai += nilai; //Menyimpan nilai untuk ditampilkan dalam perhitungan rata-rata

            //Melakukan penjumlahan dari data yang diambil dari inputan nilai yang sudah disimpan di daftarNilai
            if (i < jumlah - 1) {
                daftarNilai += "+";
            }
            input.nextLine();

            //Membuat objek NilaiMahasiswa
            akhir[i] = new NilaiMahasiswa(nim, nama, nilai);

            total += nilai; //Menambahkan nilai ke total

            //Mengecek lulus atau tidak
            if (akhir [i].isLulus()) {
                lulus++;
                namaLulus += akhir[i].getNama() + ", ";
            }
            else {
                tidakLulus++;
                namaTidakLulus += akhir[i].getNama() + ", ";
            }
            
            //Mengambil grade mahasiswa
            String gr = akhir[i].getGrade();

            //Menghitung jumlah grade
            if (gr != null){
                if (gr.equals("A")){
                    gradeA++;
                    namaA += akhir[i].getNama() + ", ";
                }
                else if (gr.equals("B")){
                    gradeB++;
                    namaB += akhir[i].getNama() + ", ";
                }
                else if (gr.equals("C")){
                    gradeC++;
                    namaC += akhir[i].getNama() + ", ";
                }                
                else if (gr.equals("D")){
                    gradeD++;
                    namaD += akhir[i].getNama() + ", ";
                }
                else if (gr.equals("E")){
                    gradeE++;
                    namaE += akhir[i].getNama() + ", ";
                }
            }
            System.out.println("-----------------------");
        }

        //Menampilkan Output final yang disesuaikan dengan ketentuan soal
        System.out.println("\nOUTPUT");

        //menampilkan semua data mahasiswa
        for (int i = 0; i < jumlah; i++) {
            akhir[i].tampilData(); //Memanggil method dari subclass NilaiMahasiswa yang telah dioverride
        }

        double rata = (double) total / jumlah; //menghitung rata-rata nilai mahasiswa

        //Menampilkan jumlah mahasiswa
        System.out.println("Jumlah Mahasiswa : " + jumlah);

        //Menampilkan jumlah mahasiswa lulus dan tidak lulus dengan namanya
        System.out.println("Jumlah Lulus : " + lulus + " yaitu " + namaLulus);
        System.out.println("Jumlah Tidak Lulus : " + tidakLulus + " yaitu " + namaTidakLulus);
        
        //Menampilkan jumlah grade dan nama mahasiswa sesuai dengan ketentuan soal 
        if (gradeA == 0) {
        }else {
            System.out.println("Jumlah Mahasiswa dengan Nilai A = " + gradeA + " yaitu " + namaA);
        }
        if (gradeB == 0) {
        }else {
            System.out.println("Jumlah Mahasiswa dengan Nilai B = " + gradeB + " yaitu " + namaB);
        }
        
        if (gradeC == 0) {
        } else {
            System.out.println("Jumlah Mahasiswa dengan Nilai C = " + gradeC + " yaitu " + namaC);
        }
        
        if (gradeD == 0) {
        } else {
            System.out.println("Jumlah Mahasiswa dengan Nilai D = " + gradeD + " yaitu " + namaD);
        }
        
        if (gradeE == 0) {
        } else {
            System.out.println("Jumlah Mahasiswa dengan Nilai E = " + gradeE + " yaitu " + namaE);
        }
        System.out.println("Rata-rata Nilai : " + daftarNilai + " / " + jumlah+ " = " + rata);
    }
}