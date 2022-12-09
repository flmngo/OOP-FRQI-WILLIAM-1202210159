public class Kapal extends TransportasiAir{
    protected String mesin;
    public Kapal (int jumlahKursi, int biaya, String mesin){
    super(jumlahKursi, biaya);
    this.mesin = mesin;

    }
    @Override
    public void information(){
        System.out.println("Transportasi jenis Kapal dengan  kursi berjumlah" +" " + jumlahKursi + " " + "ditetapkan dengan biaya sebesar" + " " + biaya + " " );

    }
    
    public void berlayar () {
        System.out.println(" Transportasi jenis kapal sedang berlayar menggunakan mesin diesel dengan kecepatan tidak stabil");

    }

    public void berlayar (int kecepatan) {
        System.out.println("Transportasi jenis kapal sedang berlayar menggunakan mesin diesel dengan kecepatan di kisaran " + " " + kecepatan + " ");

    }

    public void berlabuh() {
        System.out.println("Transportasi jenis kapal sedang berlabuh");
    }
}
