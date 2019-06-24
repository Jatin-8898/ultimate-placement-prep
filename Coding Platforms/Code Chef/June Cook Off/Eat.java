import java.util.*;
class Eat{
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());

        while(t > 0){


            int n = in.nextInt();
            int m = in.nextInt();

            Map<Integer, Long> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                int day = in.nextInt();

                if (map.containsKey(day)) 
                    map.put(day,  Math.max(map.get(day), in.nextLong()));
                else 
                    map.put(day, in.nextLong());
            }

            long max1 = 0, max2 = 0;

            for (long val : map.values()) {
                if (val > max1) {
                    max2 = max1;
                    max1 = val;
                } else if (val > max2) {
                    max2 = val;
                }
            }

            System.out.println(max1 + max2);  
            t--;
        }
        in.close();
    }
}


/* 
            int n  = (Integer)s.nextInt();
            int m  = (Integer)s.nextInt();
        
            HashMap<Long, Long> hash_map = new HashMap<Long, Long>(); 

            for (int i = 0; i < n; i++) {
                Long a = s.nextLong();
                Long b = s.nextLong();
                hash_map.put(a, b);    
            }
        
           // System.out.println("Initial Mappings are: " + hash_map); 
        
            Long maxValueInMap = (Collections.max(hash_map.values())); 
            //System.out.println(maxValueInMap);
        
            Long toRem = 0L;
            for (Map.Entry<Long, Long> entry : hash_map.entrySet()) {  
                if (entry.getValue()==maxValueInMap) {
                    toRem = entry.getKey();
                }
            }
        
            hash_map.remove(toRem);
            Long maxValueInMap2 = (Collections.max(hash_map.values())); 
            //System.out.println(maxValueInMap2);     

            System.out.println(maxValueInMap + maxValueInMap2);   */