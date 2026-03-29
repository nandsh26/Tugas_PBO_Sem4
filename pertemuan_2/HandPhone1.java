// SEBELUM DI PERBAIKI

public class HandPhone { // nama class harus sama dengan nama file, maka nama file harus HandPhone.java agar program dapat dicompile dan dijalankan
    String jenis_hp;
    int tahun_pembuatan;

    String public setDataHP (String jenis_hp, int tahun_pembuatan){ // Menghapus String yang ada di awal kode karena method setter tidak membutuhkan return value
    // menambahkan void diantara public dan setDataHP "public void setDataHP"

        jenis_hp = jenis_hp; // menambahkan this. dibagian awal kode untuk membedakan atribut class dengan parameter
        tahun_pembuatan = tahun_pembuatan; // ditambah this. juga
    }
    String getJenisHP(){ // menambahkan public dibagian awal agar dapat dipanggil dari class lain
        // method getter pada "getJenisHP" digunakan untuk mengambil nilai dari variabel
        // menambahkan return value agar nilai variabel dapat dikembalikan
    }

    String getTahunPembuatan(){ // mengganti String menjadi int sesuai dengan inisialisasi atau jenis variabel saat dibuat
        // menambahkan public dibagian awal agar dapat dipanggil dari class lain
        // method getter pada "getTahunPembuatan" digunakan untuk mengambil nilai dari variabel
        // menambahkan return value agar nilai variabel dapat dikembalikan
    }
    public static main void (String[] args) { // Posisi void dan main terbalik
        HandPhone hp = new HandPhone();
        hp.setDataHP(jenis_hp,tahun_pembuatan); // bagian yang ada dalam kurung diisi dengan nilai inputan
        // inputan data String harus ditambahkan tanda petik dua "" untuk inputannya sedangkan untuk inputan int tidak menggunakan tanda petik
        hp.getJenisHP() // ditambahkan System.out.println(); dibagian awal kodenya dan memindahkan kode yang ada ke dalam tanda kurung untuk menampilkan hasil eksekusi dari kode yang dibuat
        hp.getTahunPembuatan() // ditambahkan System.out.println(); dibagian awal kodenya dan memindahkan kode yang ada ke dalam tanda kurung untuk menampilkan hasil eksekusi dari kode yang dibuat
    }
}