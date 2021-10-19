public class Main {
    public static void main(String[] args) {

        Pisica pisica = new Pisica("ALB", 1000, 1, 3);
        System.out.println(pisica.getGreutate());
        System.out.println(pisica.getVarsta());
        pisica.setVarsta(4);
        System.out.println(pisica.getVarsta());
        System.out.println(pisica);

        System.out.println("-------------------------------");
        Caine caine = new Caine("NEGRU", 3000, 2, "ABC");
        System.out.println(caine.getPret());
        caine.setPret(2500);
        System.out.println(caine.getPret());
        System.out.println(caine);

        System.out.println("-------------------------------");
        Iepure iepure = new Iepure("ALB", 1500, 1);
        System.out.println(iepure);

        //================================================================
        System.out.println("\n-------------------------------");
        CamionAlb camionAlb = new CamionAlb(2005,60000);
        System.out.println(camionAlb.getPretRecomandat());
        camionAlb.setPretInRegiune(59899);
        System.out.println(camionAlb);
    }
}
