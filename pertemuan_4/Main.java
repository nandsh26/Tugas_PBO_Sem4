public class Main {
    public static void main(String[] args) {

        // membuat object dari class Bank dan subclass
        Bank bank = new Bank();
        Bank bni = new BankBNI(); // polymorphism (parent = child)
        Bank bca = new BankBCA(); // polymorphism

        System.out.println("=== OVERLOADING ===");

        // memanggil method overloading
        bank.transferUang(100000, "261500");
        bank.transferUang(200000, "009789", "MANDIRI");
        bank.transferUang(300000, "878787", "BRI", "Bayar utang");

        // method default
        bank.sukuBunga();

        System.out.println("\n=== OVERRIDING ===");

        // memanggil method overriding
        bni.sukuBunga();
        bni.transferUang(150000, "20240040097", "BNI");

        bca.sukuBunga();
        bca.transferUang(250000, "21042026", "BCA");

        System.out.println("\n=== BONUS BIAYA TRANSFER ===");

        // fitur untuk menghitung biaya transfer berdasarkan bank tujuan
        System.out.println("BNI ke BNI : Rp " + bni.biayaTransfer("BNI"));
        System.out.println("BNI ke BCA : Rp " + bni.biayaTransfer("BCA"));
        System.out.println("BCA ke BCA : Rp " + bca.biayaTransfer("BCA"));
        System.out.println("BCA ke BNI : Rp " + bca.biayaTransfer("BNI"));
        System.out.println("Bank Lain ke BCA : Rp " + bca.biayaTransfer("MANDIRI"));
        System.out.println("Bank Lain ke BNI : Rp " + bni.biayaTransfer("SEABANK"));
    }
}
