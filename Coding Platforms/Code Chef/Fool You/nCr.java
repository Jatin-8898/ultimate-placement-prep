import java.util.*;

class nCr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        // hexadecimalToDecimal(s);
        hexaToDec(s);
        sc.close();
    }

    public static void hexaToDec(String hex) {
        String digits = "0123456789ABCDEF";
        hex = hex.toUpperCase();
        int val = 0;
        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            int d = digits.indexOf(c);
            val = 16 * val + d;
        }
        System.out.println(val);
    }

    public static void hexadecimalToDecimal(String hexVal) {
        int len = hexVal.length();

        // Initializing base value to 1, i.e 16^0
        int base = 1;

        int dec_val = 0;

        // Extracting characters as digits from last character
        for (int i = len - 1; i >= 0; i--) {
            // if character lies in '0'-'9', converting it to integral 0-9 by subtracting 48
            // from ASCII value
            if (hexVal.charAt(i) >= '0' && hexVal.charAt(i) <= '9') {
                dec_val += (hexVal.charAt(i) - 48) * base;

                // incrementing base by power
                base = base * 16;
            }

            // if character lies in 'A'-'F' , converting it to integral 10 - 15 by
            // subtracting 55 from ASCII value
            else if (hexVal.charAt(i) >= 'A' && hexVal.charAt(i) <= 'F') {
                dec_val += (hexVal.charAt(i) - 55) * base;

                // incrementing base by power
                base = base * 16;
            }
        }
        System.out.println(dec_val);
    }
}