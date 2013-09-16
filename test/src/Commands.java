import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;



public class Commands {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Socket soc = new Socket("192.168.1.78", 1034);
			
			OutputStream out = soc.getOutputStream();
			InputStream in = soc.getInputStream();
			
			
			byte[] arrayOfByte = new byte[10000];
			
			out.write("sendai1.\r\n".getBytes());
			
			out.write(",G66\r\n".getBytes());
			out.flush();
			int j = 0;
			j = in.read(arrayOfByte);
			j = in.read(arrayOfByte);
			arrayOfByte = new byte[10000];
			j = in.read(arrayOfByte);
			
			
			
			
			String input = new String(arrayOfByte, 0, j).replace("\r", "").replace("\n", "").replace("ÿü", "").replace("17 Cmd: DoneFLAGUPDATE:063", "");
			
			
			
			System.out.println(input);
    		
			if(input.length()==63){
				System.out.println("apac");
				System.out.println(input.charAt(20));

			}else{
				System.out.println("g");

			}
			
			
		} catch (IOException e) {
			System.out.println("error");
		}
	}

}
