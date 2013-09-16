package squeezeTest;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;

import javax.swing.*;        

public class HelloWorldSwing{
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event.
     * 
     * -dispatching thread.
     */
	
	JFrame frame;
	
    public HelloWorldSwing(String name,Image image,String track, String alb, String arti) {
        //Make sure we have nice window decorations.
        JFrame.setDefaultLookAndFeelDecorated(true);

        //Create and set up the window.
        frame = new JFrame(name);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        JPanel p = new JPanel();
        image = image.getScaledInstance(200, 200, 0);
        
        //Display the window.
        ImageIcon ib = new ImageIcon();
        ib.setImage(image);
        JButton but = new JButton(ib);
        p.add(but);
        
        JLabel t = new JLabel("track: "+track+"||");
        p.add(t);

        JLabel al = new JLabel("album: "+alb+"||");
        p.add(al);
        
        JLabel artist = new JLabel("artist: "+arti);
        p.add(artist);
        
        frame.add(p);
        frame.pack();
        frame.setVisible(true);
    }

    public void setpos(Point p){
    	frame.setBounds(p.x, p.y, frame.getWidth(), frame.getHeight());
    }
   
}