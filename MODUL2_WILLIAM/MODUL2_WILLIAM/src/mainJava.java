public class mainJava {
    public static void main(String [] args) {
        TransportasiAir transportasiAir = new TransportasiAir(5, 20000);
        transportasiAir.information();
        transportasiAir.berlayar();
        transportasiAir.berlabuh();

        Sampan sampan= new Sampan(2, 50, 10000);
        sampan.information();
        sampan.berlayar();
        sampan.berlabuh();
        sampan.berlabuh(2);

        Kapal kapal = new Kapal(50, 10000, "diesel");
        kapal.information();
        kapal.berlayar();
        kapal.berlayar(100);
        kapal.berlabuh();

    }    
}
        