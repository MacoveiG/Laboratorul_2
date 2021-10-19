package Automobil;

public class CamionAlb extends Camion{
    private int pretInRegiune;

    public CamionAlb(int anul,int pretInRegiune) {
        super("ALB", anul);
        this.pretInRegiune = pretInRegiune;
    }

    public int getPretInRegiune() {
        return pretInRegiune;
    }

    public void setPretInRegiune(int pretInRegiune) {
        this.pretInRegiune = pretInRegiune;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", pretInRegiune=" + pretInRegiune + " lei" +
                "}";
    }
}
