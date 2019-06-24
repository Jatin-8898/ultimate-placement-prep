import java.util.*;
import java.io.*;

class SeatingArrangement{
	/*
	In a large gathering, the attendees were divided into groups. Each group had a two-alphabet code where each alphabet is between 'A' and 'Z' inclusive. All the attendees were supposed to sit in the lexicographical order of their respective group, i.e. group 'AA' was supposed to sit before 'AB' and so on. Suppose there are 10 seats and there are two groups, 'AA' and 'AB' with 4 and 6 attendees in each group respectively. Group 'AA' members can sit from seat number 0 - 3 and 'AB' members can sit between 4 - 9. 

	However, the attendees sat randomly. The management has now decided to check randomly, and fine those who are not sitting in the range of seats alloted to their group. Suppose if an AB group member is sitting on seat number 3, he will be fined but any AB member in the seat numbers 4 - 9 won't be.

	Input
	1.The first input will be an integer N. (1 <= N <= 2000000) N lines follow. The ith line describes the two-alphabet group code of the person sitting on the ith seat. 
	2.The following line would have the integer K, which denotes the number of people to be checked. (1 <= K <= 1000) 
	3.K lines follow. On the ith line, the input is an integer which lies between 0 and N-1 inclusive. The person sitting at the seat number equal to the ith integer would be inspected if he/she is sitting in the range of seats allotted to the group to which he/she belongs. 
	Output
	Process the K integers sequentially. Print "NO" for the ith integer (amongst the K integers) if the person sitting at the seat number equal to that value belongs to his/her group's seating plan, else print "YES". Print every result on a new line.

	Example
	Input:
	5
	AA
	AB
	AB
	AC
	ZZ
	3
	0
	1
	2
	Output:
	NO
	NO
	NO
	ExplanationEverybody is sitting in the correct positions. No one is fined. 




	Input:
	5
	ZZ
	AC
	AB
	AA
	AA
	3
	0
	1
	2
	Output:
	YES
	YES
	NO
	ExplanationNo one is sitting in the correct positions, except one person from the group AB. Anyone else who is inspected is fined. 
*/
	public static void main(String[] args) throws IOException {

		int [][] positions = new int [26*26][2];	//2d array

		 for (int i=0; i <26*26; i++ ){
            positions[i][0] = 0;		//00 10 20 30 ... initialised to 0
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("ENTER THE NUMBER OF PEOPLE ");
        int numPeople = Integer.parseInt(br.readLine());	//number of people
        int[] seated = new int[numPeople];					//new array of seated

        String group;
        int value;

        for (int i=0; i<numPeople; i++) {

        	group = br.readLine();		//Scan the group eg AA
        	//System.out.println(group + " GROUP");

        	value = value(group);		//make the group ie AA should return 0
        	//System.out.println(value + " VAL");

        	seated[i] = value;			//Store the value ie 0 in seated Array
        	positions[value][0]++;		//and increment the postions array 
        	//System.out.println(positions[value][0]+ " POS"); 	//this inshort returns the count of the value eg AA occurs 2 times so this stores the 2.
        }

        //create sums
        positions[0][1] = 0;
        //go till 675 since z-a returns 675
        for (int i=1; i<=675; i++) {
        	positions[i][1] = positions[i-1][0] + positions[i-1][1];
        	//System.out.print(positions[i][1] + " ");
        }

        System.out.println("Enter the number of people to be checked");
        int numToBeChecked = Integer.parseInt(br.readLine());
        int personToBeChecked ;
        int groupOfPerson ; 

        for (int j=0; j<numToBeChecked; j++) {
        	System.out.println("Enter the people one by one from 0");
        	personToBeChecked = Integer.parseInt(br.readLine());
        	groupOfPerson = seated[personToBeChecked];

        	System.out.println("personToBeChecked " + personToBeChecked);
            System.out.println("positions[groupOfPerson][0]   " +positions[groupOfPerson][0]);
            System.out.println("positions[groupOfPerson][1]   " +positions[groupOfPerson][1]);

            if(positions[groupOfPerson][1] <= personToBeChecked && 
              (positions[groupOfPerson][1] + positions[groupOfPerson][0] > personToBeChecked)){
            	
            	System.out.println("NO\n");
            }
            
            else{
            	System.out.println("YES\n");
            }


        }


	}

	static int value(String s){
		//This func gives the diff of the letters 
		//Eg AA so returns 0 since 65-66 = 0 
		//Eg AB so returns 1 since 65-66 = 1

        return ((s.charAt(0) - 'A') * 26 + (s.charAt(1) - 'A'));
    }


}