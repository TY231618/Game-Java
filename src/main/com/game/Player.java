package main.com.game;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Player extends GameObject{

	Random rand = new Random();
	
	public Player(int x, int y, ID id) {
		super(x, y, id);
		
		velX = rand.nextInt(5) + 1;
		velY = rand.nextInt(5);
	}

	public void tick() {
		x += velX;
		y += velY;
	}

	public void render(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x, y, 32, 32);
	}

}
