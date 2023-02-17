package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet {

	int mode = 0;

	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

	public void setup() {
		colorMode(HSB);
	}

	public void keyPressed() {

		mode = key - '0';
		println(mode);
	}

	float off = 0;

	public void draw() {
		background(0);
		//fill(255);
		noStroke();

		switch (mode) {
			case 0:
				int numCircles = (int) max(1, mouseX / 50.0f);
				float d = width / numCircles;
				for (int j = 0; j < numCircles; j++) {
					for (int i = 0; i < numCircles; i++) {
						float x = (d * 0.5f) + (d * i);
						float y = (d * 0.5f) + (d * j);
						float c = ((i + j) / ((numCircles - 1) * 2.0f)) * 255.0f;
						fill((c + off) % 256, 255, 255);
						circle(x, y, d);
					}
				}
				off += (mouseY / 50.0f);
				break;
			case 1:
				int numSquares=(int) (mouseX/10.0f);
				float w = width/(float)numSquares;
				float colour=255/(float)numSquares;
				for (int i=0;i<numSquares;i++)
				{
					fill(i*colour,255,255);
					rect(i*w,0,w,height);
				}

				break;
			case 2:
				stroke(255);
				float border = 50.0f;
				textAlign(CENTER,CENTER);
				textSize(15);
		
				int count = 10;
				float gap = (width - (border * 2.0f)) / (float) count;
				for(int i = -5 ; i <= 5 ; i ++)
				{
					
					float x = border + (gap * (i + 5));
					line(x, border, x, height - border);
					line(border, x, width - border, x);
					fill(255);
					text(i,x,(border*0.5f));
					text(i,(border*0.5f),x);
				}
				break;
				case 3:
					background(0);
					stroke(255,255,255);
					float circleX=width/2;
					float circleY=height/2;
					float radius =200;
					int points = (int)map(mouseX,1,width,5,20);
					int sides = points*2;
					float pointX=circleX;
					float pointY=circleY;
					for(int i=0;i<=sides;i++)
					{
						float r=(i%2==0)? radius:radius/2;
						float theta = map(i,0,sides,0,TWO_PI);
						float x=circleX+sin(theta)*r;
						float y = circleY+cos(theta)*r;
						line(pointX,pointY,x,y);
						pointX=x;
						pointY=y;
				

					}
				break;
				case 4:
				background(0);
				int squares = (int) (mouseX / 20.0f);
				float h = width / (float) squares;
				for (int i = 0; i < squares; i++) {
					noStroke();
					fill(map(i, 0, squares, 0, 255), 255, 255);
					float x = map(i, 0, squares, 0, width);
					rect(x, x, h, h);
					rect((width - h) - x, x, h, h);
				}
				break;

			default:
				break;
		}

	}
}
