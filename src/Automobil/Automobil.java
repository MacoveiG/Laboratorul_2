package Automobil;

public class Automobil {
    private String tip;

    public Automobil(String tip) {
        this.tip = tip;
    }

    public String getTip() {
        return tip;
    }

    @Override
    public String toString() {
        return "Automobil.Automobil{" +
                "tip='" + tip + '\'';
    }
}
