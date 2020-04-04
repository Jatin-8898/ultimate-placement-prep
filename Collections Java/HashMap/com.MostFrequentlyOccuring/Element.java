import java.util.*;
import java.util.HashMap;


/*This program takes the array and we need to find the Most frequent element in it 
in the descending order and if the frequency then print in the order they arrived*/


class Element implements Comparable<Element>
{
    private final int index;
    private int frequency;


    //Constructor to initialise
    Element(int index)
    {
        this.index = index;
        this.frequency = 1;
    }


    /*Since we implemented the Abstract class Comparable we need to give body to this ()*/
    @Override
    public int compareTo(Element o)
    {
    	//Find k by the got element - our frequncy which is 1
        int k = o.frequency - this.frequency;
        if(k != 0) 	//means something is there so return
        	return k;
        else
            return this.index - o.index;
    }



	private static void sortByFrequency(int[] a)
	{
	    Map<Integer, Element> map = new HashMap<Integer, Element>();
	    for(int i=0; i<a.length; i++)
	    {
	        if(map.get(a[i]) == null){	//When we r doing it for first time
	            map.put(a[i], new Element(i));
	        }
	        else{
	            Element e = map.get(a[i]);	//Create new obj 
	            e.frequency++;				//Increase the frequency coz we got ith element again
	        }
	    }

	    Set<Integer> set = map.keySet();	//Make keySet of the map.
	   // System.out.println(set);

	    TreeSet<Element> treeSet = new TreeSet<Element>();	//insert it into the TreeSet
	    for(int i : set){
	        treeSet.add(map.get(i));
	    }


	    for(Element e : treeSet)
	    {
	        for(int i=0; i < e.frequency; i++)
	        {
	            System.out.print(a[e.index] + " ");
	        }
	    }
	}



	public static void main(String[] args)
	{
	    int[] a =  {1, 1 ,2 ,3,3,3,3 ,4,4,4,  5,5,5,5,5,5, 6,7,8,12,9,15,16};
	    sortByFrequency(a);
	}

}