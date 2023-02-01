package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet {
	int viewWidth = 500;
	int viewHeight = 500;

	int playerSpeed = 10;
	float playerWidth = 30;
	float playerX = random(0 + playerWidth, viewWidth - playerWidth);
	float playerY = viewHeight - playerWidth;

	int bugSpeed = 50;
	float bugWidth = 20;
	float bugX = random(0 + bugWidth, viewWidth - bugWidth);
	float bugY = 0;

	public void settings() {
		size(viewWidth, viewHeight);
	}

	public void setup() {
		colorMode(HSB);
		background(0);
	}

	float x1, y1, x2, y2;
	float x1dir, x2dir, y1dir, y2dir;
	float c = 0;

	public void draw() {
		background(0);
		drawPlayer(playerX, playerY, playerWidth);
		if ((frameCount % 20) == 0) {
			float jump = random(-bugSpeed, bugSpeed);
			if (bugX - jump > 0 && bugX - jump < (viewWidth - bugWidth)) {
				bugX -= jump;
			}

		}
		if (frameCount % 60 == 0) {
			bugY += 15;

		}
		drawBug(bugX, bugY, bugWidth);
	}

	public void drawPlayer(float x, float y, float w) {
		rect(x, y, w, w);
	}

	public void drawBug(float x, float y, float w) {
		rect(x, y, w, w);
	}

	public void keyPressed() {
		if (keyCode == LEFT) {
			if (playerX > 0 + playerSpeed)
				playerX -= playerSpeed;
		}
		if (keyCode == RIGHT) {
			if (playerX < (viewWidth - playerWidth))
				playerX += playerSpeed;
		}
		if (key == ' ') {
			System.out.println("SPACE key pressed");
		}
	}
}
