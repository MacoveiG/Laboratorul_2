package Animal;

public class Iepure extends Animal {

    public Iepure(String culoare, int pret, int varsta) {
        super("Animal.Iepure", culoare, pret, varsta);
    }

    @Override
    public String toString() {
        return super.toString() +
                "}";
    }
}
