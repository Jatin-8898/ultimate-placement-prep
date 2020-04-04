import java.io.File;
import java.util.LinkedList;
import java.util.Queue;

class BFSFileDirectory
{
	// Iterative function to traverse the given directory in Java using BFS
	public static void main(String[] args)
	{
		String rootDir = "../Mix";

		Queue<File> queue = new LinkedList<>();

		queue.add(new File(rootDir));   		// add root directory to the queue

        // loop until queue is empty - all files and directories present
        // inside the root directory are processed
		while (!queue.isEmpty())
		{
            System.out.println(queue);
		
			File current = queue.poll();    	// get next file/directory from the queue

			// get list of all files and directories in 'current'
			File[] listOfFilesAndDirectory = current.listFiles();

			// listFiles() returns non-null array if 'current' denotes a dir
			if (listOfFilesAndDirectory != null)
			{
				// iterate over the names of the files and directories in the current directory
				for (File file : listOfFilesAndDirectory)
				{
				
					if (file.isDirectory()) {
						queue.add(file);
					}
					else {  	                    
						System.out.println(file);   // if file denotes a file, print it
					}
				}
			}
		}
	}
}