import java.util.*;

class Partition {
    public static void main(String args[]) throws Exception {

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();
        String st = s.nextLine();
        binary(st, 0, st.length(), t);
        s.close();
        // System.out.println("Hi, " + name + ".");
    }

    public static void binary(String st, int low, int high, int t) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        HashMap<Character, Integer> rmap = new HashMap<Character, Integer>();
        HashSet<Character> set = new HashSet<>();
        int mid = (low + high) / 2;
        int part = 0;
        int count = 0;

        for (int i = 0; i < mid; i++) {

            if (map.containsKey(st.charAt(i))) {
                Integer val = map.get(st.charAt(i)) + 1;
                map.put(st.charAt(i), val);

            } else {
                map.put(st.charAt(i), 1);
            }
        }
        System.out.println(map);

        for (int i = mid; i < st.length(); i++) {
            if (rmap.containsKey(st.charAt(i))) {
                Integer val = rmap.get(st.charAt(i)) + 1;
                rmap.put(st.charAt(i), val);

            } else {
                rmap.put(st.charAt(i), 1);
            }
        }
        System.out.println(rmap);

        for (int i = 0; i < st.length(); i++) {
            set.add(st.charAt(i));
        }
        // System.out.println(set);

        for (int i = 0; i < st.length(); i++) {

            if (map.containsKey(st.charAt(i)) && rmap.containsKey(st.charAt(i))) {
                int c1 = map.get(st.charAt(i));
                int c2 = rmap.get(st.charAt(i));

                if (c1 == c2) {
                    count++;
                }
                if (count == t) {
                    part++;
                }

            } else {
                // binary(st, low, mid - 1);
            }
        }
        System.out.println("COUNT " + count + " PART " + part);

    }
}