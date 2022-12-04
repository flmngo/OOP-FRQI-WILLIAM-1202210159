public class Handphone extends Perangkat {
    protected boolean finger_print;
    public Handphone(boolean fingerprint, String drive_type, int ram, float processor_speed) {
    super(drive_type, ram, processor_speed);
    this.finger_print = fingerprint;
    }
    @Override
    public void information() {
        System.out.println("Handphone ini memiliki tipe drive" + " " + drive_type + " " + "dengan total ram sebesar " + ram + " " + "GB dan kecepatan processor sebesar" + " " + processor_speed + " " + "Ghz. " + "Selain itu, handphone ini " + (finger_print == false ? "tidak memiliki " : "memiliki ") + "Fingeprint");
    }
        public void telepon(int Phone_Number) {
            System.out.println("Handphone berhasil menyambungkan telfon ke No : " + Phone_Number);
    }
            public void KirimPesan(int OtherPhone_Number) {
                System.out.println("Handphone berhasil mengirim SMS ke No : " + OtherPhone_Number);
    }
                public void DoubleNoTelp(int PhoneNumber, int Other_Phone_Number) {
                    System.out.println("Handphone berhasil mengirim SMS ke No : " + PhoneNumber + " " + "dan " + Other_Phone_Number);
    }
}