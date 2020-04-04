import java.util.*;
import java.io.*;
import java.net.*;

class UrlChecker {
    public static void main(String[] args) {
        String s = "httpsunrurrururururuhi"; // Expected http://sun.ru/hi
        String st = "ftphellodomainnamerugfgf" ; //Expected ftp://sun.ru/hi
        generateUrl(s);
        generateUrl(st);
    }

    private static void generateUrl(String st) {
        StringBuffer s = new StringBuffer(st);
        StringBuffer sb = new StringBuffer();

        int r = s.lastIndexOf("r") ;
            
        if (r != -1)
            s.replace(r, r+2, ".ru/");

        if(s.charAt(0) == 'h') 
            s.replace(0, 4, "http://");

        if(s.charAt(0) == 'f') 
            s.replace(0, 3, "ftp://");

        for (int i = 0; i < s.length(); i++) 
            sb.append(s.charAt(i));

        System.out.println(sb.toString());
    }
}