/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobil;
import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;
/**
 *
 * @author Cindy
 */
public class Mobil extends Panel{

    public void paint(Graphics g) {
        //mobil
        g.setColor(Color.blue);
        g.fill3DRect(200,250,360,180,true);
        g.setColor(Color.blue);
        g.fill3DRect(150,170,250,250,false);
        //ban
        g.setColor(Color.RED);
        g.fillArc(230,380,90,100,0,-180);
        g.fillOval(350,350,130,130);
    }
    
    public static void main(String[] args) {
       Frame f = new Frame ("Quiz2_PBO");
       Mobil hadiah= new Mobil();   
       f.add(hadiah);
       f.setSize(900,900);
       f.setVisible(true);
    }
    
}
