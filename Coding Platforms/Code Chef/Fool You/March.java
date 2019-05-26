import java.util.*;

class March {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "1");
        map.put(1, "3");
        map.put(2, "3");
        map.put(3, "12");
        map.put(4, "12");
        map.put(5, "60");
        map.put(6, "540");
        map.put(7, "1080");
        map.put(8, "6480");
        map.put(9, "32400");
        map.put(10, "97200");
        map.put(11, "486000");
        map.put(12, "3888000");
        map.put(13, "34992000");
        map.put(14, "244944000");
        map.put(15, "2204496000");
        map.put(16, "6613488000");
        map.put(17, "13226976000");
        map.put(18, "39680928000");
        map.put(19, "317447424000");
        map.put(20, "1269789696000");
        map.put(21, "7618738176000");
        map.put(22, "15237476352000");
        map.put(23, "91424858112000");
        map.put(24, "365699432448000");
        map.put(25, "1097098297344000");
        map.put(26, "3291294892032000");
        map.put(27, "26330359136256000");
        map.put(28, "78991077408768000");
        map.put(29, "157982154817536000");
        map.put(30, "1105875083722752000");
        map.put(31, "9952875753504768000");

        if (map.containsKey(n)) {
            String a = map.get(n);
            System.out.println(a);
        }

        s.close();
    }
}
