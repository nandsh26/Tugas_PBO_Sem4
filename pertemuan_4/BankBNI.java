public class BankBNI extends Bank {

    @Override 
    void sukuBunga() { // method ini di diambil dari class Bank
        // nilai suku bunga diubah sesuai bank BNI
        System.out.println("Suku Bunga BNI adalah 4%");
    }

    @Override
    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        // bankTujuan tidak perlu ditampilkan lagi karena sudah pasti BNI
        System.out.println("Transfer Rp " + jumlah +  " ke rekening " + rekeningTujuan + " di bank BNI");
    }

    @Override
    int biayaTransfer(String bankTujuan) {
        // overriding biaya transfer khusus BNI
        if (bankTujuan.equalsIgnoreCase("BNI")) return 0; // sesama BNI gratis
        if (bankTujuan.equalsIgnoreCase("BCA")) return 6500; //biaya tranfer ke BCA
        return 6000; // biaya Transfer ke bank lain
    }
}
