package hu.petrik.bank;

public class Kartya extends BankiSzolgaltatas{
    private Szamla szamla;
    private String kartyaSzam;

    public Kartya(Tulajdonos tulajdonos, Szamla szamla, String kartyaSzam) {
        super(tulajdonos);
        this.szamla = szamla;
        this.kartyaSzam = kartyaSzam;
    }

    public Kartya(String kartyaSzam){
        super(new Tulajdonos(""));
        this.kartyaSzam=kartyaSzam;
    }

    public String getKartyaSzam() {
        return kartyaSzam;
    }

    public boolean vasarlas(int osszeg){
        if(this.szamla.getAktualisEgyenleg()-osszeg<0){
            return false;
        }else{
            this.szamla.kivesz(osszeg);
            return true;
        }
    }
}
