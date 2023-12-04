public class Persoana {
    int varsta;
    String sex;
    String nume;
    String prenume;

    public Persoana(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }
    public Persoana(){

    }

    public Persoana(String nume,int varsta,String sex){
        this.nume=nume;
        this.varsta=varsta;
        this.sex=sex;
    }
}
