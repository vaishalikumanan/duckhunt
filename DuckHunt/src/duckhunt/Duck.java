/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package duckhunt;

/**
 *
 * @author kumav1176
 */
import java.awt.Image;
import java.io.IOException;
import java.util.*;
import javax.imageio.ImageIO;

public class Duck{
    int speed;
    int length;
    //starts at left side of screen
    int xcoordinate = 0;
    //random for y coordinate
    Random rand = new Random();
    int ycoordinate;
    
    Image duck;
    

    
    public Duck(int s, int h, int r) throws IOException{
        speed = s;
        //h is the height of the screen, don't spawn in ground
        ycoordinate = rand.nextInt(h - 399);
        
        //size of duck is random, smaller ones more unlikely
        if(r % 3 == 0){
            duck = ImageIO.read(getClass().getResource("duck1small.png"));
            length = 110;
        }
        else{
            duck = ImageIO.read(getClass().getResource("duck1.png"));
            length = 240;
        }
    }
    public void move(){
        xcoordinate += speed;
    }
    public int getXCoordinate(){
        return xcoordinate;
    }
    public int getYCoordinate(){
        return ycoordinate;
    }
    public int getLength(){
        return length;
    }
    public Image getImage() throws IOException{
        return duck;
    }
}
