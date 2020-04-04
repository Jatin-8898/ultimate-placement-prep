import java.io.*;
import java.util.Scanner;  
public class LuckyNumber{

	public static void main(String[] args) {

	  int luckyNumber, secondLuckyNumber;
	  Scanner sc = new Scanner(System.in);

	  System.out.println("Give me a number between 0 and 100 to win a prize.");
	  luckyNumber = sc.nextInt();

	  if(hasLuckyNumber(luckyNumber)) {
	      System.out.println("Give me another number between 100 and 200.");
	      secondLuckyNumber = sc.nextInt();

	      if(hasSecondLuckyNumber(secondLuckyNumber)) {
	        System.out.println("We've got a winner!");
	      }
	      else {
	        System.out.println("Sad face");
	      }
	  }
	  else {
	    System.out.println("Unfortunatly, no prize");
	  }

	}

	public static boolean hasLuckyNumber(int luckyNumber){
	    if (luckyNumber > 20 && luckyNumber < 60) {
	        return true;
	    }else{
	        return false;
	    }
	}

	public static boolean hasSecondLuckyNumber(int secondLuckyNumber){
	    if (secondLuckyNumber > 140 && secondLuckyNumber < 160){
	        return true;
	    } else{
	        return false;
	    }
	}

	
}