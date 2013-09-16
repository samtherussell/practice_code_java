import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.SocketException;
import java.util.Scanner;

import org.apache.commons.net.telnet.TelnetClient;


public class Client {
	
	static TelnetClient telnet = new TelnetClient();
	static String server = "192.168.1.78";
	static int port = 1034;
	static InputStream in;
	static PrintStream out;
	static String password = "sendai1.";
	
	public static void main(String[] s){
		
		try {
			telnet.connect(server, port);
			in = telnet.getInputStream();
			out = new PrintStream(telnet.getOutputStream());
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		readUntil("Password: ");
		write(password);
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0;i<10;i++){
		int state = scanner.nextInt();
		
		if(state ==1)
			write(",O2F00");
		
		if(state == 0)
			write(",O2D00");
		}
	}
	
	public static String readUntil(String pattern) {
		try {
			char lastChar = pattern.charAt(pattern.length() - 1);
			StringBuffer sb = new StringBuffer();
			boolean found = false;
			char ch = (char) in.read();
			while (true) {
				System.out.print(ch);
				sb.append(ch);
				if (ch == lastChar) {
					if (sb.toString().endsWith(pattern)) {
						return sb.toString();
					}
				}
				ch = (char) in.read();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void write(String value) {
		try {
			out.println(value);
			out.flush();
			System.out.println(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
