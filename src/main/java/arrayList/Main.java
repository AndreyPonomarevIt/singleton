package arrayList;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Jon","Nik","Gerber","Den"));
        printList(names);
        System.out.println(names);
        names.add("Fill");
        System.out.println(names);
        System.out.println(names.get(4));
        names.add(1,"Sam");
        System.out.println(names);
        for(String name: names) {
            System.out.println(name);
        }
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
    static void printList(List<String> strings) {
        if(strings != null && strings.size() !=0) {
            System.out.println("Ok");
        }
    }

}
