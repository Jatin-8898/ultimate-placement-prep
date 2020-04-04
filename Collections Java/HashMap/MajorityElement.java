import java.util.HashMap;
 class MajorityElement{
 	public static void main(String[] args) {
 		int a[] = new int[]{3,3,2,3,5,5,2,3,3};
        findMajority(a);
 	}

 	private static void findMajority(int a[]){
 		HashMap<Integer, Integer> map = new HashMap<>();

 		for (int i=0; i<a.length; i++) {
 			
 			if(map.containsKey(a[i])){
 				int count = map.get(a[i]) + 1;

 				if(count > a.length/2){
 					System.out.println("Majoirty element is: "+a[i]);
 					return;
 				}else{
 					map.put(a[i],count);
 				}

 			}else{
 				map.put(a[i],1);	
 			}
 		}
 		System.out.println("NO SUCH ELEMENT FOUND");
 	}


 }