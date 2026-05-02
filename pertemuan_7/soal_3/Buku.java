public class Buku <T, U, V> {
    private T judul;
    private U tahunTerbit;
    private V pengarang;

    public void setJudul(T judul){
        this.judul = judul;
    }

    public void setTahunTerbit(U tahunTerbit){
        this.tahunTerbit = tahunTerbit;
    }

    public void setPengarang(V pengarang){
        this.pengarang = pengarang;
    }

    public T getJudul(){
        return judul;
    }

    public U getTahunTerbit(){
        return tahunTerbit;
    }

    public V getPengarang(){
        return pengarang;
    }
}