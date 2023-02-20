package ie.tudublin;

import processing.core.PApplet;
import ddf.minim.AudioBuffer;
import ddf.minim.AudioInput;
import ddf.minim.AudioPlayer;
import ddf.minim.Minim;

public class audio1 extends PApplet
{

    Minim minim;
    AudioInput ai;
    AudioPlayer ap;
    AudioBuffer ab;


	public void settings()
	{
		size(1024, 500);
	}


	int frameSize=1024;
	public void setup() {
		colorMode(HSB);
		background(0);

		minim=new Minim(this);

		ai=minim.getLineIn(Minim.MONO,frameSize,44100,16);
		ab=ai.mix;

		smooth();
		
	}
	
	public void draw()
	{	
		background(0);
		stroke(255);

		float total=0;
		float half=height/2;
		float cGap=255/(float)ab.size();
		for(int i=0; i<ab.size(); i++)
		{
			total+=abs(ab.get(i));
			stroke(cGap*i,255,255);
			line(i,half,i,half+ab.get(i)*half);

		}
		float average=total/(float)ab.size();
		float r= average *200;

		lerpedR=lerp(lerpedR,r,0.1f);

		circle(100,200,lerpedR);

		//lerp(a,b,t);
		//map
		
	}
	float lerpedR=0;
}