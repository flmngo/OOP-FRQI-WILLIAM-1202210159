public class Sampan extends TransportasiAir {
    protected int layar;
    public Sampan (int layar, int jumlahKursi, int biaya) {
    super(jumlahKursi, biaya);
    this.layar = layar;

    }
    @Override
    public void information() {
        System.out.println("Transportasi jenis sampan dengan kursi berjumlah" + " " + jumlahKursi + " " + "ditetapkan dengan biayay sebesar" + " " + biaya + " ");
    }

    public void berlayar(int layar) {
        System.out.println("Transportasi jenis sampan sedang berlayar menggunakan" + " " + layar + " ");

    }

    public void berlabuh() {
        System.out.println("Transportasi Air jenis Sampan berlabuh di pantai tanpa jangkar");

    }

    public void berlabuh(int jangkar) {
        System.out.println("Transportasi Air jenis Sampan berlabuh di pantai menggunakan" + " " + jangkar + " ");
    }
}
