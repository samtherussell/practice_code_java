import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/*import java.io.*;
import java.net.*;
import java.util.*;
		
	public class postto{

	public static void main (String args[]) {
		String urlString = "http://tygarwen.no-ip.org:5307/HVTableStatus.html";
		String user = "meister";
		String pass = "ansi1.";
		fetchURL(urlString, user,pass);
		}
	

	private static void fetchURL (String urlString,String user,String pass) {	

	try {
	URL url;
	URLConnection urlConn;
	DataOutputStream printout;
	DataInputStream input;

	Properties sysProperties = System.getProperties();

	sysProperties.put("proxyHost", "proxy.cyberway.com.sg");
	sysProperties.put("proxyPort", "8080");
	sysProperties.put("proxySet", "false");
	url = new URL (urlString);
	urlConn = url.openConnection();
	urlConn.setDoInput (true);

	urlConn.setDoOutput (true);

	urlConn.setUseCaches (false);

	urlConn.setRequestProperty ("Content-Type", "application/x-www-form-urlencoded");

	printout = new DataOutputStream (urlConn.getOutputStream ());


	String content = "USERNAME=" + URLEncoder.encode (user) + "&PASSWORD=" + URLEncoder.encode (pass);

	printout.writeBytes (content);
	printout.flush ();
	printout.close ();

	input = new DataInputStream (urlConn.getInputStream ());
	FileOutputStream fos=new FileOutputStream("postto.txt");
	String str;
	while (null != ((str = input.readLine())))
	{

	if (str.length() >0)
	{
	fos.write(str.getBytes());
	fos.write(new String("\n").getBytes());
	}
	}
	input.close ();
	}
	catch(MalformedURLException mue){ System.out.println (mue);}
	catch(IOException ioe){ System.out.println (ioe);}
	}
	
	}*/
	public class postto{
		public static void main(String[] args){
			
		
	try {
    // Create a URL for the desired page
    URL url = new URL("www.google.com");

    // Read all the text returned by the server
    BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
    String str;
    while ((str = in.readLine()) != null) {
        // str is one line of text; readLine() strips the newline character(s)
    	System.out.println(str);
    }
    in.close();
} catch (MalformedURLException e) {
} catch (IOException e) {
}

		}
	}
