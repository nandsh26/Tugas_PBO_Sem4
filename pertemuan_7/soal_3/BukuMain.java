public class BukuMain {
public static void main(String[] args) {
    Buku<String, Integer, String> B = new Buku<>();

        B.setJudul("MADILOG");
        B.setTahunTerbit(1946);
        B.setPengarang("TAN MALAKA");
        System.out.println(B.getJudul());
        System.out.println(B.getTahunTerbit());
        System.out.println(B.getPengarang());
    }
}

