public class Mahasiswa { //Superclassuntuk menyimpan data mahasiswa
    //Variabel untuk menyimpan inputan data mahasiswa
    protected int nim; 
    protected String nama;
    protected int nilai;

    //Method untuk memasukkan data mahasiswa yang akan diwariskan ke subclass
    public void setDataMahasiswa (int nim, String nama, int nilai) {
        this.nim = nim;
        this.nama = nama;
        this.nilai = nilai;
    }

    //Method untuk menampilkan data mahasiswa
    public void tampilData(){
        System.out.println("NIM: " + nim);  
        System.out.println("Nama: " + nama); 
    }

    // Method getter untuk mengambil data yang disimpan dalam variabel
    public int getNim(){
        return nim;
    }

    public String getNama(){
        return nama;
    }

    public int getNilai(){
        return nilai;
    }
}
