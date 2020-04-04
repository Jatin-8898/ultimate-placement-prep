class StringRotate{
    public static void main(String[] args) {
        int n = 4;

        String str= "helloworld";
        
        String l = str.substring(0,n);
        String r = str.substring(n);
        
        System.out.println( r + l );      
        
        System.out.println("Manual way of doing");
        System.out.println(rotateString(str, 4));
    }



    static public String rotateString(String input, int times) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            if (i < times)
                sb.append(input.charAt(i));
            else
                sb.insert(i-times, input.charAt(i));
        }
        
        return sb.toString();
    }
}



