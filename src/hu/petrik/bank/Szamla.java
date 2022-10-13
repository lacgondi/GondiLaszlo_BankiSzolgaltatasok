package hu.petrik.bank;

public class Szamla extends BankiSzolgaltatas {

    private int aktualisEgyenleg;

    public Szamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
        this.aktualisEgyenleg = 0;
    }

    public int getAktualisEgyenleg() {
        return aktualisEgyenleg;
    }

    public void befizet(int osszeg){
        this.aktualisEgyenleg+=osszeg;
    }

    public boolean kivesz(int osszeg){
        if(this.aktualisEgyenleg-osszeg<0){
            return false;
        }else{
            this.aktualisEgyenleg-=osszeg;
            return true;
        }
    }

    public Kartya ujKartya(String kartyaszam){
        return new Kartya(kartyaszam);
    }
}
