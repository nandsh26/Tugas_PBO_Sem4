public class NilaiMahasiswa extends Mahasiswa { // subclass yang mewarisi class Mahasiswa

    private String grade; // variabel untuk menyimpan grade mahasiswa

    // Constructor untuk mengisi data mahasiswa
    public NilaiMahasiswa(int nim, String nama, int nilai) {

        setDataMahasiswa(nim, nama, nilai); //Memanggil method dari superclass
        hitungGrade(); //Menghitung grade berdasarkan nilai
    }

    //Method untuk menghitung grade
    private void hitungGrade() {

        if (nilai >= 80) { //Jika nilai 80 ke atas
            grade = "A";
        }

        else if (nilai >= 70) { //Jika nilai 70-79
            grade = "B";
        }
        else if (nilai >= 60) { //Jika nilai 60-69
            grade = "C";
        }
        else if (nilai >= 50) { //Jika nilai 50-59
            grade = "D";
        }
        else { //Jika nilai kurang dari 50
            grade = "E";
        }
    }

    //Method getter untuk mengambil grade
    public String getGrade() {
        return grade;
    }

    //Method untuk mengecek lulus atau tidak
    public boolean isLulus() {
        return nilai >= 60;  //Jika nilai 60 ke atas, mahasiswa akan dinyatakan lulus
    }

    @Override //Untuk mengubah dan menambahkan fungsi method tampilData dari superclass

    public void tampilData() {
        super.tampilData(); //Memanggil method tampilData dari class Mahasiswa
        System.out.println("Nilai : " + nilai); //Menampilkan nilai mahasiswa
        System.out.println("Grade : " + grade); //Menampilkan hasil grade nilai mahasiswa
        System.out.println("=======================");
    }
}