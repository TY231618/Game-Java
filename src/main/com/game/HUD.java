package main.com.game;

import java.awt.Color;
import java.awt.Graphics;

//heads up display
public class HUD {
	
	public static int HEALTH = 100;
	private int greenValue = 255;
	private int score = 0;
	private int level = 1;
	
	public void tick() {
		HEALTH = Game.clamp(HEALTH, 0, 100);
		greenValue = Game.clamp(greenValue, 0, 255);
		
		greenValue = HEALTH * 2;
		
		score++;
	}
	
	public void render(Graphics g) {
		g.setColor(Color.gray);
		g.fillRect(12, 12, HEALTH* 2, 32);
		g.setColor(new Color(75, greenValue, 0));
		g.fillRect(12, 12, HEALTH * 2, 32);
		g.setColor(Color.white);
		g.drawRect(12, 12, 200, 32);
		
		g.drawString("Score: " + score, 12, 64);
		g.drawString("Level: " + level, 12, 80);

	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	
	public int getLevel() {
		return level;
	}
}

