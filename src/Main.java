// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Carte carte1=new Carte();
        carte1.autor="Mihai Eminescu";
        carte1.titlu="Poezii";
        carte1.pret=35.00;

        Carte carte2=new Carte();
        carte2.titlu="Amintiri din copilarie";
        carte2.autor="Ion Creanga";

        System.out.println(carte1.getPret());
        System.out.println(carte1.afiseaza());

        Masina masina1=new Masina();
        System.out.println(masina1.marca);
        Masina masina2=new Masina();
        System.out.println(masina2.marca="Dacia");

        Masina masina3=new Masina();
        Masina masina4=new Masina();
        masina3.anFabricatie=2010;
        masina4.anFabricatie=2020;
        System.out.println(masina3.getAnFabricatie());
        System.out.println(masina4.getAnFabricatie());
        Masina masina5 =new Masina("Tesla",2022);
        System.out.println(masina5.marca);
        System.out.println(masina5.getAnFabricatie());

        Persoana persoana1=new Persoana();
        System.out.println(persoana1.nume);
        System.out.println(persoana1.prenume);

        Persoana persoana2=new Persoana("Ion","Popescu");
        System.out.println(persoana2.nume+" "+persoana2.prenume);

        Persoana persoana3=new Persoana("Razvan",28,"M");
        System.out.println(persoana3.nume+" "+persoana3.varsta+" "+persoana3.sex);

        Animal animal1=new Animal("leu","alb",false);
        Animal animal2=new Animal("porc","roz",true);
        animal1.mananca();
        animal1.doarme();
        System.out.println(animal1.afiseaza());
        animal2.mananca();
        animal2.doarme();
        System.out.println(animal2.afiseaza());


        Elev elev1=new Elev("Popescu");
        Elev elev2=new Elev("Ionel");

        System.out.println(elev1.nume);
        System.out.println(elev2.nume);
        elev1.diriginte="Isoscel2";
        System.out.println(elev2.diriginte);
        elev1.metodaNonStatica();
        Elev.metodaStatica();

        Film film1=new Film();
        film1.setTitlu("Titanic");
        System.out.println(film1.getTitlu());

        Inotator inotator1=new Inotator("Romania","100mBras");
        inotator1.seAntreneaza();
        inotator1.seOdihneste();

        Maratonist maratonist1=new Maratonist("RRRusia","Ultra Maraton");
        maratonist1.seAntreneaza();
        maratonist1.seOdihneste();

        Pisica pisica1=new Pisica();
        Caine caine1=new Caine();
        pisica1.scoateSunete();
        caine1.scoateSunete();

        Mamifer mamifer1=new Pisica();



    }
}