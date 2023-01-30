package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		background(255,0,0);
		
	}
	
	public void draw()
	{	background(255,0,0);
		noStroke();
		fill(255,255,0);
		circle(250,250,400);
		fill(0,255,255);
		triangle(250,0,40,400,460,400);
		fill(150,150,150);
		ellipse(250,230,200,120);
		fill(mouseX,mouseY,mouseX);
		circle(mouseX,mouseY,100);
		//float eyeSize=map(mouseButton,0,height,100,150);
		//ellipse(width/2,height/2,eyeSize,eyeSize);

	}
}
