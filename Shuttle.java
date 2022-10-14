/**
 * The shuttle hovers on the left edge of the canvas. It can be moved up or down by pressing
 * the 'K' or 'J' key accordingly. The shuttle has 5 fuelcells, which can be launched one at
 * a time using the space bar. If after launching all 5 fuelcells a refueling cannot occur.
 * 
 * @author Carl Singer, Brian Howard, David Maharry
 * @version September 2004
 * @version September 2005, revised by Carl Singer
 * @version September 2006, revised by Carl Singer
 */
public class Shuttle
{
  private Triangle shuttle; 
  private Canvas canvas;
  SpaceStation spaceStation;
  private String direction;    // Which way to move, "up" or "down"
  private int numberFuelCells; // Note: Up to 5 fuel cells can be created and launched

  /**
   * Constructor create a Shuttle object:
   *    Uses canvas when creating the shuttle object
   *    The shuttle object needs a color, an initial position,
   *    an initial direction of motion, and 5 fuel cells
   *    
   * @param canvas the canvas on which to render the shuttle
   */
  public Shuttle(Canvas theCanvas, SpaceStation theSpaceStation)
  {
      canvas = theCanvas;
      spaceStation = theSpaceStation;
      shuttle = new Triangle(canvas);
      numberFuelCells = 5; // set the number of fuelcells to 5 using assigment
      shuttle.makeVisible(); // Make the shuttle visible using makeVisible method
      shuttle.changeColor("black"); // set the color of shuttle to black using changColor method
      shuttle.moveTo(40, canvas.getHeight()/2); // move the shuttle to the middle of the left of the screen by get the height of the canvas and divide by 2            
  }

  /**
   * @param theDirection "up" or "down".
   */
  public void setDirection(String theDirection)
  {
      direction = theDirection; // changes the values of instance variables direction by using mutator method
  }

  /**
   * moveShuttle move the shuttle 10 pixels up or down
   *    in the direction specified by the direction instance field
   */
  public void moveSmallDistance()
  {
      if (direction.equals("up")){
          shuttle.moveDirection(0,-10); // Move the shuttle 10 pixels up by subtract the Y position 10 pixels if the direction is move up
      }
      else{
          shuttle.moveDirection(0,10);// Move the shuttle 10 pixels down by add 10 to the Y position if the direction is not moving up 
        }
  }

  /**
   * launchCell if there are more cells, create a new fuelCell and launch it
   * from the vertex of the shuttle. One is deducted from the number of available
   * cells.
   * 
   * @return cell a launched FuelCell object or null if the shuttle is out of cells
   */
  public FuelCell launchCell()
  {
      FuelCell cell = null;
      if(numberFuelCells > 0) 
        { 
            cell = new FuelCell(canvas, spaceStation); //// condition to check if there are still remaining fuelcells
            cell.launch(shuttle.getXPosition(), shuttle.getYPosition()); //// generate a new cell using lauch method. 
            numberFuelCells -= 1; // update number of cell
        }
      return cell;
  }    

  public void dock()
  {
    while(spaceStation.getXPosition() > shuttle.getXPosition()) { // set the condition to move the shuttle
        shuttle.moveDirection(10,0); //// move the shuttle's direction
        canvas.wait(30); 
    }
    
    shuttle.moveTo(spaceStation.getXPosition(), spaceStation.getYPosition());
    /// move the back to the left side of the window to start a new orbit
    canvas.wait(300);
    
    while(shuttle.getXPosition() > 30) { 
         shuttle.moveDirection(-10,0); 
         canvas.wait(30);
        } 
  }

  /**
   * getNumberFuelCells a simple accessor
   * @return the number of fuel cells remaining
   */
  public int getNumberFuelCells()
  {
      return numberFuelCells;
      // return number of cell using accessor method
  } 
        
}
