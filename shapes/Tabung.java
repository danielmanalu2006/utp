package utp.shapes;

public class Tabung extends BangunRuang {
    private double radius;
    private final int PEMBILANG = 22;
    private final int PENYEBUT = 7;

    public Tabung() {
        this.radius = 0;
        setTinggi(0);
        setNama("Tabung");
    }

    public void setRadius(double inputRadius) {
        this.radius = inputRadius;
    }

    private double getLuasAlas() {
        return Math.pow(radius, 2) * ((double)PEMBILANG / PENYEBUT);
    }

    private double getKeliling() {
        return 2*radius*((double)PEMBILANG/PENYEBUT);
    }

    @Override
    protected double getLuasPermukaan() {
        return 2 * getLuasAlas() + getKeliling() * getTinggi();
    }

    @Override
    protected double getVolume() {
        return getLuasAlas()*getTinggi();
    }
}