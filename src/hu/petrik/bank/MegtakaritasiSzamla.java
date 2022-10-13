package hu.petrik.bank;

public class MegtakaritasiSzamla extends Szamla{
    private double kamat;
    private static double alapKamat = 2;

    public MegtakaritasiSzamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
        this.kamat = alapKamat;
    }

    public double getKamat() {
        return kamat;
    }

    public void setKamat(double kamat) {
        this.kamat = kamat;
    }

    @Override
    public boolean kivesz(int osszeg) {
        return super.kivesz(osszeg);
    }

    public void kamatJovairas(){
        befizet((int) (this.getAktualisEgyenleg()*kamat));
    }
}
