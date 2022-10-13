package hu.petrik.bank;

public class HitelSzamla extends Szamla {
    private int hitelKeret;

    public HitelSzamla(Tulajdonos tulajdonos, int hitelKeret) {
        super(tulajdonos);
        this.hitelKeret = hitelKeret;
    }

    public int getHitelKeret() {
        return hitelKeret;
    }

    @Override
    public boolean kivesz(int osszeg) {
        if(getAktualisEgyenleg()-osszeg<hitelKeret){
            this.befizet(osszeg*-1);
            return true;
        }else {
            return false;
        }
    }
}
