import java.util.*;

class ElementPresent{
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(2);
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(4);

		List<List<Integer>> list = new ArrayList<List<Integer>>();
		list.add(l);

		int toFind  = 6;
		int index = 0;
		boolean flag = false;

		for(List<Integer> li: list){
			
			int size = li.size();
			for(int i=0; i<size; i++){

				int element = li.get(i);

				if(element == toFind){
					flag = true;
					index = i;
				}else{
					flag = false;
				}
			}
			if(!flag){
				System.out.println("ELEMENT FOUND AT LOC: " + index);
			}else{
				System.out.println("NOT");
			}

		}
	}
}