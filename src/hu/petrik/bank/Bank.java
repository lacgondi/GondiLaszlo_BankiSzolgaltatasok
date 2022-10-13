package hu.petrik.bank;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Bank {
    private List<Szamla> szamlaLista = new ArrayList<>();

    public Bank() {
    }

    public Szamla szamlanyitas(Tulajdonos tulajdonos, int hitelKeret){
        if(hitelKeret!=0){
            return new HitelSzamla(tulajdonos,hitelKeret);
        }else{
            return new MegtakaritasiSzamla(tulajdonos);
        }
    }

    public int getOsszegegyenleg(Tulajdonos tulajdonos){
        for (Szamla sz:szamlaLista) {
            if(sz.getTulajdonos().equals(tulajdonos)){
                return sz.getAktualisEgyenleg();
            }
        }
        return -1;
    }

    public Szamla getLegnagyobbEgyenleguSzamla(Tulajdonos tulajdonos){
        int max=0;
        int maxIndex=0;
        int index=0;
        for (Szamla sz: szamlaLista) {
            if(sz.getAktualisEgyenleg()>max){
                max=sz.getAktualisEgyenleg();
                maxIndex=index;
            }
            index++;
        }
        return szamlaLista.get(maxIndex);
    }

    public long getOsszHitelkeret(){
        long sum =0;
        List<HitelSzamla> hitelSzamlaList = new ArrayList<>();
        for (Szamla sz:szamlaLista) {
            if(sz.hasHitel()){
                hitelSzamlaList.add((HitelSzamla) sz);
            }
        }
        for (HitelSzamla hSz:hitelSzamlaList) {
            sum+=hSz.getHitelKeret();
        }
        return sum;
    }
}
