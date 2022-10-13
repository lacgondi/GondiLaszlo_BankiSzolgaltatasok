package hu.petrik.bank;

public class Main {
    public static void main(String[] args) {
        Tulajdonos tulajdonos = new Tulajdonos("Gondi László");
        Bank bank = new Bank();
        bank.szamlanyitas(tulajdonos, 0);
        System.out.println(bank.getOsszegegyenleg(tulajdonos));
    }
}
