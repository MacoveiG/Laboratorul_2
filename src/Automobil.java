public class Automobil {
    protected String tip;

    public Automobil(String tip) {
        this.tip = tip;
    }

    public String getTip() {
        return tip;
    }

    @Override
    public String toString() {
        return "Automobil{" +
                "tip='" + tip + '\'';
    }
}
