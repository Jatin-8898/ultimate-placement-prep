public class Century{

    public static void main(String[] args) {
    
        int centuryFromYear(int year) {
        int century = 0;
        
         if (year <= 0){
            System.out.print("0 and negative is not allow" + "for a year"); 
         }
     
        // If year is between 1 to 100 it
        // will come in 1st century
        else if (year <= 100){
            century = 1;
            return century;
            //System.out.print("1st century\n");
        }
            
     
        else if (year % 100 == 0){
            century = year/100;
             return century;
            //System.out.print(year / 100 + " century");

        }
     
        else{
            century = year/100 + 1;
            return century;
            //System.out.print(year / 100 + 1 + " century");

        }
        return century;
    }
}
}