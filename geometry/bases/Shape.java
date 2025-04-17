package praktic.geometry.bases;

// Shape ini class abstract paling dasar buat semua bentuk (2D & 3D)
public abstract class Shape {
    // Variabel name buat nyimpen nama dari bentuk
    private String name;

    // Constructor kosong, jadi objek turunan bisa dibuat tanpa nama dulu
    public Shape() {}

    // Setter buat ngisi nama bentuk
    public void setName(String inputName) {
        this.name = inputName;
    }

    // Getter buat ambil nama bentuk
    public String getName() {
        return name;
    }

    // Method abstract, harus di override sama class turunan
    // Biasanya isinya informasi tentang bentuk tersebut
    public abstract void printInfo();
}