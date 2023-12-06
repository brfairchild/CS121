package NewPackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class setNotes2 {
    public static void main(String[] args) {



        Set<String> movieNames = new HashSet<>();



        // how do we add to our set?
        // simply use the .add() method passing in the element we would like to add.

        movieNames.add("Shrek");
        movieNames.add("Mario Movie");
        movieNames.add("Up");
        movieNames.add("Spiderman");


        // When we add identical items they do not show up because we are not allowed to have duplicates.
        System.out.println(movieNames);
        // to remove from a set (we can put in exactly what we want to remove)
        movieNames.remove("Up");
        System.out.print(movieNames);

        // to see if a set contains a specific element returns true / false
        System.out.println(movieNames.contains("Up"));
        // returns false because we have removed up from the set

        // check if a set is empty (true or false
        movieNames.isEmpty();

        // clear a set
        movieNames.clear();

        movieNames.add("Superman 2");

        HashMap<String,String> capitals = new HashMap<>();
        capitals.put("USA","D.C.");
        capitals.put("Canada", "Montreal");
        capitals.put("Japan", "Tokyo");
        System.out.println(capitals);
        // to remove from hashmap
        // .remove();
        capitals.remove("USA");
        System.out.println(capitals);

        // .entrySet() going to make it assign to a set

        // ITERATORS
        // hasNext()
        // next() the next item through the entire set
        // remove() > removes the element void
        ////// remove is optional

        // there are sub interfaces for our iterator. most will be implemented behind the scenes.
    }


    /// Hashmap <typeValue,typeKey> name = ?
    HashMap<String,String> capitals = new HashMap<>();

    // How to add to hashmao
    /// .put() method
    // NAME OF HASHMAP.put()







}
