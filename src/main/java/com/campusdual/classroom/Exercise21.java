package com.campusdual.classroom;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise21 {

    private static final String [] ELEMENTS = { "ELEMENT KPRBC", "ELEMENT YPBTM", "ELEMENT AADXU", "ELEMENT RXCGJ", "ELEMENT WYMVD", "ELEMENT WFGEJ", "ELEMENT TYGBS", "ELEMENT MAPTK", "ELEMENT GJXVE", "ELEMENT BAFGL"};

    public static Set<String> createHashSet() {
        Set<String> set = new HashSet<>();
        for(String element : ELEMENTS){
            set.add(element);
        }
        return set;
    }

    public static Set<String> createTreeSet() {
        Set<String> set = new TreeSet<>();
        for(String element : ELEMENTS){
            set.add(element);
        }
        return set;
    }

    private static void printSet(Set<String> customSet) {
        for(String element : customSet){
            System.out.println(element);
        }
    }


    public static boolean addElementToSet(Set<String> set, String elementToAdd) {

        return set.add(elementToAdd);
    }

    public static void main(String[] args) {
        Set<String> hashSet = createHashSet();
        Set<String> treeSet = createTreeSet();
        printSet(hashSet);
        printSet(treeSet);
        addElementToSet(hashSet,"AAA");
        addElementToSet(treeSet,"AAA");
        printSet(hashSet);
        printSet(treeSet);
    }

}
