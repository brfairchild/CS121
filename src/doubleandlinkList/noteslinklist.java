package doubleandlinkList;

import java.util.LinkedList;

public class noteslinklist {
    public static void main(String[] args) {
        LinkedList<String> name = new LinkedList<>();
        // Linked list is faster than array list

        // to add
        name.add("Lizzie");
        name.add("John");
        name.add("Steve");
        name.add("Kenzie");

        // to add at specific location
        name.add(2,"Stephen");

        // to get at a specific location
        System.out.print(name.get(3)+"\n");

        System.out.print(name + "\n");

        // to remove
        // name.remove()

        // to set specifc index
        name.set(0,"Bob");

        System.out.print(name);


        // Link list can dynamically grow.
        // array list used for randomly retrieving information


    }
}
