// Java program to find the length of the longest substring 
// without repeating characters 
public class LongestUniqueSubseq{ 

	static final int NO_OF_CHARS = 256; 

	static int longestUniqueSubsttr(String str) 
	{ 
		int n = str.length(); 
		int cur_len = 1;                // length of current substring 
		int max_len = 1;                // result 
		int prev_index;                 // previous index 
		int i; 
		int visited[] = new int[NO_OF_CHARS]; 

		/*Initialize visited array as -1, -1 is used to indicate that char hasnt been visited yet*/
		for (i = 0; i < NO_OF_CHARS; i++) { 
			visited[i] = -1; 
		} 

		/* Mark first character as visited by storing the index of first character */
		visited[str.charAt(0)] = 0; 

		/* Start from the second character. First character is already processed (cur_len and max_len are initialized as 1, and visited[str[0]] is set */
		for (i = 1; i < n; i++) { 
            prev_index = visited[str.charAt(i)]; //eg ABCDE will give -1 since all r unique
            //System.out.println("PREV IND "+prev_index);


			/* If the current character is not present in the already processed substring or it is not part of the current NRCS, then do cur_len++ */
			if (prev_index == -1 || i - cur_len > prev_index) {
				cur_len++; 
                //System.out.println("CURR LEN "+cur_len);
            }
			/* If the current character is present in currently considered NRCS, then update NRCS to start from the next character of previous instance. */
			else { 
				/* Also, when we are changing the NRCS, we should also check whether length of the previous NRCS was greater than max_len or not.*/
				if (cur_len > max_len) 
					max_len = cur_len; 

                cur_len = i - prev_index; 
                //System.out.println("IN ELSE "+cur_len);
			} 

			// update the index of current character 
			visited[str.charAt(i)] = i; 
		} 

		// Compare the length of last NRCS with max_len and update max_len if needed 
		if (cur_len > max_len) 
			max_len = cur_len; 

		return max_len; 
	} 
	public static void main(String[] args) 
	{ 
		String str = "ABDEFGABEF"; 
		System.out.println("The input string is " + str); 
		int len = longestUniqueSubsttr(str); 
		System.out.println("The length of "+ "the longest non repeating character is " + len); 
	} 
} 