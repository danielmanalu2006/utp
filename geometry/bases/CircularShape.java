package praktic.geometry.bases;

// CircularShape ini class abstract, jadi gak bisa dibikin objek langsung
// Tapi bisa diturunin ke class lain kayak Circle atau Sphere
public abstract class CircularShape extends Shape {
    // Ini variabel radius buat nyimpen jari-jari lingkaran
    private double radius;

    // Ini definisi pecahan dari PI, yaitu 22/7
    // Dibuat static final karena nilainya konstan dan bisa dipakai semua turunan class ini
    protected static final int PI_NUMERATOR = 22;
    protected static final int PI_DENOMINATOR = 7;

    // Constructor kosong, jadi bisa bikin objek turunan tanpa langsung kasih radius
    public CircularShape() {}

    // Setter buat ngisi nilai radius dari luar class
    public void setRadius(double inputRadius) {
        this.radius = inputRadius;
    }

    // Getter buat ambil nilai radius saat dibutuhkan
    public double getRadius() {
        return radius;
    }
}