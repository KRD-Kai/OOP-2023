package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet {
	int viewWidth = 500;
	int viewHeight = 500;

	int playerSpeed = 10;
	float playerWidth = 30;
	float playerX = random(0 + playerWidth, viewWidth - playerWidth);
	float playerY = viewHeight - playerWidth;

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
	}

	public void drawPlayer(float x, float y, float w) {
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
