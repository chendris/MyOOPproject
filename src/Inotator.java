public class Inotator extends Sportiv{

    public Inotator(String tara, String sport) {
        super(tara, sport);
    }

    @Override
    void seAntreneaza() {
        System.out.println("Baga 10 ture de bazin");
    }
    public void seOdihneste(){
        System.out.println("Inotatorul se odihneste");
    }
}
