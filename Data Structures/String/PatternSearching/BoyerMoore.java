import java.util.*;
public class BoyerMoore{
    
    private String text;
    private String pattern;
    private Map<Character,Integer> misMatchTable;

    /* Constructor for initialsing the stuffs */
    public BoyerMoore(String text, String pattern){
        this.text = text;
        this.pattern = pattern;
        this.misMatchTable = new HashMap<>();
    }
    
    public void computeShifts(){

        int lengthOfPattern = this.pattern.length();

        for(int index = 0; index<lengthOfPattern; index++){

            char actualChar = this.pattern.charAt(index);   //Get the current char

            /* Compute the shift by taking max of (1, len-index-1) */
            int maxShift = Math.max(1,  lengthOfPattern - index - 1);

            this.misMatchTable.put(actualChar, maxShift);   //insert in map
        }
    }

    public int search(){
        int lengthOfPattern = this.pattern.length();
        int lengthOfText = this.text.length();
        int numOfSkips = 0;

        //IN naive we incremented i++ here we r skipping,ie efficient algo
        for(int i=0; i<(lengthOfText-lengthOfPattern); i+=numOfSkips){

            numOfSkips = 0;

            //We r travelling from right to left in pattern str, eg: t
            for(int j = lengthOfPattern-1; j>=0; j-- ){

                //if mismatch eg: s & t, see the mismatchTable
                if(pattern.charAt(j) != text.charAt(i+j)){

                    //If the char is present in the mismatch table
                    if(this.misMatchTable.get(text.charAt(i+j)) != null){

                        numOfSkips = this.misMatchTable.get(text.charAt(i+j));
                        break;

                    }
                }else{//if char not present in mismatchtable INC by len of Pattern
                    numOfSkips = lengthOfPattern;
                    break;
                }
            }

            if(numOfSkips == 0) //Means we found the pattern
                return i;
        }

        return lengthOfText;
    }
    
    public static void main(String[] args) {
        String text = "This is a test";
        String pattern = "test";

        BoyerMoore obj = new BoyerMoore(text,pattern);
        obj.computeShifts();
        System.out.println(obj.search());

    }

}