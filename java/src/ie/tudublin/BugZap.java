package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet {
	int viewWidth = 500;
	int viewHeight = 500;

	float playerWidth = 50;
	float playerX = random(0, viewWidth);
	float playerY = viewHeight - playerWidth;

	public void settings() {
		size(viewWidth, viewHeight);
	}

	public void setup() {
		colorMode(HSB);
		background(0);

		x1 = random(0, width);
		x2 = random(0, width);
		y1 = random(0, height);
		y2 = random(0, height);

		float range = 5;

		x1dir = random(-range, range);
		x2dir = random(-range, range);
		y1dir = random(-range, range);
		y2dir = random(-range, range);

		smooth();

	}

	float x1, y1, x2, y2;
	float x1dir, x2dir, y1dir, y2dir;
	float c = 0;

	public void draw() {
		drawPlayer(playerX, playerY, playerWidth);
	}

	public void drawPlayer(float x, float y, float w) {
		rect(x, y, w, w);
	}
}
