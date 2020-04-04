public class Naive {
    public static void main(String[] args) {
        String str = "This is a test of string";
        String toSearch = "test";

        search(str, toSearch);
    }

    private static void search(String s1, String s2) {
        int N = s1.length();
        int M = s2.length();

        for (int i = 0; i <= (N - M); i++) {

            int j;
            for (j = 0; j < M; j++) {
                if (s1.charAt(i + j) != s2.charAt(j))
                    break;
            }

            if (j == M)
                System.out.println("PATTERN FOUND AT: "+ i);
        }
        System.out.println("PATTERN NOT FOUND REACHED THE END:");
        
    }
}