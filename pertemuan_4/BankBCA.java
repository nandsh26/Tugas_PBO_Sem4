public class BankBCA extends Bank {

    @Override
    void sukuBunga(){ //method ini di diambil dari class Bank
        // suku bunga disesuaikan dengan BCA
        System.out.println("Suku Bunga BCA adalah 4.5%");
    }

    @Override
    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        // bank tujuan otomatis BCA
        System.out.println("Transfer Rp " + jumlah + " ke rekening " + rekeningTujuan + " di bank BCA");
    }

    @Override
    int biayaTransfer(String bankTujuan) {
        // overriding biaya transfer khusus BCA
        if (bankTujuan.equalsIgnoreCase("BCA")) return 0; // sesama BCA gratis
        if (bankTujuan.equalsIgnoreCase("BNI")) return 4000; //biaya tranfer ke BNI
        return 7500; // Biaya Transfer ke bank lain
    }
    
}
