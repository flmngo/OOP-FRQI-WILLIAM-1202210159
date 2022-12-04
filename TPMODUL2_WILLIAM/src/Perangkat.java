public class Perangkat {
protected int ram;
protected String drive_type;
protected float processor_speed;

public Perangkat(String drive_type, int ram, float processor) {
    this.ram = ram;
    this.drive_type = drive_type;
    this.processor_speed = processor;
    }

    public void information() {
        System.out.println("Perangkat yang tidak diketahui, memiliki tipe" + " " + drive_type + " " + "dengan total ram sebesar " + ram + " " + "GB dan kecepatan processor sebesar" + " " + processor_speed + " " + "Ghz");
    }
}
