package main.com.game;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Player extends GameObject{

	Random rand = new Random();
	
	public Player(int x, int y, ID id) {
		super(x, y, id);
		
	}

	public void tick() {
		x += velX;
		y += velY;
		
		x = Game.clamp(x,  0,  Game.WIDTH - 32);
		y = Game.clamp(y,  0,  Game.HEIGHT - 56);


	}

	public void render(Graphics g) {
//      when 2 players
//		if(id == ID.Player) g.setColor(Color.white);
//		else if(id == ID.Player2) g.setColor(Color.green);
		
		g.setColor(Color.white);
		g.fillRect(x, y, 32, 32);
	}

}
