import java.io.File;

class DFSFileDirectory
{
	// Recursive function to traverse the given directory in Java using DFS
	public static void listFilesRecursive(File root)
	{
		
		File[] listOfFilesAndDirectory = root.listFiles();

		// listFiles() returns non-null array if root denotes a directory
		if (listOfFilesAndDirectory != null)
		{
			for (File file : listOfFilesAndDirectory)
			{
				
				if (file.isDirectory()) {
					listFilesRecursive(file);
				}
				
				else {
					System.out.println(file);
				}
			}
		}
	}

	public static void main(String args[])
	{
		// Root directory
		String dir = "../Mix";
		File rootDir = new File(dir);

		// Recursively print all files present in root directory
		listFilesRecursive(rootDir);
	}
}