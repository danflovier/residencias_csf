/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package residencias;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

/**
 *
 * @author danflovier
 */
public final class SplashScreen {
    // Splashscreen
    final java.awt.SplashScreen splash;
  
    // Text shown on the splashscreen while it's loading
    final String[] text = {"libraries..." ,"basic configuration...", "users...",
                          "fonts...","backgrounds..","files...","forms...","buttons...","properties...",
                          "images...","connection with MySQL...","Daniela Fj...","Horacio Rc..." , "Fer As...", "Joan Gr",
                          "updates..." ,"server...","...","...","...","...","...","...","...","...","...","...","...","...","...",
                          "...","...","...","...","...","...","...","...","...","...","...","...","...","...","...","...","...","...","...","..."};

    public SplashScreen() {
        splash = java.awt.SplashScreen.getSplashScreen();
    }

    public void showSplashScreen(){
       
        if (splash != null){
            Graphics2D g = splash.createGraphics();
            
            for(int i=1; i<text.length; i++){                           
                // Background color
                g.setColor(new Color(3,169,244)); 
                
                // Erase the old string
	        g.fillRect(310,454,250,30); 
                
                // Text color of the string
                g.setColor(Color.white);
                
                // Set Font of the String
                g.setFont(new Font("Segoe UI Light", Font.PLAIN, 15)); 
                
                // Show loading text
                g.drawString("Loading "+text[i-1]+"...", 310, 474);                
                
                // Color of progess bar
                g.setColor(Color.white);
                
                // Fill the progress bar
                g.fillRect(152, 434,(i*417/text.length), 4); 
                            
                // Make sure the splashscreen is displayed
                splash.update();
                
                // Time of the progress bar in miliseconds
		try {
		 Thread.sleep(100);
		} catch(InterruptedException e) { }
            }
	   splash.close();
	}
        // Show the Login form
         try {
             new Login().setVisible(true);
         }
	catch (Exception e) {
            System.out.println(e.getMessage());
        }
   }
    
}
