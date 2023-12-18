import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args) {


        ArrayList<String> listaNoastra = new ArrayList<>();

        listaNoastra.add("First");
        listaNoastra.add("Second");
        listaNoastra.add("Third");
        listaNoastra.set(0,"First-Replacement");
        listaNoastra.remove(2);

        for (String element:listaNoastra) {
            System.out.println(element);
        }
        System.out.println(listaNoastra.size());
        System.out.println(listaNoastra.contains("Second"));
        System.out.println(listaNoastra.indexOf("Second"));

        //Ex1 Tema
        ArrayList<String> cursuri= new ArrayList<>();
        cursuri.add("Testare Manuala");
        cursuri.add("Testare automata");
        cursuri.add("Front-end");
        cursuri.add("Java");
        System.out.println(cursuri.get(1));
        System.out.println(cursuri.size());

        for (String element:cursuri) {
            System.out.println(element);

        }
    }
}
