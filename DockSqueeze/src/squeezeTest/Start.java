package squeezeTest;

import java.awt.Image;
import java.awt.Point;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

import org.bff.squeezeserver.Player;
import org.bff.squeezeserver.Playlist;
import org.bff.squeezeserver.SqueezeServer;
import org.bff.squeezeserver.exception.ConnectionException;
import org.bff.squeezeserver.exception.SqueezeException;

public class Start {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	            SqueezeServer ss;
				try {
					ss = new SqueezeServer("192.168.1.141",9090,9000);
					System.out.println("is connected:" + ss.isConnected());
					createPlayer(ss);
				} catch (ConnectionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	           
				
		
	}

	
	public static void createPlayer(SqueezeServer ss) {
		
		
        List<Player> players = new ArrayList<Player>(ss.getAllPlayers());
        int x = 0;
        int y = 0;
        
        for (Player player : players) {
         
        	Image art = null;
        	String alb = null;
			String tit = null;
			String artist = null;
			String name = null;
			Playlist Nowplaying = null;
        	
    		try {
    			System.out.println("\t" + player.getName());
    			
    			Nowplaying = ss.getPlaylist(player);
    			
    			
    			URL url = new URL("http://192.168.1.141:9000/music/current/cover.jpg?player="+player.getId());
    			
    			art = ImageIO.read(url);
    			name = player.getName();
    			
    		} catch (MalformedURLException e1) {
    			// TODO Auto-generated catch block
    			e1.printStackTrace();
    			System.out.println("EERRRROOOORRRR1");
    		} catch (FileNotFoundException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    			System.out.println("EERRRROOOORRRR2");
    		}catch (IOException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    			System.out.println("EERRRROOOORRRR3");
    		} catch (SqueezeException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    			System.out.println("EERRRROOOORRRR4");
    		}
    			
    		
            
    		
			try {
				alb = Nowplaying.getCurrentAlbum();
				
			} catch (SqueezeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				alb = "null";
			}catch(NullPointerException e){
				
			}
			
			try {
				tit = Nowplaying.getCurrentTitle();
			} catch (SqueezeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				tit = "null";
			}catch(NullPointerException e){
				
			}
			try {
				artist = Nowplaying.getCurrentArtist();
			} catch (SqueezeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				artist = "null";
			} catch(NullPointerException e){
				
			}
			
			new HelloWorldSwing(name,art,tit,alb, artist).setpos(new Point(x,y));
			y+=50;
			x+=50;
            
            /*
            Bathroom2 (SB3)
        	Georgina (SBradio)
        	Lounge (SB2)
        	Bedroom (SB3)
        	Bathroom (SB3)
        	Conservatory (SB Rx)
        	. Samuel Bedroom (SB3)
        	Kitchen (SB2)
            */
            
        }

        Player player = players.get(0);

        System.out.println("Id:" + player.getId());
        try {
			System.out.println("Ip:" + player.getIp());
			System.out.println("Name:" + player.getName());
			System.out.println("Elapsed time:" + player.getElapsedTime());
		} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        

        
        
        
        
    }
	
}


