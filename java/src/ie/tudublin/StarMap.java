package ie.tudublin;

import processing.core.PApplet;
import processing.opengl.PSurfaceJOGL.DrawListener;

public class StarMap extends PApplet
{
	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		colorMode(HSB);
		background(0);
		stroke(255);
		draw();
		smooth();
		
	}

	public void drawGrid()
	{
		float border=50.0f;
		int count=10;
		float gap=width-(border*2.0f)/(float)count;
		for(int i=-5; i<=5; i++)	
		{
			float x = border +(gap*(i+5));
			line(x,border,x,height-border);
			line(border,x,width-border,x);
			//fill(0,255,0);
			//text(i,x,border*0.5f);

		}
	}
		
	public void draw()
	{	
		strokeWeight(2);	
		drawGrid();
		
	}
}
