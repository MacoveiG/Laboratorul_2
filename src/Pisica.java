public class Pisica extends Animal {
    private int greutate;

    public Pisica(String culoare, int pret, int varsta, int greutate) {
        super("Pisica", culoare, pret, varsta);
        this.greutate = greutate;
    }

    public int getGreutate() {
        return greutate;
    }

    public void setGreutate(int greutate) {
        this.greutate = greutate;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", greutate=" + greutate + " kg" +
                '}';
    }
}
