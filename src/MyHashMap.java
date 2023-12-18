import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> dictionarulNostru=new HashMap<>();
        dictionarulNostru.put(1,"First");
        dictionarulNostru.put(2,"Second");
        dictionarulNostru.put(3,"Third");
        dictionarulNostru.put(4,"Forth");
        dictionarulNostru.replace(3,"Third-replace");



        System.out.println(dictionarulNostru.get(1));
        System.out.println(dictionarulNostru.keySet());
        System.out.println(dictionarulNostru.values());
        dictionarulNostru.remove(3);
        System.out.println(dictionarulNostru.values());
        System.out.println(dictionarulNostru.replace(3,"Third","Third-Replace"));

        //Ex2 tema
        HashMap<String,Boolean> studenti =new HashMap<>();
        studenti.put("Andrei",true);
        studenti.put("Razvan",true);
        studenti.put("Laura",false);
        studenti.put("Mirela",false);
        studenti.put("Diana",true);
        for (Map.Entry<String, Boolean> student:
                studenti.entrySet()) {
            if (student.getValue())
                System.out.println(student.getKey());

        }



    }
}
