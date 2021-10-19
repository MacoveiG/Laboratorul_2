package Animal;

public class Caine extends Animal {
    private final String rasa;

    public Caine(String culoare, int pret, int varsta, String rasa) {
        super("Animal.Caine", culoare, pret, varsta);
        this.rasa = rasa;
    }

    public String getRasa() {
        return rasa;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", rasa='" + rasa + '\'' +
                "}";
    }
}
