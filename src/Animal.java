public class Animal {
    protected String tip;
    protected String culoare;
    protected int pret;
    protected int varsta;

    public Animal(String tip, String culoare, int pret, int varsta) {
        this.tip = tip;
        this.culoare = culoare;
        this.pret = pret;
        this.varsta = varsta;
    }

    public String getTip() {
        return tip;
    }

    public String getCuloare() {
        return culoare;
    }

    public int getPret() {
        return pret;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "tip='" + tip + '\'' +
                ", culoare='" + culoare + '\'' +
                ", pret=" + pret + " lei" +
                ", varsta=" + varsta + " ani";
    }
}
