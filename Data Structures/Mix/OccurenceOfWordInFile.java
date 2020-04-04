import java.util.*;
import java.io.*;
class OccurenceOfWordInFile{
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the filename: ");
        String filename = scan.nextLine();
        System.out.println("Please enter a word: ");
        String wordname = scan.nextLine();

        int count = 0;
        try (LineNumberReader r = new LineNumberReader(new FileReader(filename))) {
            String line;
            while ((line = r.readLine()) != null) {
                for (String element : line.split(" ")) {
                    if (element.equalsIgnoreCase(wordname)) {
                        count++;
                        System.out.println("Word found at line " + r.getLineNumber());
                    }
                }
            }
        }
        System.out.println("The word " + wordname + " appears " + count + " times.");
        scan.close();
    }
}