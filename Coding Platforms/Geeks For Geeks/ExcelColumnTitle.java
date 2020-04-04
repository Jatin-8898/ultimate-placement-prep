class ExcelColumnTitle{
	public static void main(String[] args) {
        String s = "AA";
        System.out.println( titleToNumber(s));
    }
    
    public static int titleToNumber(String s) {
                
        int result  = 0;
        
        for (int i = 0; i < s.length(); i++){   //for s = A => 65-65=0 => Add 1 to it
    
            result *= 26;                       //For AA = 1*26 = 26 + 1 = 27
            result += ((s.charAt(i) - 'A') + 1);    
        }
    
        return result;
    }

}