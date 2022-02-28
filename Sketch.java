import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(110, 192, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    float flowerX = 120;
    float flowerY = 270;
    float petalSize = 50;
    float petalDistance = petalSize / 2;

    fill(255, 110, 146);

// upper-left petal
    ellipse(flowerX - petalDistance, flowerY - petalDistance,
        petalSize, petalSize);

// upper-right petal
    ellipse(flowerX + petalDistance, flowerY - petalDistance,
        petalSize, petalSize);

// lower-left petal
    ellipse(flowerX - petalDistance, flowerY + petalDistance,
        petalSize, petalSize);

// lower-right petal
    ellipse(flowerX + petalDistance, flowerY + petalDistance,
        petalSize, petalSize);

// center petal
    fill(202, 110, 255);
    ellipse(flowerX, flowerY,
        petalSize, petalSize);

// flower stem
    stroke(128);
    strokeWeight(3/2);
    line(120, 400, 120, 305);

// house
    fill(255, 231, 110);
    rect(220, 170, 200, 200);

// door
    fill(255, 152, 25);
    rect(240, 260, 70, 110);

// grass
    fill(50, 168, 84);
    rect(0, 370, 400, 30);

  }
  
  // define other methods down here.
}