public class Laptop extends Perangkat {
    protected boolean Web_cam;
    public Laptop(String drive_type, int ram, float processor_speed, boolean webcam) {
    super(drive_type, ram, processor_speed);
    this.Web_cam = webcam;
    }

    @Override
    public void information() {
        System.out.println("Laptop ini memiliki tipe drive" + " " + drive_type + " " + "dengan total ram sebesar " + ram + " " + "GB dan kecepatan processor sebesar" + " " + processor_speed + " " + "Ghz. " + "Selain itu, Laptop ini " + (Web_cam == false ? "tidak memiliki " : "memiliki ") + "webcam");
    }
        public void OpenGame(String GameName) {
            System.out.println("Laptop berhasil membuka game : " + GameName);
    }
            public void SendEmail(String email) {
                System.out.println("Laptop berhasil mengirim email ke " + email);
    }
                public void DoubleEmail(String email, String Email_dua) {
                    System.out.println("Laptop berhasil mengirim email ke " + email + " " + "dan ke " + Email_dua);
    }
}