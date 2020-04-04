import java.util.*;

public class Frequency {

    public static void main(String[] args) {
        String[] x = {"Cheese", "Pepperoni", "Cheese" , "Pepperoni"};

        Map<String, Integer> m = new HashMap<String, Integer>();

        // Initialize frequency table from command line
        for (String a : x) {
            Integer freq = m.get(a);
            m.put(a, (freq == null) ? 1 : freq + 1);
        }
        
        System.out.println(m.size() + " distinct words:");
        System.out.println(m);
    }

}