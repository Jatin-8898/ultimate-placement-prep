// Java program to demonstrate working of Comparator interface 
import java.util.*; 
import java.lang.*; 
import java.io.*; 

class Student 
{ 
	int rollno; 
    String  name, 
            address; 

	public Student(int rollno, String name, String address) 
	{ 
		this.rollno = rollno; 
		this.name = name; 
		this.address = address; 
	} 

	public String toString()    // Used to print student details in main() 
	{ 
		return this.rollno + " " + this.name + " " + this.address; 
	} 
} 

class  Sortbyroll implements Comparator<Student> 
{ 
	// Used for sorting in ascending order of roll number 
	public int compare(Student a, Student b) 
	{ 
		return a.rollno - b.rollno; 
	} 
} 

class Sortbyname implements Comparator<Student> 
{ 
	// Used for sorting in ascending order of roll number 
	public int compare(Student a, Student b) 
	{ 
		return a.name.compareTo(b.name); 
	} 
} 



class StudentMain 
{ 
	public static void main (String[] args) 
	{ 
		Student[] arr = {new Student(111, "bbbb", "london"), 
						new Student(131, "aaaa", "nyc"), 
						new Student(121, "cccc", "jaipur")}; 

		System.out.println("Unsorted"); 
		for (int i=0; i<arr.length; i++) 
			System.out.println(arr[i]); 

        
        Arrays.sort(arr, new Sortbyroll()); 

		System.out.println("\nSorted by rollno"); 
		for (int i=0; i<arr.length; i++) 
            System.out.println(arr[i]); 
            

        Arrays.sort(arr, new Sortbyname()); 

		System.out.println("\nSorted by name"); 
		for (int i=0; i<arr.length; i++) 
			System.out.println(arr[i]); 
	} 
} 
