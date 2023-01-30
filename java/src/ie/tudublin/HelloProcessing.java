package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		
		
	}
	
	public void draw()
	{	stroke(255);
		line(10,10,100,100); //x1,y1,x2,y2
		circle(300,250,70);//cx,cy,radius
		fill(255,0,0);
		rect(10,300,20,100); //topleft x, topleft y, w, h
		stroke(127);
		fill(255,255,0);
		noStroke();
		noFill();
		strokeWeight(1);
		triangle(40,90,300,20,80,70);
		fill(0,0,255);
	}
}
