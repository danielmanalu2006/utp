package utp.shapes;

public class LimasPersegi extends BangunRuang{
    private double sisi;

    public LimasPersegi(double sisi, double tinggi) {
        this.sisi = sisi;
        setTinggi(tinggi);
        setNama("Limas Persegi");
    }

    private double getTinggiSegitiga() {
        return Math.sqrt(Math.pow(getTinggi(), 2) + Math.pow(sisi/2, 2));
    }

    private double getLuasSegitiga() {
        return getTinggiSegitiga()*sisi/2;
    }

    private double getLuasAlas() {
        return sisi*sisi;
    }

    @Override
    protected double getLuasPermukaan() {
        return 4*getLuasSegitiga()+getLuasAlas();
    }

    @Override
    protected double getVolume() {
        return getLuasAlas()*getTinggi()/3;
    }
}