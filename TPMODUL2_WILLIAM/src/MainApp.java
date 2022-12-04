public class MainApp {
    public static void main(String [] args) {
        Perangkat perangkat = new Perangkat("Western Digital", 8, 3.4f);
        perangkat.information();

        System.out.println();
        System.out.println("=============================================================================");
        System.out.println();

            Laptop laptop = new Laptop("Adata", 16, 4.5f, false);
                laptop.information();
                laptop.OpenGame("PUBG");
                laptop.SendEmail("williamkm007@gmail.com");
                laptop.DoubleEmail("williamkm007@gmail.com", "flamingooo24@mail.com");

        System.out.println();
        System.out.println("=============================================================================");
        System.out.println();

            Handphone hp = new Handphone(false, "SnapDragon", 4, 1.95f);
                hp.information();
                hp.telepon(62877995);
                hp.KirimPesan(62853446);
                hp.DoubleNoTelp(62776355, 628764453);
    }
}
