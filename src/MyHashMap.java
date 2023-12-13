import java.util.HashMap;

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
    }
}
