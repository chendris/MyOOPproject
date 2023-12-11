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

    }
}