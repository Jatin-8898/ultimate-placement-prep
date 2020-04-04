import java.io.*;
static class Wrapper{

	static class ListNode {
        int val;
        ListNode next;
        ListNode(int x){
           val = x; 
       	}
     }

	public static  int[] stringToIntegerArray(String s){
		s = s.trim();
		s = s.substring(1, s.length()-1);

		if(s.length() == 0)
			return new int[0];

		String[] parts = s.split(",");
		int[] output = new int[parts.length];
		
		for (int i=0; i<parts.length; i++) {
			String part = parts[i].trim();
			output[i] = Integer.parseInt(part);
			
		}
		return output;
	}

	public static ListNode stringToListNode(String input){
		//generate array from the input
		int[] nodeValues = stringToIntegerArray(input);

		//Now convert the list into the Linked list
		ListNode dummyRoot = new ListNode(0);
		ListNode ptr = 	dummyRoot;
		for(int item: nodeValues){
			ptr.next = new ListNode(item);
			ptr  = ptr.next;
		}
		return dummyRoot.next;

	}

	public  void printLinkedList(ListNode node){
		while(node !=null && node.next != null){
			System.out.print(node.val+"->");
			node = node.next;
		}
		if(node != null)
			System.out.println(node.val);
		else
			System.out.println("Empty LinkedList");
	}


}

public class LinkedList{
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line = in.readLine()) != null){
			ListNode node = Wrapper.stringToListNode(line);
			Wrapper.printLinkedList(node);
		}

	}

}