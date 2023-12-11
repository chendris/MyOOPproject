public class Elev {

    String nume;
    static String diriginte="Isoscel";

    public Elev(String nume) {
        this.nume = nume;
    }

    public void metodaNonStatica(){
        System.out.println("Metoda non statica");
    }

    public static void metodaStatica(){
        System.out.println("Metoda statica");
    }

}
