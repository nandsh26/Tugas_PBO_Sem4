public class Person {

    // atribut variabel dibuat private agar tidak dapat diakses langsung oleh 
    private String name;
    private String address;

    // Constructor untuk inisialisasi awal object
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Getter untuk mengambil nilai name
    public String getName() {
        return name;
    }

    // Getter untuk mengambil nilai address
    public String getAddress() {
        return address;
    }

    // Setter untuk mengubah nilai address
    public void setAddress(String address) {
        this.address = address;
    }

    // Method untuk menampilkan data dalam bentuk string
    public String toString() {
        return name + " (" + address + ")";
    }
}