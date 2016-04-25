package main.com.game;

import java.awt.Color;
import java.awt.Graphics;

//heads up display
public class HUD {
	
	public static int HEALTH = 100;
	
	public void tick() {
		HEALTH = Game.clamp(HEALTH, 0, 100);
	}
	
	public void render(Graphics g) {
		g.setColor(Color.gray);
		g.fillRect(12, 12, HEALTH* 2, 32);
		g.setColor(Color.green);
		g.fillRect(12, 12, HEALTH * 2, 32);
		g.setColor(Color.white);
		g.drawRect(12, 12, 200, 32);
	}
}

