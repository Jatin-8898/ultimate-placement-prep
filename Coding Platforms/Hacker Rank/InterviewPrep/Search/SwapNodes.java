import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Node {
        int data;
        int depth;
        Node left, right;
        Node(int data, int depth){
            this.data = data;
            this.depth = depth;
        }
    }

public class Solution {
    public static void swapNodes(Node root, int K){
        /*      ITERATIVE METHOD
        Queue<Node> nodes = new LinkedList<Node>();
        nodes.offer(root);
        Node cur;
        while (!nodes.isEmpty()){
            cur = nodes.poll();
            if (cur.depth%K == 0){
                Node tmp = cur.left;
                cur.left = cur.right;
                cur.right = tmp;
            }
            if (cur.left != null) nodes.offer(cur.left);
            if (cur.right != null) nodes.offer(cur.right);
        }*/
        if (root != null){
            if (root.depth % K == 0){
                Node tmp = root.left;
                root.left = root.right;
                root.right = tmp;
            }
            swapNodes(root.left, K);
            swapNodes(root.right, K);
        }
    }
    
    public static void inOrder(Node root){
        if (root != null){
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }
    
    public static void print_nodes(Node root, int K){
        swapNodes(root, K);
        inOrder(root);
        System.out.println();
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Node root = new Node(1, 1);
        Node cur = root;
        
        Queue<Node> nodes = new LinkedList<Node>();
        nodes.offer(cur);
        
        while (N-->0){
            cur = nodes.poll();
            int leftData = sc.nextInt();
            int rightData = sc.nextInt();

            cur.left = (leftData == -1) ? null: new Node(leftData, cur.depth+1);
            cur.right = (rightData == -1) ? null: new Node(rightData, cur.depth+1);
            
            if (cur.left != null && cur.left.data!= -1) 
                nodes.offer(cur.left);
            if (cur.right != null && cur.right.data!=-1) 
                nodes.offer(cur.right);
        }
        int T = sc.nextInt();
        while (T-->0){
            int K = sc.nextInt();
            print_nodes(root, K);
        }
    }
}
/*

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    
    static int[][] swapNodes(int[][] indexes, int[] queries) {
       

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scanner.nextLine().trim());
        int[][] indexes = new int[n][2];

        for (int indexesRowItr = 0; indexesRowItr < n; indexesRowItr++) {
            String[] indexesRowItems = scanner.nextLine().split(" ");

            for (int indexesColumnItr = 0; indexesColumnItr < 2; indexesColumnItr++) {
                int indexesItem = Integer.parseInt(indexesRowItems[indexesColumnItr].trim());
                indexes[indexesRowItr][indexesColumnItr] = indexesItem;
            }
        }

        int queriesCount = Integer.parseInt(scanner.nextLine().trim());

        int[] queries = new int[queriesCount];

        for (int queriesItr = 0; queriesItr < queriesCount; queriesItr++) {
            int queriesItem = Integer.parseInt(scanner.nextLine().trim());
            queries[queriesItr] = queriesItem;
        }

        int[][] result = swapNodes(indexes, queries);

        for (int resultRowItr = 0; resultRowItr < result.length; resultRowItr++) {
            for (int resultColumnItr = 0; resultColumnItr < result[resultRowItr].length; resultColumnItr++) {
                bufferedWriter.write(String.valueOf(result[resultRowItr][resultColumnItr]));

                if (resultColumnItr != result[resultRowItr].length - 1) {
                    bufferedWriter.write(" ");
                }
            }

            if (resultRowItr != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
*/