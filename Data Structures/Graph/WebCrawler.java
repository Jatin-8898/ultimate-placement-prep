//package com.webCrawler;
import java.util.*;
import java.net.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class WebCrawler{

	private Queue<String> queue;
	private List<String> discoveredWebsiteList;

	public WebCrawler(){

		//We are instatianting queue as a Linked list
		this.queue = new LinkedList<>();
		//And an arraylist of the discovered websites
		this.discoveredWebsiteList = new ArrayList<>();
	}


	public void discoverWeb(String root){
		this.queue.add(root);		/*add in queue*/
		this.discoveredWebsiteList.add(root);	/*add in ArrayList*/


		while( !queue.isEmpty()){
			String v = this.queue.remove();		/*remove it from the queue*/
			String rawHtml = readURL(v);		/*Call to func*/

			String regexp  = "http://(\\w+\\.)*(\\w+)";		/*Regex*/
			Pattern pattern = Pattern.compile(regexp);	
			Matcher matcher = pattern.matcher(rawHtml);		/*see if it matches*/

			while( matcher.find() ){			/*While it has more urls*/

				String actualUrl = matcher.group();		/*make group*/

				if( !discoveredWebsiteList.contains(actualUrl)){	/*if doesnt contains*/

					discoveredWebsiteList.add(actualUrl);		/*then add it to AL*/
					System.out.println("Website has been added " + actualUrl);
					queue.add(actualUrl); 					
				}
			}	
		}
	}


	private String readURL(String v){
		String rawHtml = "";
		
		try{
			URL url = new URL(v);
			//with this url openStream
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
			String inputLine = "";

			while( (inputLine = in.readLine()) != null){
				rawHtml +=inputLine;
			}

			in.close();

		}catch(Exception e){
			e.printStackTrace();
		}

		return rawHtml;

	}



	public static void main(String[] args){

	 	WebCrawler crawler = new WebCrawler();

	 	//Pass the name of the webite you want to crawl upon
	 	String rootUrl = "http://www.geeksforgeeks.com";
	 	crawler.discoverWeb(rootUrl);
	 }


 }