import java.util.Random;
/**
 * The space station moves diagonally from upper-left to lower right. It is
 * green on the first orbit (the first time it moves on a diagonal), yellow
 * on the second orbit, and red thereafter until a new refueling operation
 * begins.
 * 
 * @author Carl Singer, Brian Howard, David Maharry
 * @version September 2004
 * @version September 2005, revised by Carl Singer
 * @version September 2006, revised by Carl Singer
 */
public class SpaceStation
{
  private Diamond spaceStation;
  private Canvas canvas;
  private Diamond diamond1;
  private Diamond diamond2;
  private Diamond diamond3;
  private Diamond diamond4;  
  private Diamond diamond5;
  private Diamond diamond6;
  private Diamond diamond7;  
  private Diamond diamond8;
  private Diamond diamond9;
  private Diamond diamond10;
  private Diamond diamond11;
  private Diamond diamond12;
  private Diamond diamond13;  
  private Diamond diamond14;
  private Diamond diamond15;
  private Diamond diamond16;
  private Diamond diamond17;
  private Diamond diamond18;
  private Diamond diamond19;
  private Diamond diamond20;
  private Diamond diamond21;
  private Diamond diamond22;
  private Diamond diamond23;
  private Diamond diamond24;
  private Diamond diamond25;
  private int initXPosition; // where to start the shuttle (a random x-coordinate
                             // in the canvas boundary
  private int initYPosition; // the initial y-coordinate is always sero
  private int xDistance;     // the distance to move in the x direction
  private int yDistance;     // the distance to move in the y direction
  private int orbitCount;    // the number of orbits completed, used for color change control
  private Random r;          // a random number generator
  
/**
 * Creates a space shuttle as a Diamond object at a random position at the top of
 *    the simulation window. Once the space station is initialized it should begin
 *    to orbit.
 * 
 * @param canvas the canvas on which to render the space station
 */
  public SpaceStation(Canvas simCanvas)
  {
      canvas = simCanvas;
      spaceStation = new Diamond(simCanvas);
      spaceStation.changeSize(50,80);
      r = new Random(); // creating random object
      initXPosition = r.nextInt(canvas.getWidth() - 100); // set the value of xPosition randomly from  to canvas - 100
      initYPosition = 0; // set the value of yPosition to 0
      spaceStation.changeColor("green"); // change color of spaceStation to green by changeColor method
      spaceStation.makeVisible(); // make spaceStation visible by makeVisible method
      spaceStation.moveTo(initXPosition, initYPosition); // using moveTo() method to moce spaceStation to its initial X and Y position
      
      /* the block of code below is to draw the word "NASA" in the canvas background */
      diamond1 = new Diamond(simCanvas);
      diamond1.changeColor("white");
      diamond1.moveTo(250,170); 
      diamond1.makeVisible();
      diamond1.changeSize(15,15);
      diamond2 = new Diamond(simCanvas);
      diamond2.changeColor("white");
      diamond2.makeVisible();
      diamond2.moveTo(250, 200);
      diamond2.changeSize(15,15);
      diamond3 = new Diamond(simCanvas);
      diamond3.changeColor("white");
      diamond3.makeVisible();
      diamond3.moveTo(250, 230); 
      diamond3.changeSize(15,15);
      diamond7 = new Diamond(simCanvas);
      diamond7.changeColor("white");
      diamond7.makeVisible();
      diamond7.moveTo(265, 185); 
      diamond7.changeSize(15,15);
      diamond8 = new Diamond(simCanvas);
      diamond8.changeColor("white");
      diamond8.makeVisible();
      diamond8.moveTo(280, 215); 
      diamond8.changeSize(15,15);
      diamond9 = new Diamond(simCanvas);
      diamond9.changeColor("white");
      diamond9.makeVisible();
      diamond9.moveTo(295, 170); 
      diamond9.changeSize(15,15);
      diamond5 = new Diamond(simCanvas);
      diamond5.changeColor("white");
      diamond5.makeVisible();
      diamond5.moveTo(295, 170);  
      diamond5.changeSize(15,15);
      diamond4 = new Diamond(simCanvas);
      diamond4.changeColor("white");
      diamond4.makeVisible();
      diamond4.moveTo(295, 200); 
      diamond4.changeSize(15,15);
      diamond6 = new Diamond(simCanvas);
      diamond6.changeColor("white");
      diamond6.makeVisible();
      diamond6.moveTo(295, 230); 
      diamond6.changeSize(15,15);
      
      diamond10 = new Diamond(simCanvas);
      diamond10.changeColor("white");
      diamond10.makeVisible();
      diamond10.moveTo(330, 230); 
      diamond10.changeSize(15,15);
      diamond11 = new Diamond(simCanvas);
      diamond11.changeColor("white");
      diamond11.makeVisible();
      diamond11.moveTo(345, 200); 
      diamond11.changeSize(15,15);
      diamond12 = new Diamond(simCanvas);
      diamond12.changeColor("white");
      diamond12.makeVisible();
      diamond12.moveTo(360, 170); 
      diamond12.changeSize(15,15);
      diamond13 = new Diamond(simCanvas);
      diamond13.changeColor("white");
      diamond13.makeVisible();
      diamond13.moveTo(375, 200); 
      diamond13.changeSize(15,15);
      diamond14 = new Diamond(simCanvas);
      diamond14.changeColor("white");
      diamond14.makeVisible();
      diamond14.moveTo(390, 230); 
      diamond14.changeSize(15,15);
      
      diamond15 = new Diamond(simCanvas);
      diamond15.changeColor("white");
      diamond15.makeVisible();
      diamond15.moveTo(440, 170); 
      diamond15.changeSize(15,15);
      diamond16 = new Diamond(simCanvas);
      diamond16.changeColor("white");
      diamond16.makeVisible();
      diamond16.moveTo(420, 185); 
      diamond16.changeSize(15,15);
      diamond17 = new Diamond(simCanvas);
      diamond17.changeColor("white");
      diamond17.makeVisible();
      diamond17.moveTo(440, 200); 
      diamond17.changeSize(15,15);
      diamond18 = new Diamond(simCanvas);
      diamond18.changeColor("white");
      diamond18.makeVisible();
      diamond18.moveTo(455, 215); 
      diamond18.changeSize(15,15);
      diamond19= new Diamond(simCanvas);
      diamond19.changeColor("white");
      diamond19.makeVisible();
      diamond19.moveTo(430, 230); 
      diamond19.changeSize(15,15);
      
      diamond20= new Diamond(simCanvas);
      diamond20.changeColor("white");
      diamond20.makeVisible();
      diamond20.moveTo(485, 230); 
      diamond20.changeSize(15,15);
      diamond21= new Diamond(simCanvas);
      diamond21.changeColor("white");
      diamond21.makeVisible();
      diamond21.moveTo(500, 200); 
      diamond21.changeSize(15,15);
      diamond22= new Diamond(simCanvas);
      diamond22.changeColor("white");
      diamond22.makeVisible();
      diamond22.moveTo(515, 170); 
      diamond22.changeSize(15,15);
      diamond23= new Diamond(simCanvas);
      diamond23.changeColor("white");
      diamond23.makeVisible();
      diamond23.moveTo(530, 200); 
      diamond23.changeSize(15,15);
      diamond24= new Diamond(simCanvas);
      diamond24.changeColor("white");
      diamond24.makeVisible();
      diamond24.moveTo(545, 230); 
      diamond24.changeSize(15,15);
      
      
        
  } 
  public void moveSmallDistance()
  {
      //  check if the spacestation still in the canvas then move the direction of spaceSation
      if ((spaceStation.getXPosition() ) < canvas.getWidth() && (spaceStation.getYPosition() ) < canvas.getHeight()){
        spaceStation.moveDirection(xDistance, yDistance);
      }
      else //begin a new orbit
      {
        orbitCount++; //update orbitCount
        initXPosition -= 20;
        spaceStation.moveTo(initXPosition,initYPosition);
        }
     // the block of code below change the color of spaceStation based on the orbitCount
      if (orbitCount == 1)
      {
          spaceStation.changeColor("yellow");
      }
      if (orbitCount >= 2)
      {
        spaceStation.changeColor("red");
      }

  }
  public void reFuel()
  {
    spaceStation.changeColor("green");// change the color od the spaceStation to green by using changeColor method
    canvas.wait(3000); // using wait method to wait for 3 seconds
  }
  
 /**
  * setSpeed set the orbiting speed according to 'B', 'I', or 'A'.
  */
  public void setSpeed(char newSpeed)
  {
    if (newSpeed == 'B'){// Move slow if the player choose B
        xDistance = 4;
        yDistance = 4;
    }
    if (newSpeed == 'I'){// Move fast if the player choose I
        xDistance = 6;
        yDistance = 6;
    }
    if (newSpeed == 'A'){// Move fastes if the player choose A
        xDistance = 8;
        yDistance = 8;
    }
  }

  public int getXPosition()
  {
      return spaceStation.getXPosition(); // get and return the X position using accessor method 
  }

  public int getYPosition()
  {
      return spaceStation.getYPosition(); //get and return the Y position using accessor method 
  }
}
