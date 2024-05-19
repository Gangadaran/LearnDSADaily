package learn_java;

import java.util.Hashtable;

public class LearnHashTable {
    public static void main(String[] args) {
        Hashtable<String, Integer> table = new Hashtable<>();
        table.put("Gangadaran",57);
        table.put("Meena",84);
        table.put("Radha",98);
        table.put("Ponnammal",100);


        for(String key : table.keySet()){
            System.out.println(Math.abs(key.hashCode()%10)+"\t"+key +"\t"+ table.get(key));
        }

    }
}
